/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.OperationStatus;
import java.util.List;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.ErrorResponseWrapper;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.ClusterType;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.StorageAccountProperties;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.ContainerRegistryProperties;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.AcsClusterProperties;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.AppInsightsProperties;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.GlobalServiceConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Instance of an Azure ML Operationalization Cluster resource.
 */
@JsonFlatten
public class OperationalizationClusterInner extends Resource {
    /**
     * The description of the cluster.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The date and time when the cluster was created.
     */
    @JsonProperty(value = "properties.createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdOn;

    /**
     * The date and time when the cluster was last modified.
     */
    @JsonProperty(value = "properties.modifiedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime modifiedOn;

    /**
     * The provision state of the cluster. Valid values are Unknown, Updating,
     * Provisioning, Succeeded, and Failed. Possible values include: 'Unknown',
     * 'Updating', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private OperationStatus provisioningState;

    /**
     * List of provisioning errors reported by the resource provider.
     */
    @JsonProperty(value = "properties.provisioningErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorResponseWrapper> provisioningErrors;

    /**
     * The cluster type. Possible values include: 'ACS', 'Local'.
     */
    @JsonProperty(value = "properties.clusterType", required = true)
    private ClusterType clusterType;

    /**
     * Storage Account properties.
     */
    @JsonProperty(value = "properties.storageAccount")
    private StorageAccountProperties storageAccount;

    /**
     * Container Registry properties.
     */
    @JsonProperty(value = "properties.containerRegistry")
    private ContainerRegistryProperties containerRegistry;

    /**
     * Parameters for the Azure Container Service cluster.
     */
    @JsonProperty(value = "properties.containerService")
    private AcsClusterProperties containerService;

    /**
     * AppInsights configuration.
     */
    @JsonProperty(value = "properties.appInsights")
    private AppInsightsProperties appInsights;

    /**
     * Contains global configuration for the web services in the cluster.
     */
    @JsonProperty(value = "properties.globalServiceConfiguration")
    private GlobalServiceConfiguration globalServiceConfiguration;

    /**
     * Get the description of the cluster.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the cluster.
     *
     * @param description the description value to set
     * @return the OperationalizationClusterInner object itself.
     */
    public OperationalizationClusterInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the date and time when the cluster was created.
     *
     * @return the createdOn value
     */
    public DateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the date and time when the cluster was last modified.
     *
     * @return the modifiedOn value
     */
    public DateTime modifiedOn() {
        return this.modifiedOn;
    }

    /**
     * Get the provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed. Possible values include: 'Unknown', 'Updating', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public OperationStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get list of provisioning errors reported by the resource provider.
     *
     * @return the provisioningErrors value
     */
    public List<ErrorResponseWrapper> provisioningErrors() {
        return this.provisioningErrors;
    }

    /**
     * Get the cluster type. Possible values include: 'ACS', 'Local'.
     *
     * @return the clusterType value
     */
    public ClusterType clusterType() {
        return this.clusterType;
    }

    /**
     * Set the cluster type. Possible values include: 'ACS', 'Local'.
     *
     * @param clusterType the clusterType value to set
     * @return the OperationalizationClusterInner object itself.
     */
    public OperationalizationClusterInner withClusterType(ClusterType clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * Get storage Account properties.
     *
     * @return the storageAccount value
     */
    public StorageAccountProperties storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set storage Account properties.
     *
     * @param storageAccount the storageAccount value to set
     * @return the OperationalizationClusterInner object itself.
     */
    public OperationalizationClusterInner withStorageAccount(StorageAccountProperties storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

    /**
     * Get container Registry properties.
     *
     * @return the containerRegistry value
     */
    public ContainerRegistryProperties containerRegistry() {
        return this.containerRegistry;
    }

    /**
     * Set container Registry properties.
     *
     * @param containerRegistry the containerRegistry value to set
     * @return the OperationalizationClusterInner object itself.
     */
    public OperationalizationClusterInner withContainerRegistry(ContainerRegistryProperties containerRegistry) {
        this.containerRegistry = containerRegistry;
        return this;
    }

    /**
     * Get parameters for the Azure Container Service cluster.
     *
     * @return the containerService value
     */
    public AcsClusterProperties containerService() {
        return this.containerService;
    }

    /**
     * Set parameters for the Azure Container Service cluster.
     *
     * @param containerService the containerService value to set
     * @return the OperationalizationClusterInner object itself.
     */
    public OperationalizationClusterInner withContainerService(AcsClusterProperties containerService) {
        this.containerService = containerService;
        return this;
    }

    /**
     * Get appInsights configuration.
     *
     * @return the appInsights value
     */
    public AppInsightsProperties appInsights() {
        return this.appInsights;
    }

    /**
     * Set appInsights configuration.
     *
     * @param appInsights the appInsights value to set
     * @return the OperationalizationClusterInner object itself.
     */
    public OperationalizationClusterInner withAppInsights(AppInsightsProperties appInsights) {
        this.appInsights = appInsights;
        return this;
    }

    /**
     * Get contains global configuration for the web services in the cluster.
     *
     * @return the globalServiceConfiguration value
     */
    public GlobalServiceConfiguration globalServiceConfiguration() {
        return this.globalServiceConfiguration;
    }

    /**
     * Set contains global configuration for the web services in the cluster.
     *
     * @param globalServiceConfiguration the globalServiceConfiguration value to set
     * @return the OperationalizationClusterInner object itself.
     */
    public OperationalizationClusterInner withGlobalServiceConfiguration(GlobalServiceConfiguration globalServiceConfiguration) {
        this.globalServiceConfiguration = globalServiceConfiguration;
        return this;
    }

}