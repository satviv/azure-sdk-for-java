// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The StaticRoute model. */
@Fluent
public final class StaticRoute {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StaticRoute.class);

    /*
     * The name of the StaticRoute that is unique within a VnetRoute.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * List of all address prefixes.
     */
    @JsonProperty(value = "addressPrefixes")
    private List<String> addressPrefixes;

    /*
     * The ip address of the next hop.
     */
    @JsonProperty(value = "nextHopIpAddress")
    private String nextHopIpAddress;

    /**
     * Get the name property: The name of the StaticRoute that is unique within a VnetRoute.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the StaticRoute that is unique within a VnetRoute.
     *
     * @param name the name value to set.
     * @return the StaticRoute object itself.
     */
    public StaticRoute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the addressPrefixes property: List of all address prefixes.
     *
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes property: List of all address prefixes.
     *
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the StaticRoute object itself.
     */
    public StaticRoute withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the nextHopIpAddress property: The ip address of the next hop.
     *
     * @return the nextHopIpAddress value.
     */
    public String nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set the nextHopIpAddress property: The ip address of the next hop.
     *
     * @param nextHopIpAddress the nextHopIpAddress value to set.
     * @return the StaticRoute object itself.
     */
    public StaticRoute withNextHopIpAddress(String nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
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
