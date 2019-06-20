/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.CSRPErrorException;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.GetOperationResultByRegionHeaders;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the VMwareCloudSimpleClientImpl class.
 */
public class VMwareCloudSimpleClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private VMwareCloudSimpleClientService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Client API version. */
    private String apiVersion;

    /**
     * Gets Client API version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** referer url. */
    private String referer;

    /**
     * Gets referer url.
     *
     * @return the referer value.
     */
    public String referer() {
        return this.referer;
    }

    /**
     * Sets referer url.
     *
     * @param referer the referer value.
     * @return the service client itself
     */
    public VMwareCloudSimpleClientImpl withReferer(String referer) {
        this.referer = referer;
        return this;
    }

    /** The region Id (westus, eastus). */
    private String regionId;

    /**
     * Gets The region Id (westus, eastus).
     *
     * @return the regionId value.
     */
    public String regionId() {
        return this.regionId;
    }

    /**
     * Sets The region Id (westus, eastus).
     *
     * @param regionId the regionId value.
     * @return the service client itself
     */
    public VMwareCloudSimpleClientImpl withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /** The subscription ID. */
    private String subscriptionId;

    /**
     * Gets The subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public VMwareCloudSimpleClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public VMwareCloudSimpleClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public VMwareCloudSimpleClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public VMwareCloudSimpleClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The AvailableOperationsInner object to access its operations.
     */
    private AvailableOperationsInner availableOperations;

    /**
     * Gets the AvailableOperationsInner object to access its operations.
     * @return the AvailableOperationsInner object.
     */
    public AvailableOperationsInner availableOperations() {
        return this.availableOperations;
    }

    /**
     * The DedicatedCloudNodesInner object to access its operations.
     */
    private DedicatedCloudNodesInner dedicatedCloudNodes;

    /**
     * Gets the DedicatedCloudNodesInner object to access its operations.
     * @return the DedicatedCloudNodesInner object.
     */
    public DedicatedCloudNodesInner dedicatedCloudNodes() {
        return this.dedicatedCloudNodes;
    }

    /**
     * The DedicatedCloudServicesInner object to access its operations.
     */
    private DedicatedCloudServicesInner dedicatedCloudServices;

    /**
     * Gets the DedicatedCloudServicesInner object to access its operations.
     * @return the DedicatedCloudServicesInner object.
     */
    public DedicatedCloudServicesInner dedicatedCloudServices() {
        return this.dedicatedCloudServices;
    }

    /**
     * The SkusAvailabilityWithinRegionsInner object to access its operations.
     */
    private SkusAvailabilityWithinRegionsInner skusAvailabilityWithinRegions;

    /**
     * Gets the SkusAvailabilityWithinRegionsInner object to access its operations.
     * @return the SkusAvailabilityWithinRegionsInner object.
     */
    public SkusAvailabilityWithinRegionsInner skusAvailabilityWithinRegions() {
        return this.skusAvailabilityWithinRegions;
    }

    /**
     * The PrivateCloudByRegionsInner object to access its operations.
     */
    private PrivateCloudByRegionsInner privateCloudByRegions;

    /**
     * Gets the PrivateCloudByRegionsInner object to access its operations.
     * @return the PrivateCloudByRegionsInner object.
     */
    public PrivateCloudByRegionsInner privateCloudByRegions() {
        return this.privateCloudByRegions;
    }

    /**
     * The ResourcePoolsByPCsInner object to access its operations.
     */
    private ResourcePoolsByPCsInner resourcePoolsByPCs;

    /**
     * Gets the ResourcePoolsByPCsInner object to access its operations.
     * @return the ResourcePoolsByPCsInner object.
     */
    public ResourcePoolsByPCsInner resourcePoolsByPCs() {
        return this.resourcePoolsByPCs;
    }

    /**
     * The ResourcePoolByPCsInner object to access its operations.
     */
    private ResourcePoolByPCsInner resourcePoolByPCs;

    /**
     * Gets the ResourcePoolByPCsInner object to access its operations.
     * @return the ResourcePoolByPCsInner object.
     */
    public ResourcePoolByPCsInner resourcePoolByPCs() {
        return this.resourcePoolByPCs;
    }

    /**
     * The VirtualMachineTemplatesByPCsInner object to access its operations.
     */
    private VirtualMachineTemplatesByPCsInner virtualMachineTemplatesByPCs;

    /**
     * Gets the VirtualMachineTemplatesByPCsInner object to access its operations.
     * @return the VirtualMachineTemplatesByPCsInner object.
     */
    public VirtualMachineTemplatesByPCsInner virtualMachineTemplatesByPCs() {
        return this.virtualMachineTemplatesByPCs;
    }

    /**
     * The VirtualMachineTemplateByPCsInner object to access its operations.
     */
    private VirtualMachineTemplateByPCsInner virtualMachineTemplateByPCs;

    /**
     * Gets the VirtualMachineTemplateByPCsInner object to access its operations.
     * @return the VirtualMachineTemplateByPCsInner object.
     */
    public VirtualMachineTemplateByPCsInner virtualMachineTemplateByPCs() {
        return this.virtualMachineTemplateByPCs;
    }

    /**
     * The VirtualNetworksByPCsInner object to access its operations.
     */
    private VirtualNetworksByPCsInner virtualNetworksByPCs;

    /**
     * Gets the VirtualNetworksByPCsInner object to access its operations.
     * @return the VirtualNetworksByPCsInner object.
     */
    public VirtualNetworksByPCsInner virtualNetworksByPCs() {
        return this.virtualNetworksByPCs;
    }

    /**
     * The VirtualNetworkByPCsInner object to access its operations.
     */
    private VirtualNetworkByPCsInner virtualNetworkByPCs;

    /**
     * Gets the VirtualNetworkByPCsInner object to access its operations.
     * @return the VirtualNetworkByPCsInner object.
     */
    public VirtualNetworkByPCsInner virtualNetworkByPCs() {
        return this.virtualNetworkByPCs;
    }

    /**
     * The UsagesWithinRegionsInner object to access its operations.
     */
    private UsagesWithinRegionsInner usagesWithinRegions;

    /**
     * Gets the UsagesWithinRegionsInner object to access its operations.
     * @return the UsagesWithinRegionsInner object.
     */
    public UsagesWithinRegionsInner usagesWithinRegions() {
        return this.usagesWithinRegions;
    }

    /**
     * The VirtualMachinesInner object to access its operations.
     */
    private VirtualMachinesInner virtualMachines;

    /**
     * Gets the VirtualMachinesInner object to access its operations.
     * @return the VirtualMachinesInner object.
     */
    public VirtualMachinesInner virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Initializes an instance of VMwareCloudSimpleClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public VMwareCloudSimpleClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of VMwareCloudSimpleClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public VMwareCloudSimpleClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of VMwareCloudSimpleClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public VMwareCloudSimpleClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2019-04-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.availableOperations = new AvailableOperationsInner(restClient().retrofit(), this);
        this.dedicatedCloudNodes = new DedicatedCloudNodesInner(restClient().retrofit(), this);
        this.dedicatedCloudServices = new DedicatedCloudServicesInner(restClient().retrofit(), this);
        this.skusAvailabilityWithinRegions = new SkusAvailabilityWithinRegionsInner(restClient().retrofit(), this);
        this.privateCloudByRegions = new PrivateCloudByRegionsInner(restClient().retrofit(), this);
        this.resourcePoolsByPCs = new ResourcePoolsByPCsInner(restClient().retrofit(), this);
        this.resourcePoolByPCs = new ResourcePoolByPCsInner(restClient().retrofit(), this);
        this.virtualMachineTemplatesByPCs = new VirtualMachineTemplatesByPCsInner(restClient().retrofit(), this);
        this.virtualMachineTemplateByPCs = new VirtualMachineTemplateByPCsInner(restClient().retrofit(), this);
        this.virtualNetworksByPCs = new VirtualNetworksByPCsInner(restClient().retrofit(), this);
        this.virtualNetworkByPCs = new VirtualNetworkByPCsInner(restClient().retrofit(), this);
        this.usagesWithinRegions = new UsagesWithinRegionsInner(restClient().retrofit(), this);
        this.virtualMachines = new VirtualMachinesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "VMwareCloudSimpleClient", "2019-04-01");
    }

    private void initializeService() {
        service = restClient().retrofit().create(VMwareCloudSimpleClientService.class);
    }

    /**
     * The interface defining all the services for VMwareCloudSimpleClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VMwareCloudSimpleClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VMwareCloudSimpleClient getOperationResultByRegion" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.VMwareCloudSimple/locations/{regionId}/operationResults/{operationId}")
        Observable<Response<ResponseBody>> getOperationResultByRegion(@Path("subscriptionId") String subscriptionId, @Path("regionId") String regionId, @Path("operationId") String operationId, @Query("api-version") String apiVersion, @Header("Referer") String referer, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VMwareCloudSimpleClient getPrivateCloud" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.VMwareCloudSimple/locations/{regionId}/privateClouds/{pcName}")
        Observable<Response<ResponseBody>> getPrivateCloud(@Path("subscriptionId") String subscriptionId, @Path("pcName") String pcName, @Path("regionId") String regionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Implements get of async operation.
     * Return an async operation.
     *
     * @param operationId operation id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationResourceInner object if successful.
     */
    public OperationResourceInner getOperationResultByRegion(String operationId) {
        return getOperationResultByRegionWithServiceResponseAsync(operationId).toBlocking().single().body();
    }

    /**
     * Implements get of async operation.
     * Return an async operation.
     *
     * @param operationId operation id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationResourceInner> getOperationResultByRegionAsync(String operationId, final ServiceCallback<OperationResourceInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(getOperationResultByRegionWithServiceResponseAsync(operationId), serviceCallback);
    }

    /**
     * Implements get of async operation.
     * Return an async operation.
     *
     * @param operationId operation id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationResourceInner object
     */
    public Observable<OperationResourceInner> getOperationResultByRegionAsync(String operationId) {
        return getOperationResultByRegionWithServiceResponseAsync(operationId).map(new Func1<ServiceResponseWithHeaders<OperationResourceInner, GetOperationResultByRegionHeaders>, OperationResourceInner>() {
            @Override
            public OperationResourceInner call(ServiceResponseWithHeaders<OperationResourceInner, GetOperationResultByRegionHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Implements get of async operation.
     * Return an async operation.
     *
     * @param operationId operation id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationResourceInner object
     */
    public Observable<ServiceResponseWithHeaders<OperationResourceInner, GetOperationResultByRegionHeaders>> getOperationResultByRegionWithServiceResponseAsync(String operationId) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (this.regionId() == null) {
            throw new IllegalArgumentException("Parameter this.regionId() is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        if (this.referer() == null) {
            throw new IllegalArgumentException("Parameter this.referer() is required and cannot be null.");
        }
        return service.getOperationResultByRegion(this.subscriptionId(), this.regionId(), operationId, this.apiVersion(), this.referer(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<OperationResourceInner, GetOperationResultByRegionHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<OperationResourceInner, GetOperationResultByRegionHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<OperationResourceInner, GetOperationResultByRegionHeaders> clientResponse = getOperationResultByRegionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<OperationResourceInner, GetOperationResultByRegionHeaders> getOperationResultByRegionDelegate(Response<ResponseBody> response) throws CSRPErrorException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<OperationResourceInner, CSRPErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<OperationResourceInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CSRPErrorException.class)
                .buildWithHeaders(response, GetOperationResultByRegionHeaders.class);
    }

    /**
     * Implements private cloud GET method.
     * Returns private cloud by its name.
     *
     * @param pcName The private cloud name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateCloudInner object if successful.
     */
    public PrivateCloudInner getPrivateCloud(String pcName) {
        return getPrivateCloudWithServiceResponseAsync(pcName).toBlocking().single().body();
    }

    /**
     * Implements private cloud GET method.
     * Returns private cloud by its name.
     *
     * @param pcName The private cloud name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateCloudInner> getPrivateCloudAsync(String pcName, final ServiceCallback<PrivateCloudInner> serviceCallback) {
        return ServiceFuture.fromResponse(getPrivateCloudWithServiceResponseAsync(pcName), serviceCallback);
    }

    /**
     * Implements private cloud GET method.
     * Returns private cloud by its name.
     *
     * @param pcName The private cloud name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateCloudInner object
     */
    public Observable<PrivateCloudInner> getPrivateCloudAsync(String pcName) {
        return getPrivateCloudWithServiceResponseAsync(pcName).map(new Func1<ServiceResponse<PrivateCloudInner>, PrivateCloudInner>() {
            @Override
            public PrivateCloudInner call(ServiceResponse<PrivateCloudInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Implements private cloud GET method.
     * Returns private cloud by its name.
     *
     * @param pcName The private cloud name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateCloudInner object
     */
    public Observable<ServiceResponse<PrivateCloudInner>> getPrivateCloudWithServiceResponseAsync(String pcName) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (pcName == null) {
            throw new IllegalArgumentException("Parameter pcName is required and cannot be null.");
        }
        if (this.regionId() == null) {
            throw new IllegalArgumentException("Parameter this.regionId() is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.getPrivateCloud(this.subscriptionId(), pcName, this.regionId(), this.apiVersion(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateCloudInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateCloudInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateCloudInner> clientResponse = getPrivateCloudDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateCloudInner> getPrivateCloudDelegate(Response<ResponseBody> response) throws CSRPErrorException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<PrivateCloudInner, CSRPErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<PrivateCloudInner>() { }.getType())
                .registerError(CSRPErrorException.class)
                .build(response);
    }

}
