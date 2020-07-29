// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListVirtualHubBgpConnectionResults model. */
@Fluent
public final class ListVirtualHubBgpConnectionResultsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListVirtualHubBgpConnectionResultsInner.class);

    /*
     * The list of VirtualHubBgpConnections.
     */
    @JsonProperty(value = "value")
    private List<BgpConnectionInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of VirtualHubBgpConnections.
     *
     * @return the value value.
     */
    public List<BgpConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of VirtualHubBgpConnections.
     *
     * @param value the value value to set.
     * @return the ListVirtualHubBgpConnectionResultsInner object itself.
     */
    public ListVirtualHubBgpConnectionResultsInner withValue(List<BgpConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListVirtualHubBgpConnectionResultsInner object itself.
     */
    public ListVirtualHubBgpConnectionResultsInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
