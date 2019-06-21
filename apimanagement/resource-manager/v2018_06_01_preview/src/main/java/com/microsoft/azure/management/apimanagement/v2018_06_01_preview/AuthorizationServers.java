/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.AuthorizationServersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AuthorizationServers.
 */
public interface AuthorizationServers extends SupportsCreating<AuthorizationServerContract.DefinitionStages.Blank>, HasInner<AuthorizationServersInner> {
    /**
     * Lists a collection of authorization servers defined within a service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AuthorizationServerContract> listByServiceAsync(final String resourceGroupName, final String serviceName);

    /**
     * Gets the entity state (Etag) version of the authorizationServer specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param authsid Identifier of the authorization server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEntityTagAsync(String resourceGroupName, String serviceName, String authsid);

    /**
     * Gets the details of the authorization server specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param authsid Identifier of the authorization server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AuthorizationServerContract> getAsync(String resourceGroupName, String serviceName, String authsid);

    /**
     * Deletes specific authorization server instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param authsid Identifier of the authorization server.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String authsid, String ifMatch);

}