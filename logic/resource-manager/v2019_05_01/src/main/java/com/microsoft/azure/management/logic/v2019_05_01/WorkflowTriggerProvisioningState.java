/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WorkflowTriggerProvisioningState.
 */
public final class WorkflowTriggerProvisioningState extends ExpandableStringEnum<WorkflowTriggerProvisioningState> {
    /** Static value NotSpecified for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Accepted for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState ACCEPTED = fromString("Accepted");

    /** Static value Running for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState RUNNING = fromString("Running");

    /** Static value Ready for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState READY = fromString("Ready");

    /** Static value Creating for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState CREATING = fromString("Creating");

    /** Static value Created for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState CREATED = fromString("Created");

    /** Static value Deleting for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState DELETING = fromString("Deleting");

    /** Static value Deleted for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState DELETED = fromString("Deleted");

    /** Static value Canceled for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState FAILED = fromString("Failed");

    /** Static value Succeeded for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Moving for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState MOVING = fromString("Moving");

    /** Static value Updating for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState UPDATING = fromString("Updating");

    /** Static value Registering for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState REGISTERING = fromString("Registering");

    /** Static value Registered for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState REGISTERED = fromString("Registered");

    /** Static value Unregistering for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState UNREGISTERING = fromString("Unregistering");

    /** Static value Unregistered for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState UNREGISTERED = fromString("Unregistered");

    /** Static value Completed for WorkflowTriggerProvisioningState. */
    public static final WorkflowTriggerProvisioningState COMPLETED = fromString("Completed");

    /**
     * Creates or finds a WorkflowTriggerProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding WorkflowTriggerProvisioningState
     */
    @JsonCreator
    public static WorkflowTriggerProvisioningState fromString(String name) {
        return fromString(name, WorkflowTriggerProvisioningState.class);
    }

    /**
     * @return known WorkflowTriggerProvisioningState values
     */
    public static Collection<WorkflowTriggerProvisioningState> values() {
        return values(WorkflowTriggerProvisioningState.class);
    }
}