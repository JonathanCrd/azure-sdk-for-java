/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2018_09_15.LabVirtualMachine;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.LabVirtualMachineFragment;
import java.util.Map;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ArtifactInstallProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ArtifactDeploymentStatusProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.GalleryImageReference;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ComputeVmProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.NetworkInterfaceProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.VirtualMachineCreationSource;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.DataDiskProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ScheduleCreationParameter;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ApplicableSchedule;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ArtifactDeploymentStatusPropertiesFragment;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ArtifactInstallPropertiesFragment;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.DataDiskPropertiesFragment;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.GalleryImageReferenceFragment;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.NetworkInterfacePropertiesFragment;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ScheduleCreationParameterFragment;
import rx.functions.Func1;

class LabVirtualMachineImpl extends CreatableUpdatableImpl<LabVirtualMachine, LabVirtualMachineInner, LabVirtualMachineImpl> implements LabVirtualMachine, LabVirtualMachine.Definition, LabVirtualMachine.Update {
    private final DevTestLabsManager manager;
    private String resourceGroupName;
    private String labName;
    private String name;
    private LabVirtualMachineFragment updateParameter;

    LabVirtualMachineImpl(String name, DevTestLabsManager manager) {
        super(name, new LabVirtualMachineInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
        this.updateParameter = new LabVirtualMachineFragment();
    }

    LabVirtualMachineImpl(LabVirtualMachineInner inner, DevTestLabsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualmachines");
        //
        this.updateParameter = new LabVirtualMachineFragment();
    }

    @Override
    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<LabVirtualMachine> createResourceAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labName, this.name, this.inner())
            .map(new Func1<LabVirtualMachineInner, LabVirtualMachineInner>() {
               @Override
               public LabVirtualMachineInner call(LabVirtualMachineInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LabVirtualMachine> updateResourceAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.updateAsync(this.resourceGroupName, this.labName, this.name, this.updateParameter)
            .map(new Func1<LabVirtualMachineInner, LabVirtualMachineInner>() {
               @Override
               public LabVirtualMachineInner call(LabVirtualMachineInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LabVirtualMachineInner> getInnerAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.getAsync(this.resourceGroupName, this.labName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new LabVirtualMachineFragment();
    }

    @Override
    public Boolean allowClaim() {
        return this.inner().allowClaim();
    }

    @Override
    public ApplicableSchedule applicableSchedule() {
        ApplicableScheduleInner inner = this.inner().applicableSchedule();
        if (inner != null) {
            return  new ApplicableScheduleImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public ArtifactDeploymentStatusProperties artifactDeploymentStatus() {
        return this.inner().artifactDeploymentStatus();
    }

    @Override
    public List<ArtifactInstallProperties> artifacts() {
        return this.inner().artifacts();
    }

    @Override
    public String computeId() {
        return this.inner().computeId();
    }

    @Override
    public ComputeVmProperties computeVm() {
        return this.inner().computeVm();
    }

    @Override
    public String createdByUser() {
        return this.inner().createdByUser();
    }

    @Override
    public String createdByUserId() {
        return this.inner().createdByUserId();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String customImageId() {
        return this.inner().customImageId();
    }

    @Override
    public List<DataDiskProperties> dataDiskParameters() {
        return this.inner().dataDiskParameters();
    }

    @Override
    public Boolean disallowPublicIpAddress() {
        return this.inner().disallowPublicIpAddress();
    }

    @Override
    public String environmentId() {
        return this.inner().environmentId();
    }

    @Override
    public DateTime expirationDate() {
        return this.inner().expirationDate();
    }

    @Override
    public String fqdn() {
        return this.inner().fqdn();
    }

    @Override
    public GalleryImageReference galleryImageReference() {
        return this.inner().galleryImageReference();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isAuthenticationWithSshKey() {
        return this.inner().isAuthenticationWithSshKey();
    }

    @Override
    public String labSubnetName() {
        return this.inner().labSubnetName();
    }

    @Override
    public String labVirtualNetworkId() {
        return this.inner().labVirtualNetworkId();
    }

    @Override
    public String lastKnownPowerState() {
        return this.inner().lastKnownPowerState();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NetworkInterfaceProperties networkInterface() {
        return this.inner().networkInterface();
    }

    @Override
    public String notes() {
        return this.inner().notes();
    }

    @Override
    public String osType() {
        return this.inner().osType();
    }

    @Override
    public String ownerObjectId() {
        return this.inner().ownerObjectId();
    }

    @Override
    public String ownerUserPrincipalName() {
        return this.inner().ownerUserPrincipalName();
    }

    @Override
    public String password() {
        return this.inner().password();
    }

    @Override
    public String planId() {
        return this.inner().planId();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<ScheduleCreationParameter> scheduleParameters() {
        return this.inner().scheduleParameters();
    }

    @Override
    public String size() {
        return this.inner().size();
    }

    @Override
    public String sshKey() {
        return this.inner().sshKey();
    }

    @Override
    public String storageType() {
        return this.inner().storageType();
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
    public String userName() {
        return this.inner().userName();
    }

    @Override
    public VirtualMachineCreationSource virtualMachineCreationSource() {
        return this.inner().virtualMachineCreationSource();
    }

    @Override
    public LabVirtualMachineImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    @Override
    public LabVirtualMachineImpl withArtifactDeploymentStatus(ArtifactDeploymentStatusProperties artifactDeploymentStatus) {
        this.inner().withArtifactDeploymentStatus(artifactDeploymentStatus);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withArtifacts(List<ArtifactInstallProperties> artifacts) {
        this.inner().withArtifacts(artifacts);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withDataDiskParameters(List<DataDiskProperties> dataDiskParameters) {
        this.inner().withDataDiskParameters(dataDiskParameters);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withGalleryImageReference(GalleryImageReference galleryImageReference) {
        this.inner().withGalleryImageReference(galleryImageReference);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withNetworkInterface(NetworkInterfaceProperties networkInterface) {
        this.inner().withNetworkInterface(networkInterface);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withScheduleParameters(List<ScheduleCreationParameter> scheduleParameters) {
        this.inner().withScheduleParameters(scheduleParameters);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withArtifactDeploymentStatus(ArtifactDeploymentStatusPropertiesFragment artifactDeploymentStatus) {
        this.updateParameter.withArtifactDeploymentStatus(artifactDeploymentStatus);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withArtifactFragments(List<ArtifactInstallPropertiesFragment> artifacts) {
        this.updateParameter.withArtifacts(artifacts);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withDataDiskParameterFragments(List<DataDiskPropertiesFragment> dataDiskParameters) {
        this.updateParameter.withDataDiskParameters(dataDiskParameters);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withGalleryImageReference(GalleryImageReferenceFragment galleryImageReference) {
        this.updateParameter.withGalleryImageReference(galleryImageReference);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withNetworkInterface(NetworkInterfacePropertiesFragment networkInterface) {
        this.updateParameter.withNetworkInterface(networkInterface);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withScheduleParameterFragments(List<ScheduleCreationParameterFragment> scheduleParameters) {
        this.updateParameter.withScheduleParameters(scheduleParameters);
        return this;
    }

    @Override
    public LabVirtualMachineImpl withAllowClaim(Boolean allowClaim) {
        if (isInCreateMode()) {
            this.inner().withAllowClaim(allowClaim);
        } else {
            this.updateParameter.withAllowClaim(allowClaim);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withComputeId(String computeId) {
        if (isInCreateMode()) {
            this.inner().withComputeId(computeId);
        } else {
            this.updateParameter.withComputeId(computeId);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withCreatedByUser(String createdByUser) {
        if (isInCreateMode()) {
            this.inner().withCreatedByUser(createdByUser);
        } else {
            this.updateParameter.withCreatedByUser(createdByUser);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withCreatedByUserId(String createdByUserId) {
        if (isInCreateMode()) {
            this.inner().withCreatedByUserId(createdByUserId);
        } else {
            this.updateParameter.withCreatedByUserId(createdByUserId);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withCreatedDate(DateTime createdDate) {
        if (isInCreateMode()) {
            this.inner().withCreatedDate(createdDate);
        } else {
            this.updateParameter.withCreatedDate(createdDate);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withCustomImageId(String customImageId) {
        if (isInCreateMode()) {
            this.inner().withCustomImageId(customImageId);
        } else {
            this.updateParameter.withCustomImageId(customImageId);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withDisallowPublicIpAddress(Boolean disallowPublicIpAddress) {
        if (isInCreateMode()) {
            this.inner().withDisallowPublicIpAddress(disallowPublicIpAddress);
        } else {
            this.updateParameter.withDisallowPublicIpAddress(disallowPublicIpAddress);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withEnvironmentId(String environmentId) {
        if (isInCreateMode()) {
            this.inner().withEnvironmentId(environmentId);
        } else {
            this.updateParameter.withEnvironmentId(environmentId);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withExpirationDate(DateTime expirationDate) {
        if (isInCreateMode()) {
            this.inner().withExpirationDate(expirationDate);
        } else {
            this.updateParameter.withExpirationDate(expirationDate);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withFqdn(String fqdn) {
        if (isInCreateMode()) {
            this.inner().withFqdn(fqdn);
        } else {
            this.updateParameter.withFqdn(fqdn);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withIsAuthenticationWithSshKey(Boolean isAuthenticationWithSshKey) {
        if (isInCreateMode()) {
            this.inner().withIsAuthenticationWithSshKey(isAuthenticationWithSshKey);
        } else {
            this.updateParameter.withIsAuthenticationWithSshKey(isAuthenticationWithSshKey);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withLabSubnetName(String labSubnetName) {
        if (isInCreateMode()) {
            this.inner().withLabSubnetName(labSubnetName);
        } else {
            this.updateParameter.withLabSubnetName(labSubnetName);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withLabVirtualNetworkId(String labVirtualNetworkId) {
        if (isInCreateMode()) {
            this.inner().withLabVirtualNetworkId(labVirtualNetworkId);
        } else {
            this.updateParameter.withLabVirtualNetworkId(labVirtualNetworkId);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withLastKnownPowerState(String lastKnownPowerState) {
        if (isInCreateMode()) {
            this.inner().withLastKnownPowerState(lastKnownPowerState);
        } else {
            this.updateParameter.withLastKnownPowerState(lastKnownPowerState);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withNotes(String notes) {
        if (isInCreateMode()) {
            this.inner().withNotes(notes);
        } else {
            this.updateParameter.withNotes(notes);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withOsType(String osType) {
        if (isInCreateMode()) {
            this.inner().withOsType(osType);
        } else {
            this.updateParameter.withOsType(osType);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withOwnerObjectId(String ownerObjectId) {
        if (isInCreateMode()) {
            this.inner().withOwnerObjectId(ownerObjectId);
        } else {
            this.updateParameter.withOwnerObjectId(ownerObjectId);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withOwnerUserPrincipalName(String ownerUserPrincipalName) {
        if (isInCreateMode()) {
            this.inner().withOwnerUserPrincipalName(ownerUserPrincipalName);
        } else {
            this.updateParameter.withOwnerUserPrincipalName(ownerUserPrincipalName);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withPassword(String password) {
        if (isInCreateMode()) {
            this.inner().withPassword(password);
        } else {
            this.updateParameter.withPassword(password);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withPlanId(String planId) {
        if (isInCreateMode()) {
            this.inner().withPlanId(planId);
        } else {
            this.updateParameter.withPlanId(planId);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withSize(String size) {
        if (isInCreateMode()) {
            this.inner().withSize(size);
        } else {
            this.updateParameter.withSize(size);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withSshKey(String sshKey) {
        if (isInCreateMode()) {
            this.inner().withSshKey(sshKey);
        } else {
            this.updateParameter.withSshKey(sshKey);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withStorageType(String storageType) {
        if (isInCreateMode()) {
            this.inner().withStorageType(storageType);
        } else {
            this.updateParameter.withStorageType(storageType);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withUserName(String userName) {
        if (isInCreateMode()) {
            this.inner().withUserName(userName);
        } else {
            this.updateParameter.withUserName(userName);
        }
        return this;
    }

    @Override
    public LabVirtualMachineImpl withVirtualMachineCreationSource(VirtualMachineCreationSource virtualMachineCreationSource) {
        if (isInCreateMode()) {
            this.inner().withVirtualMachineCreationSource(virtualMachineCreationSource);
        } else {
            this.updateParameter.withVirtualMachineCreationSource(virtualMachineCreationSource);
        }
        return this;
    }

}
