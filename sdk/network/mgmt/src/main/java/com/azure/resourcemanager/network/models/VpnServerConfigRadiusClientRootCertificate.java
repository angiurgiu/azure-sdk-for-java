// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpnServerConfigRadiusClientRootCertificate model. */
@Fluent
public final class VpnServerConfigRadiusClientRootCertificate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnServerConfigRadiusClientRootCertificate.class);

    /*
     * The certificate name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The Radius client root certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /**
     * Get the name property: The certificate name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The certificate name.
     *
     * @param name the name value to set.
     * @return the VpnServerConfigRadiusClientRootCertificate object itself.
     */
    public VpnServerConfigRadiusClientRootCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the thumbprint property: The Radius client root certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The Radius client root certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the VpnServerConfigRadiusClientRootCertificate object itself.
     */
    public VpnServerConfigRadiusClientRootCertificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
