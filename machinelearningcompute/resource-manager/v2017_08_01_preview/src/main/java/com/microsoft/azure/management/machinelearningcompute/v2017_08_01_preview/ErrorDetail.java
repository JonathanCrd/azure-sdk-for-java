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
 * Error detail information.
 */
public class ErrorDetail {
    /**
     * Error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * Error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * Get error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set error code.
     *
     * @param code the code value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set error message.
     *
     * @param message the message value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withMessage(String message) {
        this.message = message;
        return this;
    }

}