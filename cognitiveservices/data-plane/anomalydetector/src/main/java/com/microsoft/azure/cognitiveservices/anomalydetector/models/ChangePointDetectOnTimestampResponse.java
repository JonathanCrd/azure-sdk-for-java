/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.anomalydetector.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ChangePointDetectOnTimestampResponse model.
 */
public class ChangePointDetectOnTimestampResponse {
    /**
     * Frequency extracted from the series, zero means no recurrent pattern has
     * been found.
     */
    @JsonProperty(value = "period", required = true)
    private int periodProperty;

    /**
     * Change point property. True means a change point has been detected.
     */
    @JsonProperty(value = "isChangePoint", required = true)
    private boolean isChangePoint;

    /**
     * The change point confidence score.
     */
    @JsonProperty(value = "confidenceScore", required = true)
    private double confidenceScore;

    /**
     * Timestamp of a data point (ISO8601 format).
     */
    @JsonProperty(value = "timestamp", required = true)
    private DateTime timestamp;

    /**
     * Get frequency extracted from the series, zero means no recurrent pattern has been found.
     *
     * @return the periodProperty value
     */
    public int periodProperty() {
        return this.periodProperty;
    }

    /**
     * Set frequency extracted from the series, zero means no recurrent pattern has been found.
     *
     * @param periodProperty the periodProperty value to set
     * @return the ChangePointDetectOnTimestampResponse object itself.
     */
    public ChangePointDetectOnTimestampResponse withPeriodProperty(int periodProperty) {
        this.periodProperty = periodProperty;
        return this;
    }

    /**
     * Get change point property. True means a change point has been detected.
     *
     * @return the isChangePoint value
     */
    public boolean isChangePoint() {
        return this.isChangePoint;
    }

    /**
     * Set change point property. True means a change point has been detected.
     *
     * @param isChangePoint the isChangePoint value to set
     * @return the ChangePointDetectOnTimestampResponse object itself.
     */
    public ChangePointDetectOnTimestampResponse withIsChangePoint(boolean isChangePoint) {
        this.isChangePoint = isChangePoint;
        return this;
    }

    /**
     * Get the change point confidence score.
     *
     * @return the confidenceScore value
     */
    public double confidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Set the change point confidence score.
     *
     * @param confidenceScore the confidenceScore value to set
     * @return the ChangePointDetectOnTimestampResponse object itself.
     */
    public ChangePointDetectOnTimestampResponse withConfidenceScore(double confidenceScore) {
        this.confidenceScore = confidenceScore;
        return this;
    }

    /**
     * Get timestamp of a data point (ISO8601 format).
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set timestamp of a data point (ISO8601 format).
     *
     * @param timestamp the timestamp value to set
     * @return the ChangePointDetectOnTimestampResponse object itself.
     */
    public ChangePointDetectOnTimestampResponse withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}