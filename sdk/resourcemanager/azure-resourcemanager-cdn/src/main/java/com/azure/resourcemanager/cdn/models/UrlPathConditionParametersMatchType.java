// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UrlPathConditionParametersMatchType. */
public final class UrlPathConditionParametersMatchType
    extends ExpandableStringEnum<UrlPathConditionParametersMatchType> {
    /** Static value Literal for UrlPathConditionParametersMatchType. */
    public static final UrlPathConditionParametersMatchType LITERAL = fromString("Literal");

    /** Static value Wildcard for UrlPathConditionParametersMatchType. */
    public static final UrlPathConditionParametersMatchType WILDCARD = fromString("Wildcard");

    /**
     * Creates or finds a UrlPathConditionParametersMatchType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UrlPathConditionParametersMatchType.
     */
    @JsonCreator
    public static UrlPathConditionParametersMatchType fromString(String name) {
        return fromString(name, UrlPathConditionParametersMatchType.class);
    }

    /** @return known UrlPathConditionParametersMatchType values. */
    public static Collection<UrlPathConditionParametersMatchType> values() {
        return values(UrlPathConditionParametersMatchType.class);
    }
}
