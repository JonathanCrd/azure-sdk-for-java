/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_03.implementation;

import com.microsoft.azure.management.sql.v3_2017_03.ExtendedDatabaseBlobAuditingPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v3_2017_03.BlobAuditingPolicyState;
import java.util.List;
import java.util.UUID;

class ExtendedDatabaseBlobAuditingPolicyImpl extends CreatableUpdatableImpl<ExtendedDatabaseBlobAuditingPolicy, ExtendedDatabaseBlobAuditingPolicyInner, ExtendedDatabaseBlobAuditingPolicyImpl> implements ExtendedDatabaseBlobAuditingPolicy, ExtendedDatabaseBlobAuditingPolicy.Definition, ExtendedDatabaseBlobAuditingPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;

    ExtendedDatabaseBlobAuditingPolicyImpl(String name, SqlManager manager) {
        super(name, new ExtendedDatabaseBlobAuditingPolicyInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
    }

    ExtendedDatabaseBlobAuditingPolicyImpl(ExtendedDatabaseBlobAuditingPolicyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExtendedDatabaseBlobAuditingPolicy> createResourceAsync() {
        ExtendedDatabaseBlobAuditingPoliciesInner client = this.manager().inner().extendedDatabaseBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExtendedDatabaseBlobAuditingPolicy> updateResourceAsync() {
        ExtendedDatabaseBlobAuditingPoliciesInner client = this.manager().inner().extendedDatabaseBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExtendedDatabaseBlobAuditingPolicyInner> getInnerAsync() {
        ExtendedDatabaseBlobAuditingPoliciesInner client = this.manager().inner().extendedDatabaseBlobAuditingPolicies();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> auditActionsAndGroups() {
        return this.inner().auditActionsAndGroups();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isAzureMonitorTargetEnabled() {
        return this.inner().isAzureMonitorTargetEnabled();
    }

    @Override
    public Boolean isStorageSecondaryKeyInUse() {
        return this.inner().isStorageSecondaryKeyInUse();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String predicateExpression() {
        return this.inner().predicateExpression();
    }

    @Override
    public Integer retentionDays() {
        return this.inner().retentionDays();
    }

    @Override
    public BlobAuditingPolicyState state() {
        return this.inner().state();
    }

    @Override
    public String storageAccountAccessKey() {
        return this.inner().storageAccountAccessKey();
    }

    @Override
    public UUID storageAccountSubscriptionId() {
        return this.inner().storageAccountSubscriptionId();
    }

    @Override
    public String storageEndpoint() {
        return this.inner().storageEndpoint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withExistingDatabasis(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withState(BlobAuditingPolicyState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.inner().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.inner().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.inner().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withPredicateExpression(String predicateExpression) {
        this.inner().withPredicateExpression(predicateExpression);
        return this;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withRetentionDays(Integer retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.inner().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.inner().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.inner().withStorageEndpoint(storageEndpoint);
        return this;
    }

}