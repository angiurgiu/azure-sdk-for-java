// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The FirewallPolicyFilterRule model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("FirewallPolicyFilterRule")
@Fluent
public final class FirewallPolicyFilterRule extends FirewallPolicyRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyFilterRule.class);

    /*
     * The action type of a Filter rule.
     */
    @JsonProperty(value = "action")
    private FirewallPolicyFilterRuleAction action;

    /*
     * Collection of rule conditions used by a rule.
     */
    @JsonProperty(value = "ruleConditions")
    private List<FirewallPolicyRuleCondition> ruleConditions;

    /**
     * Get the action property: The action type of a Filter rule.
     *
     * @return the action value.
     */
    public FirewallPolicyFilterRuleAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action type of a Filter rule.
     *
     * @param action the action value to set.
     * @return the FirewallPolicyFilterRule object itself.
     */
    public FirewallPolicyFilterRule withAction(FirewallPolicyFilterRuleAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the ruleConditions property: Collection of rule conditions used by a rule.
     *
     * @return the ruleConditions value.
     */
    public List<FirewallPolicyRuleCondition> ruleConditions() {
        return this.ruleConditions;
    }

    /**
     * Set the ruleConditions property: Collection of rule conditions used by a rule.
     *
     * @param ruleConditions the ruleConditions value to set.
     * @return the FirewallPolicyFilterRule object itself.
     */
    public FirewallPolicyFilterRule withRuleConditions(List<FirewallPolicyRuleCondition> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (action() != null) {
            action().validate();
        }
        if (ruleConditions() != null) {
            ruleConditions().forEach(e -> e.validate());
        }
    }
}
