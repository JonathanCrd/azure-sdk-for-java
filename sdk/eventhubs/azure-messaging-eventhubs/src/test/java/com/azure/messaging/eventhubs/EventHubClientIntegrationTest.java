// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.http.rest.IterableResponse;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.eventhubs.implementation.ApiTestBase;
import com.azure.messaging.eventhubs.implementation.ConnectionStringProperties;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

public class EventHubClientIntegrationTest extends ApiTestBase {
    private EventHubClient client;

    @Rule
    public TestName testName = new TestName();

    public EventHubClientIntegrationTest() {
        super(new ClientLogger(EventHubClientIntegrationTest.class));
    }

    @Override
    protected String testName() {
        return testName.getMethodName();
    }

    @Override
    protected void beforeTest() {
        skipIfNotRecordMode();

        client = new EventHubClientBuilder()
            .connectionString(getConnectionString())
            .retry(RETRY_OPTIONS)
            .buildClient();
    }

    @Override
    protected void afterTest() {
        dispose(client);
    }

    /**
     * Verifies we can get partition ids of an Event Hub.
     */
    @Test
    public void getPartitionIds() {
        // Act
        final IterableResponse<String> response = client.getPartitionIds();

        // Assert
        Assert.assertNotNull(response);

        final List<String> partitionIds = response.stream().collect(Collectors.toList());
        Assert.assertTrue(partitionIds.size() > 1);
    }

    /**
     * Verifies we can get partition ids of an Event Hub.
     */
    @Test
    public void getMetadata() {
        // Arrange
        final ConnectionStringProperties connectionProperties = getConnectionStringProperties();

        // Act
        final EventHubProperties properties = client.getProperties();

        // Assert
        Assert.assertNotNull(properties);
        Assert.assertEquals(connectionProperties.eventHubName(), properties.name());
        Assert.assertTrue(properties.createdAt().isBefore(Instant.now()));

        Assert.assertNotNull(properties.partitionIds());
        Assert.assertTrue(properties.partitionIds().length > 1);
    }

    /**
     * Verifies we can get partition ids of an Event Hub.
     */
    @Test
    public void getPartitionProperties() {
        // Arrange
        final ConnectionStringProperties connectionProperties = getConnectionStringProperties();
        final EventHubProperties properties = client.getProperties();
        final String partitionId = properties.partitionIds()[0];

        // Act
        final PartitionProperties partitionProperties = client.getPartitionProperties(partitionId);

        // Assert
        Assert.assertNotNull(partitionProperties);

        Assert.assertEquals(connectionProperties.eventHubName(), partitionProperties.eventHubName());
        Assert.assertEquals(partitionId, partitionProperties.id());
    }
}
