// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AzureFirewallNatRuleCollection model. */
@JsonFlatten
@Fluent
public class AzureFirewallNatRuleCollection extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFirewallNatRuleCollection.class);

    /*
     * The name of the resource that is unique within the Azure firewall. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Priority of the NAT rule collection resource.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /*
     * The action type of a NAT rule collection.
     */
    @JsonProperty(value = "properties.action")
    private AzureFirewallNatRCAction action;

    /*
     * Collection of rules used by a NAT rule collection.
     */
    @JsonProperty(value = "properties.rules")
    private List<AzureFirewallNatRule> rules;

    /*
     * The provisioning state of the NAT rule collection resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within the Azure firewall. This name can be used
     * to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the Azure firewall. This name can be used
     * to access the resource.
     *
     * @param name the name value to set.
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the priority property: Priority of the NAT rule collection resource.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the NAT rule collection resource.
     *
     * @param priority the priority value to set.
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action property: The action type of a NAT rule collection.
     *
     * @return the action value.
     */
    public AzureFirewallNatRCAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action type of a NAT rule collection.
     *
     * @param action the action value to set.
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withAction(AzureFirewallNatRCAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the rules property: Collection of rules used by a NAT rule collection.
     *
     * @return the rules value.
     */
    public List<AzureFirewallNatRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of rules used by a NAT rule collection.
     *
     * @param rules the rules value to set.
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withRules(List<AzureFirewallNatRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the NAT rule collection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() != null) {
            action().validate();
        }
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
