/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

<<<<<<< HEAD:eventhubs/resource-manager/v2015_08_01/src/main/java/com/microsoft/azure/management/eventhubs/v2015_08_01/AccessRights.java
package com.microsoft.azure.management.eventhubs.v2015_08_01;
=======
package com.microsoft.azure.management.servicebus.v2017_04_01;
>>>>>>> upstream/master:servicebus/resource-manager/v2017_04_01/src/main/java/com/microsoft/azure/management/servicebus/v2017_04_01/RoleDisasterRecovery.java

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
<<<<<<< HEAD:eventhubs/resource-manager/v2015_08_01/src/main/java/com/microsoft/azure/management/eventhubs/v2015_08_01/AccessRights.java
 * Defines values for AccessRights.
 */
public enum AccessRights {
    /** Enum value Manage. */
    MANAGE("Manage"),

    /** Enum value Send. */
    SEND("Send"),

    /** Enum value Listen. */
    LISTEN("Listen");

    /** The actual serialized value for a AccessRights instance. */
    private String value;

    AccessRights(String value) {
=======
 * Defines values for RoleDisasterRecovery.
 */
public enum RoleDisasterRecovery {
    /** Enum value Primary. */
    PRIMARY("Primary"),

    /** Enum value PrimaryNotReplicating. */
    PRIMARY_NOT_REPLICATING("PrimaryNotReplicating"),

    /** Enum value Secondary. */
    SECONDARY("Secondary");

    /** The actual serialized value for a RoleDisasterRecovery instance. */
    private String value;

    RoleDisasterRecovery(String value) {
>>>>>>> upstream/master:servicebus/resource-manager/v2017_04_01/src/main/java/com/microsoft/azure/management/servicebus/v2017_04_01/RoleDisasterRecovery.java
        this.value = value;
    }

    /**
<<<<<<< HEAD:eventhubs/resource-manager/v2015_08_01/src/main/java/com/microsoft/azure/management/eventhubs/v2015_08_01/AccessRights.java
     * Parses a serialized value to a AccessRights instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccessRights object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessRights fromString(String value) {
        AccessRights[] items = AccessRights.values();
        for (AccessRights item : items) {
=======
     * Parses a serialized value to a RoleDisasterRecovery instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RoleDisasterRecovery object, or null if unable to parse.
     */
    @JsonCreator
    public static RoleDisasterRecovery fromString(String value) {
        RoleDisasterRecovery[] items = RoleDisasterRecovery.values();
        for (RoleDisasterRecovery item : items) {
>>>>>>> upstream/master:servicebus/resource-manager/v2017_04_01/src/main/java/com/microsoft/azure/management/servicebus/v2017_04_01/RoleDisasterRecovery.java
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
