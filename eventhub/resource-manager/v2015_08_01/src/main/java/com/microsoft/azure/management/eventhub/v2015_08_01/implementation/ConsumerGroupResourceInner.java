/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2015_08_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Single item in List or Get Consumer group operation.
 */
@JsonFlatten
public class ConsumerGroupResourceInner extends ProxyResource {
    /**
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The path of the Event Hub.
     */
    @JsonProperty(value = "properties.eventHubPath", access = JsonProperty.Access.WRITE_ONLY)
    private String eventHubPath;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * The user metadata.
     */
    @JsonProperty(value = "properties.userMetadata")
    private String userMetadata;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get exact time the message was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the path of the Event Hub.
     *
     * @return the eventHubPath value
     */
    public String eventHubPath() {
        return this.eventHubPath;
    }

    /**
     * Get the exact time the message was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the user metadata.
     *
     * @return the userMetadata value
     */
    public String userMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the user metadata.
     *
     * @param userMetadata the userMetadata value to set
     * @return the ConsumerGroupResourceInner object itself.
     */
    public ConsumerGroupResourceInner withUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the ConsumerGroupResourceInner object itself.
     */
    public ConsumerGroupResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

}