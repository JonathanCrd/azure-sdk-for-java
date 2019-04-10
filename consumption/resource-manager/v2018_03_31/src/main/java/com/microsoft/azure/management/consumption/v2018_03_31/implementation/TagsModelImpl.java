/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_03_31.implementation;

import com.microsoft.azure.management.consumption.v2018_03_31.TagsModel;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class TagsModelImpl extends WrapperImpl<TagsModelInner> implements TagsModel {
    private final ConsumptionManager manager;
    TagsModelImpl(TagsModelInner inner, ConsumptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public String eTag() {
        return this.inner().eTag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<TagInner> tags() {
        return this.inner().tags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}