/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of a DetectImage call.
 */
public class DetectResult {
    /**
     * An array of detected objects.
     */
    @JsonProperty(value = "objects", access = JsonProperty.Access.WRITE_ONLY)
    private List<DetectedObject> objects;

    /**
     * Id of the REST API request.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "metadata")
    private ImageMetadata metadata;

    /**
     * Get an array of detected objects.
     *
     * @return the objects value
     */
    public List<DetectedObject> objects() {
        return this.objects;
    }

    /**
     * Get id of the REST API request.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set id of the REST API request.
     *
     * @param requestId the requestId value to set
     * @return the DetectResult object itself.
     */
    public DetectResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public ImageMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the DetectResult object itself.
     */
    public DetectResult withMetadata(ImageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

}