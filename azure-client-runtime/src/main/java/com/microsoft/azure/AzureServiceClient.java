/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure;

import com.google.common.hash.Hashing;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.azure.v2.policy.AzureTokenCredentialsPolicy;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.v2.http.ChannelHandlerConfig;
import com.microsoft.rest.v2.http.HttpClient;
import com.microsoft.rest.v2.http.HttpRequest;
import com.microsoft.rest.v2.http.HttpResponse;
import com.microsoft.rest.v2.policy.RequestPolicy;
import com.microsoft.rest.v2.policy.RequestPolicyChain;
import com.microsoft.rest.v2.http.RxNettyClient;
import com.microsoft.rest.v2.policy.UseOtherHostPolicy;
import io.netty.channel.ChannelHandler;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import rx.Single;
import rx.functions.Func0;

import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * ServiceClient is the abstraction for accessing REST operations and their payload data types.
 */
public abstract class AzureServiceClient extends ServiceClient {
    protected AzureServiceClient(String baseUrl, ServiceClientCredentials credentials) {
        this(baseUrl, credentials, new OkHttpClient.Builder(), new Retrofit.Builder());
    }

    /**
     * Initializes a new instance of the ServiceClient class.
     *
     * @param baseUrl the service base uri
     * @param credentials the credentials
     * @param clientBuilder the http client builder
     * @param restBuilder the retrofit rest client builder
     */
    protected AzureServiceClient(String baseUrl, ServiceClientCredentials credentials, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this(new RestClient.Builder(clientBuilder, restBuilder)
                .withBaseUrl(baseUrl)
                .withCredentials(credentials)
                .withSerializerAdapter(new AzureJacksonAdapter())
                .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
                .build());
    }

    /**
     * Initializes a new instance of the ServiceClient class.
     *
     * @param restClient the REST client
     */
    protected AzureServiceClient(RestClient restClient) {
        super(restClient);

        final AzureTokenCredentials credentials = (AzureTokenCredentials) restClient().credentials();
        // TODO: tests, refactoring-- less hacky way of getting credentials
        final RxNettyClient rxnClient = new RxNettyClient();
        rpHttpClient = new RequestPolicyChain(new AzureTokenCredentialsPolicy.Factory(credentials), new RequestPolicy.Factory() {
            @Override
            public RequestPolicy create(RequestPolicy next) {
                return new RequestPolicy() {
                    @Override
                    public Single<HttpResponse> sendAsync(HttpRequest request) {
                        return rxnClient.sendAsync(request);
                    }
                };
            }
        });
    }

    private final HttpClient rpHttpClient;
    /**
     * @return the RestProxy HTTP client.
     */
    public HttpClient rpHttpClient() {
        return rpHttpClient;
    }

    /**
     * The default User-Agent header. Override this method to override the user agent.
     *
     * @return the user agent string.
     */
    public String userAgent() {
        return String.format("Azure-SDK-For-Java/%s OS:%s MacAddressHash:%s Java:%s",
                getClass().getPackage().getImplementationVersion(),
                OS,
                MAC_ADDRESS_HASH,
                JAVA_VERSION);
    }

    private static final String MAC_ADDRESS_HASH;
    private static final String OS;
    private static final String JAVA_VERSION;

    static {
        OS = System.getProperty("os.name") + "/" + System.getProperty("os.version");
        String macAddress = "Unknown";
        try {
            Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
            while (networks.hasMoreElements()) {
                NetworkInterface network = networks.nextElement();
                byte[] mac = network.getHardwareAddress();

                if (mac != null) {
                    macAddress = Hashing.sha256().hashBytes(mac).toString();
                    break;
                }
            }
        } catch (Throwable t) {
            // It's okay ignore mac address hash telemetry
        }
        MAC_ADDRESS_HASH = macAddress;
        String version = System.getProperty("java.version");
        JAVA_VERSION = version != null ? version : "Unknown";
    }
}
