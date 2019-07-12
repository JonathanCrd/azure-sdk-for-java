/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountSchema;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.logic.v2019_05_01.SchemaType;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2019_05_01.ContentLink;

class IntegrationAccountSchemaImpl extends CreatableUpdatableImpl<IntegrationAccountSchema, IntegrationAccountSchemaInner, IntegrationAccountSchemaImpl> implements IntegrationAccountSchema, IntegrationAccountSchema.Definition, IntegrationAccountSchema.Update {
    private final LogicManager manager;
    private String resourceGroupName;
    private String integrationAccountName;
    private String schemaName;

    IntegrationAccountSchemaImpl(String name, LogicManager manager) {
        super(name, new IntegrationAccountSchemaInner());
        this.manager = manager;
        // Set resource name
        this.schemaName = name;
        //
    }

    IntegrationAccountSchemaImpl(IntegrationAccountSchemaInner inner, LogicManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.schemaName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.integrationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "integrationAccounts");
        this.schemaName = IdParsingUtils.getValueFromIdByName(inner.id(), "schemas");
        //
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IntegrationAccountSchema> createResourceAsync() {
        IntegrationAccountSchemasInner client = this.manager().inner().integrationAccountSchemas();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.schemaName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IntegrationAccountSchema> updateResourceAsync() {
        IntegrationAccountSchemasInner client = this.manager().inner().integrationAccountSchemas();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.schemaName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IntegrationAccountSchemaInner> getInnerAsync() {
        IntegrationAccountSchemasInner client = this.manager().inner().integrationAccountSchemas();
        return client.getAsync(this.resourceGroupName, this.integrationAccountName, this.schemaName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime changedTime() {
        return this.inner().changedTime();
    }

    @Override
    public String content() {
        return this.inner().content();
    }

    @Override
    public ContentLink contentLink() {
        return this.inner().contentLink();
    }

    @Override
    public String contentType() {
        return this.inner().contentType();
    }

    @Override
    public DateTime createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public String documentName() {
        return this.inner().documentName();
    }

    @Override
    public String fileName() {
        return this.inner().fileName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Object metadata() {
        return this.inner().metadata();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SchemaType schemaType() {
        return this.inner().schemaType();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String targetNamespace() {
        return this.inner().targetNamespace();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public IntegrationAccountSchemaImpl withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.integrationAccountName = integrationAccountName;
        return this;
    }

    @Override
    public IntegrationAccountSchemaImpl withSchemaType(SchemaType schemaType) {
        this.inner().withSchemaType(schemaType);
        return this;
    }

    @Override
    public IntegrationAccountSchemaImpl withContent(String content) {
        this.inner().withContent(content);
        return this;
    }

    @Override
    public IntegrationAccountSchemaImpl withContentType(String contentType) {
        this.inner().withContentType(contentType);
        return this;
    }

    @Override
    public IntegrationAccountSchemaImpl withDocumentName(String documentName) {
        this.inner().withDocumentName(documentName);
        return this;
    }

    @Override
    public IntegrationAccountSchemaImpl withFileName(String fileName) {
        this.inner().withFileName(fileName);
        return this;
    }

    @Override
    public IntegrationAccountSchemaImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public IntegrationAccountSchemaImpl withMetadata(Object metadata) {
        this.inner().withMetadata(metadata);
        return this;
    }

    @Override
    public IntegrationAccountSchemaImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public IntegrationAccountSchemaImpl withTargetNamespace(String targetNamespace) {
        this.inner().withTargetNamespace(targetNamespace);
        return this;
    }

}