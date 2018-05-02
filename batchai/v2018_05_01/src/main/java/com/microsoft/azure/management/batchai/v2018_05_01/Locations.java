/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.microsoft.azure.management.batchai.v2018_05_01.implementation.UsagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Locations.
 */
public interface Locations extends HasInner<UsagesInner> {

    /**
     * @return Entry point to manage Location Usage.
     */
    Usages usages();
}
