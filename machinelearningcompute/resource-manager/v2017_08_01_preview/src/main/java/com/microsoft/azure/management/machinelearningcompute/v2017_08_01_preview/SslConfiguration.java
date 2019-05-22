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
 * SSL configuration. If configured data-plane calls to user services will be
 * exposed over SSL only.
 */
public class SslConfiguration {
    /**
     * SSL status. Allowed values are Enabled and Disabled. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "status")
    private Status status;

    /**
     * The SSL cert data in PEM format.
     */
    @JsonProperty(value = "cert")
    private String cert;

    /**
     * The SSL key data in PEM format. This is not returned in response of
     * GET/PUT on the resource. To see this please call listKeys API.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * The CName of the certificate.
     */
    @JsonProperty(value = "cname")
    private String cname;

    /**
     * Get sSL status. Allowed values are Enabled and Disabled. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set sSL status. Allowed values are Enabled and Disabled. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the SslConfiguration object itself.
     */
    public SslConfiguration withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the SSL cert data in PEM format.
     *
     * @return the cert value
     */
    public String cert() {
        return this.cert;
    }

    /**
     * Set the SSL cert data in PEM format.
     *
     * @param cert the cert value to set
     * @return the SslConfiguration object itself.
     */
    public SslConfiguration withCert(String cert) {
        this.cert = cert;
        return this;
    }

    /**
     * Get the SSL key data in PEM format. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the SSL key data in PEM format. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     *
     * @param key the key value to set
     * @return the SslConfiguration object itself.
     */
    public SslConfiguration withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the CName of the certificate.
     *
     * @return the cname value
     */
    public String cname() {
        return this.cname;
    }

    /**
     * Set the CName of the certificate.
     *
     * @param cname the cname value to set
     * @return the SslConfiguration object itself.
     */
    public SslConfiguration withCname(String cname) {
        this.cname = cname;
        return this;
    }

}