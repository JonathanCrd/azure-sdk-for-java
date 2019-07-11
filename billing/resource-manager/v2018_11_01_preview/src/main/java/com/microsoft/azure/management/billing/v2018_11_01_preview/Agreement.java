/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.AgreementInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Agreement.
 */
public interface Agreement extends HasInner<AgreementInner>, Indexable, Refreshable<Agreement>, HasManager<BillingManager> {
    /**
     * @return the agreementLink value.
     */
    String agreementLink();

    /**
     * @return the effectiveDate value.
     */
    DateTime effectiveDate();

    /**
     * @return the expirationDate value.
     */
    DateTime expirationDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the participants value.
     */
    List<Participants> participants();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the type value.
     */
    String type();

}