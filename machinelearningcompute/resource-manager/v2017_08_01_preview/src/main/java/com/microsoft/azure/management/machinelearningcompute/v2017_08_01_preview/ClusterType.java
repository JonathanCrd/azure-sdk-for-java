/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ClusterType.
 */
public final class ClusterType extends ExpandableStringEnum<ClusterType> {
    /** Static value ACS for ClusterType. */
    public static final ClusterType ACS = fromString("ACS");

    /** Static value Local for ClusterType. */
    public static final ClusterType LOCAL = fromString("Local");

    /**
     * Creates or finds a ClusterType from its string representation.
     * @param name a name to look for
     * @return the corresponding ClusterType
     */
    @JsonCreator
    public static ClusterType fromString(String name) {
        return fromString(name, ClusterType.class);
    }

    /**
     * @return known ClusterType values
     */
    public static Collection<ClusterType> values() {
        return values(ClusterType.class);
    }
}