/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.consumption.v2019_01_01.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
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
 * An instance of this class provides access to all the operations defined
 * in AggregatedCosts.
 */
public class AggregatedCostsInner {
    /** The Retrofit service to perform REST calls. */
    private AggregatedCostsService service;
    /** The service client containing this operation class. */
    private ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of AggregatedCostsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AggregatedCostsInner(Retrofit retrofit, ConsumptionManagementClientImpl client) {
        this.service = retrofit.create(AggregatedCostsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AggregatedCosts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AggregatedCostsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2019_01_01.AggregatedCosts getByManagementGroup" })
        @GET("providers/Microsoft.Management/managementGroups/{managementGroupId}/providers/Microsoft.Consumption/aggregatedcost")
        Observable<Response<ResponseBody>> getByManagementGroup(@Path("managementGroupId") String managementGroupId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2019_01_01.AggregatedCosts getForBillingPeriodByManagementGroup" })
        @GET("providers/Microsoft.Management/managementGroups/{managementGroupId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}/Microsoft.Consumption/aggregatedcost")
        Observable<Response<ResponseBody>> getForBillingPeriodByManagementGroup(@Path("managementGroupId") String managementGroupId, @Path("billingPeriodName") String billingPeriodName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagementGroupAggregatedCostResultInner object if successful.
     */
    public ManagementGroupAggregatedCostResultInner getByManagementGroup(String managementGroupId) {
        return getByManagementGroupWithServiceResponseAsync(managementGroupId).toBlocking().single().body();
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagementGroupAggregatedCostResultInner> getByManagementGroupAsync(String managementGroupId, final ServiceCallback<ManagementGroupAggregatedCostResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByManagementGroupWithServiceResponseAsync(managementGroupId), serviceCallback);
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementGroupAggregatedCostResultInner object
     */
    public Observable<ManagementGroupAggregatedCostResultInner> getByManagementGroupAsync(String managementGroupId) {
        return getByManagementGroupWithServiceResponseAsync(managementGroupId).map(new Func1<ServiceResponse<ManagementGroupAggregatedCostResultInner>, ManagementGroupAggregatedCostResultInner>() {
            @Override
            public ManagementGroupAggregatedCostResultInner call(ServiceResponse<ManagementGroupAggregatedCostResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementGroupAggregatedCostResultInner object
     */
    public Observable<ServiceResponse<ManagementGroupAggregatedCostResultInner>> getByManagementGroupWithServiceResponseAsync(String managementGroupId) {
        if (managementGroupId == null) {
            throw new IllegalArgumentException("Parameter managementGroupId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.getByManagementGroup(managementGroupId, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagementGroupAggregatedCostResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagementGroupAggregatedCostResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagementGroupAggregatedCostResultInner> clientResponse = getByManagementGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param filter May be used to filter aggregated cost by properties/usageStart (Utc time), properties/usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagementGroupAggregatedCostResultInner object if successful.
     */
    public ManagementGroupAggregatedCostResultInner getByManagementGroup(String managementGroupId, String filter) {
        return getByManagementGroupWithServiceResponseAsync(managementGroupId, filter).toBlocking().single().body();
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param filter May be used to filter aggregated cost by properties/usageStart (Utc time), properties/usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagementGroupAggregatedCostResultInner> getByManagementGroupAsync(String managementGroupId, String filter, final ServiceCallback<ManagementGroupAggregatedCostResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByManagementGroupWithServiceResponseAsync(managementGroupId, filter), serviceCallback);
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param filter May be used to filter aggregated cost by properties/usageStart (Utc time), properties/usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementGroupAggregatedCostResultInner object
     */
    public Observable<ManagementGroupAggregatedCostResultInner> getByManagementGroupAsync(String managementGroupId, String filter) {
        return getByManagementGroupWithServiceResponseAsync(managementGroupId, filter).map(new Func1<ServiceResponse<ManagementGroupAggregatedCostResultInner>, ManagementGroupAggregatedCostResultInner>() {
            @Override
            public ManagementGroupAggregatedCostResultInner call(ServiceResponse<ManagementGroupAggregatedCostResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param filter May be used to filter aggregated cost by properties/usageStart (Utc time), properties/usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementGroupAggregatedCostResultInner object
     */
    public Observable<ServiceResponse<ManagementGroupAggregatedCostResultInner>> getByManagementGroupWithServiceResponseAsync(String managementGroupId, String filter) {
        if (managementGroupId == null) {
            throw new IllegalArgumentException("Parameter managementGroupId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByManagementGroup(managementGroupId, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagementGroupAggregatedCostResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagementGroupAggregatedCostResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagementGroupAggregatedCostResultInner> clientResponse = getByManagementGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagementGroupAggregatedCostResultInner> getByManagementGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagementGroupAggregatedCostResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagementGroupAggregatedCostResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagementGroupAggregatedCostResultInner object if successful.
     */
    public ManagementGroupAggregatedCostResultInner getForBillingPeriodByManagementGroup(String managementGroupId, String billingPeriodName) {
        return getForBillingPeriodByManagementGroupWithServiceResponseAsync(managementGroupId, billingPeriodName).toBlocking().single().body();
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagementGroupAggregatedCostResultInner> getForBillingPeriodByManagementGroupAsync(String managementGroupId, String billingPeriodName, final ServiceCallback<ManagementGroupAggregatedCostResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getForBillingPeriodByManagementGroupWithServiceResponseAsync(managementGroupId, billingPeriodName), serviceCallback);
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementGroupAggregatedCostResultInner object
     */
    public Observable<ManagementGroupAggregatedCostResultInner> getForBillingPeriodByManagementGroupAsync(String managementGroupId, String billingPeriodName) {
        return getForBillingPeriodByManagementGroupWithServiceResponseAsync(managementGroupId, billingPeriodName).map(new Func1<ServiceResponse<ManagementGroupAggregatedCostResultInner>, ManagementGroupAggregatedCostResultInner>() {
            @Override
            public ManagementGroupAggregatedCostResultInner call(ServiceResponse<ManagementGroupAggregatedCostResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementGroupAggregatedCostResultInner object
     */
    public Observable<ServiceResponse<ManagementGroupAggregatedCostResultInner>> getForBillingPeriodByManagementGroupWithServiceResponseAsync(String managementGroupId, String billingPeriodName) {
        if (managementGroupId == null) {
            throw new IllegalArgumentException("Parameter managementGroupId is required and cannot be null.");
        }
        if (billingPeriodName == null) {
            throw new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getForBillingPeriodByManagementGroup(managementGroupId, billingPeriodName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagementGroupAggregatedCostResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagementGroupAggregatedCostResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagementGroupAggregatedCostResultInner> clientResponse = getForBillingPeriodByManagementGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagementGroupAggregatedCostResultInner> getForBillingPeriodByManagementGroupDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagementGroupAggregatedCostResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagementGroupAggregatedCostResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}