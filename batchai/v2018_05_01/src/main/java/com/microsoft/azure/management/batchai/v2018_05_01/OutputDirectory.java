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
 * Output directory for the job.
 */
public class OutputDirectory {
    /**
     * The name for the output directory.
     * The path of the output directory will be available as a value of an
     * environment variable with AZ_BATCHAI_OUTPUT_&lt;id&gt; name, where
     * &lt;id&gt; is the value of id attribute.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The prefix path where the output directory will be created.
     * NOTE: This is an absolute path to prefix. E.g.
     * $AZ_BATCHAI_MOUNT_ROOT/MyNFS/MyLogs. You can find the full path to the
     * output directory by combining pathPrefix, jobOutputDirectoryPathSegment
     * (reported by get job) and pathSuffix.
     */
    @JsonProperty(value = "pathPrefix", required = true)
    private String pathPrefix;

    /**
     * The suffix path where the output directory will be created.
     * The suffix path where the output directory will be created. E.g. models.
     * You can find the full path to the output directory by combining
     * pathPrefix, jobOutputDirectoryPathSegment (reported by get job) and
     * pathSuffix.
     */
    @JsonProperty(value = "pathSuffix")
    private String pathSuffix;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the pathPrefix value.
     *
     * @return the pathPrefix value
     */
    public String pathPrefix() {
        return this.pathPrefix;
    }

    /**
     * Set the pathPrefix value.
     *
     * @param pathPrefix the pathPrefix value to set
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    /**
     * Get the pathSuffix value.
     *
     * @return the pathSuffix value
     */
    public String pathSuffix() {
        return this.pathSuffix;
    }

    /**
     * Set the pathSuffix value.
     *
     * @param pathSuffix the pathSuffix value to set
     * @return the OutputDirectory object itself.
     */
    public OutputDirectory withPathSuffix(String pathSuffix) {
        this.pathSuffix = pathSuffix;
        return this;
    }

}
