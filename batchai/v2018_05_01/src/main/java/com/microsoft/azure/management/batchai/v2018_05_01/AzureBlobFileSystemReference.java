/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides required information, for the service to be able to mount Azure
 * Blob Storage container on the cluster nodes.
 */
public class AzureBlobFileSystemReference {
    /**
     * Name of the Azure Blob Storage account.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /**
     * Name of the Azure Blob Storage container to mount on the cluster.
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /**
     * Information of the Azure Blob Storage account credentials.
     */
    @JsonProperty(value = "credentials", required = true)
    private AzureStorageCredentialsInfo credentials;

    /**
     * Specifies the relative path on the compute node where the Azure Blob
     * file system will be mounted.
     * Note that all cluster level blob file systems will be mounted under
     * $AZ_BATCHAI_MOUNT_ROOT location and all job level blob file systems will
     * be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /**
     * Specifies the various mount options that can be used to configure Blob
     * file system.
     */
    @JsonProperty(value = "mountOptions")
    private String mountOptions;

    /**
     * Get the accountName value.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName value.
     *
     * @param accountName the accountName value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the containerName value.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName value.
     *
     * @param containerName the containerName value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the credentials value.
     *
     * @return the credentials value
     */
    public AzureStorageCredentialsInfo credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials value.
     *
     * @param credentials the credentials value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withCredentials(AzureStorageCredentialsInfo credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the relativeMountPath value.
     *
     * @return the relativeMountPath value
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set the relativeMountPath value.
     *
     * @param relativeMountPath the relativeMountPath value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

    /**
     * Get the mountOptions value.
     *
     * @return the mountOptions value
     */
    public String mountOptions() {
        return this.mountOptions;
    }

    /**
     * Set the mountOptions value.
     *
     * @param mountOptions the mountOptions value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

}
