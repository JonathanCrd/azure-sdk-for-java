/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for HttpAuthenticationType.
 */
public enum HttpAuthenticationType {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value ClientCertificate. */
    CLIENT_CERTIFICATE("ClientCertificate"),

    /** Enum value ActiveDirectoryOAuth. */
    ACTIVE_DIRECTORY_OAUTH("ActiveDirectoryOAuth"),

    /** Enum value Basic. */
    BASIC("Basic");

    /** The actual serialized value for a HttpAuthenticationType instance. */
    private String value;

    HttpAuthenticationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HttpAuthenticationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HttpAuthenticationType object, or null if unable to parse.
     */
    @JsonCreator
    public static HttpAuthenticationType fromString(String value) {
        HttpAuthenticationType[] items = HttpAuthenticationType.values();
        for (HttpAuthenticationType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}