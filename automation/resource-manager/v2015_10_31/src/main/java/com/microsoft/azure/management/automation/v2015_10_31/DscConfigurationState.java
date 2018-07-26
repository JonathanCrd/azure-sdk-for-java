/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DscConfigurationState.
 */
public final class DscConfigurationState extends ExpandableStringEnum<DscConfigurationState> {
    /** Static value New for DscConfigurationState. */
    public static final DscConfigurationState NEW = fromString("New");

    /** Static value Edit for DscConfigurationState. */
    public static final DscConfigurationState EDIT = fromString("Edit");

    /** Static value Published for DscConfigurationState. */
    public static final DscConfigurationState PUBLISHED = fromString("Published");

    /**
     * Creates or finds a DscConfigurationState from its string representation.
     * @param name a name to look for
     * @return the corresponding DscConfigurationState
     */
    @JsonCreator
    public static DscConfigurationState fromString(String name) {
        return fromString(name, DscConfigurationState.class);
    }

    /**
     * @return known DscConfigurationState values
     */
    public static Collection<DscConfigurationState> values() {
        return values(DscConfigurationState.class);
    }
}