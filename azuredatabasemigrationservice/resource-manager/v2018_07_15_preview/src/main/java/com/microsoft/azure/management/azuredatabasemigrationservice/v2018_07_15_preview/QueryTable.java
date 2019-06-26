/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a single table.
 */
public class QueryTable {
    /**
     * Whether the table has any rows.
     */
    @JsonProperty(value = "hasRows")
    private Boolean hasRows;

    /**
     * The schema-qualifed table name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get whether the table has any rows.
     *
     * @return the hasRows value
     */
    public Boolean hasRows() {
        return this.hasRows;
    }

    /**
     * Set whether the table has any rows.
     *
     * @param hasRows the hasRows value to set
     * @return the QueryTable object itself.
     */
    public QueryTable withHasRows(Boolean hasRows) {
        this.hasRows = hasRows;
        return this;
    }

    /**
     * Get the schema-qualifed table name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the schema-qualifed table name.
     *
     * @param name the name value to set
     * @return the QueryTable object itself.
     */
    public QueryTable withName(String name) {
        this.name = name;
        return this;
    }

}
