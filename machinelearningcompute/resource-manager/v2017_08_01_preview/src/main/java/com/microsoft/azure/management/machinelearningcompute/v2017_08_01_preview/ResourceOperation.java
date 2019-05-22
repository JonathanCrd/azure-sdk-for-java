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
 * Resource operation.
 */
public class ResourceOperation {
    /**
     * Name of this operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display of the operation.
     */
    @JsonProperty(value = "display")
    private ResourceOperationDisplay display;

    /**
     * The operation origin.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * Get name of this operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of this operation.
     *
     * @param name the name value to set
     * @return the ResourceOperation object itself.
     */
    public ResourceOperation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get display of the operation.
     *
     * @return the display value
     */
    public ResourceOperationDisplay display() {
        return this.display;
    }

    /**
     * Set display of the operation.
     *
     * @param display the display value to set
     * @return the ResourceOperation object itself.
     */
    public ResourceOperation withDisplay(ResourceOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the operation origin.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the operation origin.
     *
     * @param origin the origin value to set
     * @return the ResourceOperation object itself.
     */
    public ResourceOperation withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

}