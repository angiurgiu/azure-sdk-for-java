/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.model;

/**
 * The final stage of the child object definition, at which it can be attached to the parent, using {@link Attachable#attach()}.
 *
 * @param <ParentT> the parent definition {@link Attachable#attach()} returns to
 */
public interface Attachable<ParentT> {
    /**
     * Attaches this child object's definition to its parent's definition.
     * @return the next stage of the parent object's definition
     */
    ParentT attach();

    /**
     * The final stage of the child object definition, as which it can be attached to the parent
     * as part of the parent's definition, using {@link InDefinition#attach()}.
     * @param <ParentT> the parent definition {@link InDefinition#attach()} returns to
     */
    interface InDefinition<ParentT> {
        ParentT attach();
    }

    /**
     * The final stage of the child object definition, as which it can be attached to the parent
     * as part of the parent's update, using {@link InUpdate#attach()}.
     * @param <ParentT> the parent definition {@link InUpdate#attach()} returns to
     */
    interface InUpdate<ParentT> {
        ParentT attach();
    }
}
