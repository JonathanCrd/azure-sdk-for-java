/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.Activity;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.automation.v2015_10_31.ActivityOutputType;
import com.microsoft.azure.management.automation.v2015_10_31.ActivityParameterSet;

class ActivityImpl extends IndexableRefreshableWrapperImpl<Activity, ActivityInner> implements Activity {
    private final AutomationManager manager;
    private String resourceGroupName;
    private String automationAccountName;
    private String moduleName;
    private String activityName;

    ActivityImpl(ActivityInner inner,  AutomationManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.automationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "automationAccounts");
        this.moduleName = IdParsingUtils.getValueFromIdByName(inner.id(), "modules");
        this.activityName = IdParsingUtils.getValueFromIdByName(inner.id(), "activities");
    }

    @Override
    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ActivityInner> getInnerAsync() {
        ActivitysInner client = this.manager().inner().activitys();
        return client.getAsync(this.resourceGroupName, this.automationAccountName, this.moduleName, this.activityName);
    }



    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public String definition() {
        return this.inner().definition();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<ActivityOutputType> outputTypes() {
        return this.inner().outputTypes();
    }

    @Override
    public List<ActivityParameterSet> parameterSets() {
        return this.inner().parameterSets();
    }

}