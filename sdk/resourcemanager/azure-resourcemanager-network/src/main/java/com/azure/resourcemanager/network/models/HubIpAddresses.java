// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HubIpAddresses model. */
@Fluent
public final class HubIpAddresses {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HubIpAddresses.class);

    /*
     * Public IP addresses associated with azure firewall.
     */
    @JsonProperty(value = "publicIPs")
    private HubPublicIpAddresses publicIPs;

    /*
     * Private IP Address associated with azure firewall.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /**
     * Get the publicIPs property: Public IP addresses associated with azure firewall.
     *
     * @return the publicIPs value.
     */
    public HubPublicIpAddresses publicIPs() {
        return this.publicIPs;
    }

    /**
     * Set the publicIPs property: Public IP addresses associated with azure firewall.
     *
     * @param publicIPs the publicIPs value to set.
     * @return the HubIpAddresses object itself.
     */
    public HubIpAddresses withPublicIPs(HubPublicIpAddresses publicIPs) {
        this.publicIPs = publicIPs;
        return this;
    }

    /**
     * Get the privateIpAddress property: Private IP Address associated with azure firewall.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: Private IP Address associated with azure firewall.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the HubIpAddresses object itself.
     */
    public HubIpAddresses withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicIPs() != null) {
            publicIPs().validate();
        }
    }
}
