/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualNetworkByPCs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.PrivateCloudLocationVirtualNetworkModel;

class VirtualNetworkByPCsImpl extends WrapperImpl<VirtualNetworkByPCsInner> implements VirtualNetworkByPCs {
    private final VMwareCloudSimpleManager manager;

    VirtualNetworkByPCsImpl(VMwareCloudSimpleManager manager) {
        super(manager.inner().virtualNetworkByPCs());
        this.manager = manager;
    }

    public VMwareCloudSimpleManager manager() {
        return this.manager;
    }

    private PrivateCloudLocationVirtualNetworkModelImpl wrapModel(VirtualNetworkInner inner) {
        return  new PrivateCloudLocationVirtualNetworkModelImpl(inner, manager());
    }

    @Override
    public Observable<PrivateCloudLocationVirtualNetworkModel> getAsync(String pcName, String virtualNetworkName) {
        VirtualNetworkByPCsInner client = this.inner();
        return client.getAsync(pcName, virtualNetworkName)
        .map(new Func1<VirtualNetworkInner, PrivateCloudLocationVirtualNetworkModel>() {
            @Override
            public PrivateCloudLocationVirtualNetworkModel call(VirtualNetworkInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
