/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.privatedns.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An AAAA record.
 */
public class AaaaRecord {
    /**
     * The IPv6 address of this AAAA record.
     */
    @JsonProperty(value = "ipv6Address")
    private String ipv6Address;

    /**
     * Get the IPv6 address of this AAAA record.
     *
     * @return the ipv6Address value
     */
    public String ipv6Address() {
        return this.ipv6Address;
    }

    /**
     * Set the IPv6 address of this AAAA record.
     *
     * @param ipv6Address the ipv6Address value to set
     * @return the AaaaRecord object itself.
     */
    public AaaaRecord withIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

}