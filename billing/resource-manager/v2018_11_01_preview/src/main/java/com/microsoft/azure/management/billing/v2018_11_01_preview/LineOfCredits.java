/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.LineOfCreditInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.LineOfCreditsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LineOfCredits.
 */
public interface LineOfCredits extends HasInner<LineOfCreditsInner> {
    /**
     * Get the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LineOfCredit> getAsync();

    /**
     * Increase the current line of credit.
     *
     * @param parameters Parameters supplied to the increase line of credit operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LineOfCredit> updateAsync(LineOfCreditInner parameters);

}