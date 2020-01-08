/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BackupWorkloadItems.
 */
public class BackupWorkloadItemsInner {
    /** The Retrofit service to perform REST calls. */
    private BackupWorkloadItemsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupWorkloadItemsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupWorkloadItemsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(BackupWorkloadItemsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupWorkloadItems to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupWorkloadItemsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.BackupWorkloadItems list" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/items")
        Observable<Response<ResponseBody>> list(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Path("containerName") String containerName, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Query("$skipToken") String skipToken, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.BackupWorkloadItems listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkloadItemResourceInner&gt; object if successful.
     */
    public PagedList<WorkloadItemResourceInner> list(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName) {
        ServiceResponse<Page<WorkloadItemResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName).toBlocking().single();
        return new PagedList<WorkloadItemResourceInner>(response.body()) {
            @Override
            public Page<WorkloadItemResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkloadItemResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final ListOperationCallback<WorkloadItemResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName),
            new Func1<String, Observable<ServiceResponse<Page<WorkloadItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadItemResourceInner&gt; object
     */
    public Observable<Page<WorkloadItemResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName)
            .map(new Func1<ServiceResponse<Page<WorkloadItemResourceInner>>, Page<WorkloadItemResourceInner>>() {
                @Override
                public Page<WorkloadItemResourceInner> call(ServiceResponse<Page<WorkloadItemResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadItemResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName) {
        return listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName)
            .concatMap(new Func1<ServiceResponse<Page<WorkloadItemResourceInner>>, Observable<ServiceResponse<Page<WorkloadItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> call(ServiceResponse<Page<WorkloadItemResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkloadItemResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (fabricName == null) {
            throw new IllegalArgumentException("Parameter fabricName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        final String skipToken = null;
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, this.client.apiVersion(), filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkloadItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkloadItemResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkloadItemResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkloadItemResourceInner&gt; object if successful.
     */
    public PagedList<WorkloadItemResourceInner> list(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String filter, final String skipToken) {
        ServiceResponse<Page<WorkloadItemResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, filter, skipToken).toBlocking().single();
        return new PagedList<WorkloadItemResourceInner>(response.body()) {
            @Override
            public Page<WorkloadItemResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkloadItemResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String filter, final String skipToken, final ListOperationCallback<WorkloadItemResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, filter, skipToken),
            new Func1<String, Observable<ServiceResponse<Page<WorkloadItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadItemResourceInner&gt; object
     */
    public Observable<Page<WorkloadItemResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String filter, final String skipToken) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, fabricName, containerName, filter, skipToken)
            .map(new Func1<ServiceResponse<Page<WorkloadItemResourceInner>>, Page<WorkloadItemResourceInner>>() {
                @Override
                public Page<WorkloadItemResourceInner> call(ServiceResponse<Page<WorkloadItemResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadItemResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String filter, final String skipToken) {
        return listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, filter, skipToken)
            .concatMap(new Func1<ServiceResponse<Page<WorkloadItemResourceInner>>, Observable<ServiceResponse<Page<WorkloadItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> call(ServiceResponse<Page<WorkloadItemResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
    ServiceResponse<PageImpl<WorkloadItemResourceInner>> * @param vaultName The name of the recovery services vault.
    ServiceResponse<PageImpl<WorkloadItemResourceInner>> * @param resourceGroupName The name of the resource group where the recovery services vault is present.
    ServiceResponse<PageImpl<WorkloadItemResourceInner>> * @param fabricName Fabric name associated with the container.
    ServiceResponse<PageImpl<WorkloadItemResourceInner>> * @param containerName Name of the container.
    ServiceResponse<PageImpl<WorkloadItemResourceInner>> * @param filter OData filter options.
    ServiceResponse<PageImpl<WorkloadItemResourceInner>> * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkloadItemResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName, final String filter, final String skipToken) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (fabricName == null) {
            throw new IllegalArgumentException("Parameter fabricName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), fabricName, containerName, this.client.apiVersion(), filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkloadItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkloadItemResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkloadItemResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<WorkloadItemResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<WorkloadItemResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<WorkloadItemResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkloadItemResourceInner&gt; object if successful.
     */
    public PagedList<WorkloadItemResourceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<WorkloadItemResourceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<WorkloadItemResourceInner>(response.body()) {
            @Override
            public Page<WorkloadItemResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkloadItemResourceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<WorkloadItemResourceInner>> serviceFuture, final ListOperationCallback<WorkloadItemResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<WorkloadItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadItemResourceInner&gt; object
     */
    public Observable<Page<WorkloadItemResourceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<WorkloadItemResourceInner>>, Page<WorkloadItemResourceInner>>() {
                @Override
                public Page<WorkloadItemResourceInner> call(ServiceResponse<Page<WorkloadItemResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkloadItemResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<WorkloadItemResourceInner>>, Observable<ServiceResponse<Page<WorkloadItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> call(ServiceResponse<Page<WorkloadItemResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the pagination parameters.
     *
    ServiceResponse<PageImpl<WorkloadItemResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkloadItemResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkloadItemResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkloadItemResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkloadItemResourceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkloadItemResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<WorkloadItemResourceInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<WorkloadItemResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<WorkloadItemResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}