/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Global service auth configuration properties. These are the data-plane
 * authorization keys and are used if a service doesn't define it's own.
 */
public class ServiceAuthConfiguration {
    /**
     * The primary auth key hash. This is not returned in response of GET/PUT
     * on the resource.. To see this please call listKeys API.
     */
    @JsonProperty(value = "primaryAuthKeyHash", required = true)
    private String primaryAuthKeyHash;

    /**
     * The secondary auth key hash. This is not returned in response of GET/PUT
     * on the resource.. To see this please call listKeys API.
     */
    @JsonProperty(value = "secondaryAuthKeyHash", required = true)
    private String secondaryAuthKeyHash;

    /**
     * Get the primary auth key hash. This is not returned in response of GET/PUT on the resource.. To see this please call listKeys API.
     *
     * @return the primaryAuthKeyHash value
     */
    public String primaryAuthKeyHash() {
        return this.primaryAuthKeyHash;
    }

    /**
     * Set the primary auth key hash. This is not returned in response of GET/PUT on the resource.. To see this please call listKeys API.
     *
     * @param primaryAuthKeyHash the primaryAuthKeyHash value to set
     * @return the ServiceAuthConfiguration object itself.
     */
    public ServiceAuthConfiguration withPrimaryAuthKeyHash(String primaryAuthKeyHash) {
        this.primaryAuthKeyHash = primaryAuthKeyHash;
        return this;
    }

    /**
     * Get the secondary auth key hash. This is not returned in response of GET/PUT on the resource.. To see this please call listKeys API.
     *
     * @return the secondaryAuthKeyHash value
     */
    public String secondaryAuthKeyHash() {
        return this.secondaryAuthKeyHash;
    }

    /**
     * Set the secondary auth key hash. This is not returned in response of GET/PUT on the resource.. To see this please call listKeys API.
     *
     * @param secondaryAuthKeyHash the secondaryAuthKeyHash value to set
     * @return the ServiceAuthConfiguration object itself.
     */
    public ServiceAuthConfiguration withSecondaryAuthKeyHash(String secondaryAuthKeyHash) {
        this.secondaryAuthKeyHash = secondaryAuthKeyHash;
        return this;
    }

}