/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15.implementation;

import com.microsoft.azure.management.labservices.v2018_10_15.Lab;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.labservices.v2018_10_15.LabFragment;
import java.util.Map;
import org.joda.time.Period;
import com.microsoft.azure.management.labservices.v2018_10_15.LabUserAccessMode;
import org.joda.time.DateTime;
import com.microsoft.azure.management.labservices.v2018_10_15.LatestOperationResult;
import rx.functions.Func1;

class LabImpl extends CreatableUpdatableImpl<Lab, LabInner, LabImpl> implements Lab, Lab.Definition, Lab.Update {
    private final LabServicesManager manager;
    private String resourceGroupName;
    private String labAccountName;
    private String labName;
    private LabFragment updateParameter;

    LabImpl(String name, LabServicesManager manager) {
        super(name, new LabInner());
        this.manager = manager;
        // Set resource name
        this.labName = name;
        //
        this.updateParameter = new LabFragment();
    }

    LabImpl(LabInner inner, LabServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.labName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "labaccounts");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        //
        this.updateParameter = new LabFragment();
    }

    @Override
    public LabServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Lab> createResourceAsync() {
        LabsInner client = this.manager().inner().labs();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labAccountName, this.labName, this.inner())
            .map(new Func1<LabInner, LabInner>() {
               @Override
               public LabInner call(LabInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Lab> updateResourceAsync() {
        LabsInner client = this.manager().inner().labs();
        return client.updateAsync(this.resourceGroupName, this.labAccountName, this.labName, this.updateParameter)
            .map(new Func1<LabInner, LabInner>() {
               @Override
               public LabInner call(LabInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LabInner> getInnerAsync() {
        LabsInner client = this.manager().inner().labs();
        return client.getAsync(this.resourceGroupName, this.labAccountName, this.labName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new LabFragment();
    }

    @Override
    public String createdByObjectId() {
        return this.inner().createdByObjectId();
    }

    @Override
    public String createdByUserPrincipalName() {
        return this.inner().createdByUserPrincipalName();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String invitationCode() {
        return this.inner().invitationCode();
    }

    @Override
    public LatestOperationResult latestOperationResult() {
        return this.inner().latestOperationResult();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Integer maxUsersInLab() {
        return this.inner().maxUsersInLab();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public Period usageQuota() {
        return this.inner().usageQuota();
    }

    @Override
    public LabUserAccessMode userAccessMode() {
        return this.inner().userAccessMode();
    }

    @Override
    public Integer userQuota() {
        return this.inner().userQuota();
    }

    @Override
    public LabImpl withExistingLabaccount(String resourceGroupName, String labAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.labAccountName = labAccountName;
        return this;
    }

    @Override
    public LabImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.inner().withLocation(location);
        } else {
            this.updateParameter.withLocation(location);
        }
        return this;
    }

    @Override
    public LabImpl withMaxUsersInLab(Integer maxUsersInLab) {
        if (isInCreateMode()) {
            this.inner().withMaxUsersInLab(maxUsersInLab);
        } else {
            this.updateParameter.withMaxUsersInLab(maxUsersInLab);
        }
        return this;
    }

    @Override
    public LabImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.inner().withProvisioningState(provisioningState);
        } else {
            this.updateParameter.withProvisioningState(provisioningState);
        }
        return this;
    }

    @Override
    public LabImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public LabImpl withUniqueIdentifier(String uniqueIdentifier) {
        if (isInCreateMode()) {
            this.inner().withUniqueIdentifier(uniqueIdentifier);
        } else {
            this.updateParameter.withUniqueIdentifier(uniqueIdentifier);
        }
        return this;
    }

    @Override
    public LabImpl withUsageQuota(Period usageQuota) {
        if (isInCreateMode()) {
            this.inner().withUsageQuota(usageQuota);
        } else {
            this.updateParameter.withUsageQuota(usageQuota);
        }
        return this;
    }

    @Override
    public LabImpl withUserAccessMode(LabUserAccessMode userAccessMode) {
        if (isInCreateMode()) {
            this.inner().withUserAccessMode(userAccessMode);
        } else {
            this.updateParameter.withUserAccessMode(userAccessMode);
        }
        return this;
    }

}