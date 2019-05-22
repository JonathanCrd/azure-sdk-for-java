/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Kubernetes cluster specific properties.
 */
public class KubernetesClusterProperties {
    /**
     * The Azure Service Principal used by Kubernetes.
     */
    @JsonProperty(value = "servicePrincipal")
    private ServicePrincipalProperties servicePrincipal;

    /**
     * Get the Azure Service Principal used by Kubernetes.
     *
     * @return the servicePrincipal value
     */
    public ServicePrincipalProperties servicePrincipal() {
        return this.servicePrincipal;
    }

    /**
     * Set the Azure Service Principal used by Kubernetes.
     *
     * @param servicePrincipal the servicePrincipal value to set
     * @return the KubernetesClusterProperties object itself.
     */
    public KubernetesClusterProperties withServicePrincipal(ServicePrincipalProperties servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

}