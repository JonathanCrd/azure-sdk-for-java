/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_01_21;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2019_01_21.implementation.KustoManager;
import com.microsoft.azure.management.kusto.v2019_01_21.implementation.CheckNameAvailabilityResultInner;

/**
 * Type representing CheckNameAvailabilityResult.
 */
public interface CheckNameAvailabilityResult extends HasInner<CheckNameAvailabilityResultInner>, HasManager<KustoManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nameAvailable value.
     */
    NameAvailable nameAvailable();

}