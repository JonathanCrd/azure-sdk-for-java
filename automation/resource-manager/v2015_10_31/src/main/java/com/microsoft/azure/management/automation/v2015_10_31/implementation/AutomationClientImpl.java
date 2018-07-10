/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;

/**
 * Initializes a new instance of the AutomationClientImpl class.
 */
public class AutomationClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public AutomationClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutomationClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutomationClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutomationClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The AutomationAccountsInner object to access its operations.
     */
    private AutomationAccountsInner automationAccounts;

    /**
     * Gets the AutomationAccountsInner object to access its operations.
     * @return the AutomationAccountsInner object.
     */
    public AutomationAccountsInner automationAccounts() {
        return this.automationAccounts;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The StatisticsInner object to access its operations.
     */
    private StatisticsInner statistics;

    /**
     * Gets the StatisticsInner object to access its operations.
     * @return the StatisticsInner object.
     */
    public StatisticsInner statistics() {
        return this.statistics;
    }

    /**
     * The UsagesInner object to access its operations.
     */
    private UsagesInner usages;

    /**
     * Gets the UsagesInner object to access its operations.
     * @return the UsagesInner object.
     */
    public UsagesInner usages() {
        return this.usages;
    }

    /**
     * The KeysInner object to access its operations.
     */
    private KeysInner keys;

    /**
     * Gets the KeysInner object to access its operations.
     * @return the KeysInner object.
     */
    public KeysInner keys() {
        return this.keys;
    }

    /**
     * The CertificatesInner object to access its operations.
     */
    private CertificatesInner certificates;

    /**
     * Gets the CertificatesInner object to access its operations.
     * @return the CertificatesInner object.
     */
    public CertificatesInner certificates() {
        return this.certificates;
    }

    /**
     * The ConnectionsInner object to access its operations.
     */
    private ConnectionsInner connections;

    /**
     * Gets the ConnectionsInner object to access its operations.
     * @return the ConnectionsInner object.
     */
    public ConnectionsInner connections() {
        return this.connections;
    }

    /**
     * The ConnectionTypesInner object to access its operations.
     */
    private ConnectionTypesInner connectionTypes;

    /**
     * Gets the ConnectionTypesInner object to access its operations.
     * @return the ConnectionTypesInner object.
     */
    public ConnectionTypesInner connectionTypes() {
        return this.connectionTypes;
    }

    /**
     * The CredentialsInner object to access its operations.
     */
    private CredentialsInner credentials;

    /**
     * Gets the CredentialsInner object to access its operations.
     * @return the CredentialsInner object.
     */
    public CredentialsInner credentials() {
        return this.credentials;
    }

    /**
     * The DscCompilationJobsInner object to access its operations.
     */
    private DscCompilationJobsInner dscCompilationJobs;

    /**
     * Gets the DscCompilationJobsInner object to access its operations.
     * @return the DscCompilationJobsInner object.
     */
    public DscCompilationJobsInner dscCompilationJobs() {
        return this.dscCompilationJobs;
    }

    /**
     * The DscCompilationJobStreamsInner object to access its operations.
     */
    private DscCompilationJobStreamsInner dscCompilationJobStreams;

    /**
     * Gets the DscCompilationJobStreamsInner object to access its operations.
     * @return the DscCompilationJobStreamsInner object.
     */
    public DscCompilationJobStreamsInner dscCompilationJobStreams() {
        return this.dscCompilationJobStreams;
    }

    /**
     * The DscConfigurationsInner object to access its operations.
     */
    private DscConfigurationsInner dscConfigurations;

    /**
     * Gets the DscConfigurationsInner object to access its operations.
     * @return the DscConfigurationsInner object.
     */
    public DscConfigurationsInner dscConfigurations() {
        return this.dscConfigurations;
    }

    /**
     * The AgentRegistrationInformationsInner object to access its operations.
     */
    private AgentRegistrationInformationsInner agentRegistrationInformations;

    /**
     * Gets the AgentRegistrationInformationsInner object to access its operations.
     * @return the AgentRegistrationInformationsInner object.
     */
    public AgentRegistrationInformationsInner agentRegistrationInformations() {
        return this.agentRegistrationInformations;
    }

    /**
     * The DscNodesInner object to access its operations.
     */
    private DscNodesInner dscNodes;

    /**
     * Gets the DscNodesInner object to access its operations.
     * @return the DscNodesInner object.
     */
    public DscNodesInner dscNodes() {
        return this.dscNodes;
    }

    /**
     * The NodeReportsInner object to access its operations.
     */
    private NodeReportsInner nodeReports;

    /**
     * Gets the NodeReportsInner object to access its operations.
     * @return the NodeReportsInner object.
     */
    public NodeReportsInner nodeReports() {
        return this.nodeReports;
    }

    /**
     * The DscNodeConfigurationsInner object to access its operations.
     */
    private DscNodeConfigurationsInner dscNodeConfigurations;

    /**
     * Gets the DscNodeConfigurationsInner object to access its operations.
     * @return the DscNodeConfigurationsInner object.
     */
    public DscNodeConfigurationsInner dscNodeConfigurations() {
        return this.dscNodeConfigurations;
    }

    /**
     * The HybridRunbookWorkerGroupsInner object to access its operations.
     */
    private HybridRunbookWorkerGroupsInner hybridRunbookWorkerGroups;

    /**
     * Gets the HybridRunbookWorkerGroupsInner object to access its operations.
     * @return the HybridRunbookWorkerGroupsInner object.
     */
    public HybridRunbookWorkerGroupsInner hybridRunbookWorkerGroups() {
        return this.hybridRunbookWorkerGroups;
    }

    /**
     * The JobsInner object to access its operations.
     */
    private JobsInner jobs;

    /**
     * Gets the JobsInner object to access its operations.
     * @return the JobsInner object.
     */
    public JobsInner jobs() {
        return this.jobs;
    }

    /**
     * The JobStreamsInner object to access its operations.
     */
    private JobStreamsInner jobStreams;

    /**
     * Gets the JobStreamsInner object to access its operations.
     * @return the JobStreamsInner object.
     */
    public JobStreamsInner jobStreams() {
        return this.jobStreams;
    }

    /**
     * The JobSchedulesInner object to access its operations.
     */
    private JobSchedulesInner jobSchedules;

    /**
     * Gets the JobSchedulesInner object to access its operations.
     * @return the JobSchedulesInner object.
     */
    public JobSchedulesInner jobSchedules() {
        return this.jobSchedules;
    }

    /**
     * The LinkedWorkspacesInner object to access its operations.
     */
    private LinkedWorkspacesInner linkedWorkspaces;

    /**
     * Gets the LinkedWorkspacesInner object to access its operations.
     * @return the LinkedWorkspacesInner object.
     */
    public LinkedWorkspacesInner linkedWorkspaces() {
        return this.linkedWorkspaces;
    }

    /**
     * The ActivitysInner object to access its operations.
     */
    private ActivitysInner activitys;

    /**
     * Gets the ActivitysInner object to access its operations.
     * @return the ActivitysInner object.
     */
    public ActivitysInner activitys() {
        return this.activitys;
    }

    /**
     * The ModulesInner object to access its operations.
     */
    private ModulesInner modules;

    /**
     * Gets the ModulesInner object to access its operations.
     * @return the ModulesInner object.
     */
    public ModulesInner modules() {
        return this.modules;
    }

    /**
     * The ObjectDataTypesInner object to access its operations.
     */
    private ObjectDataTypesInner objectDataTypes;

    /**
     * Gets the ObjectDataTypesInner object to access its operations.
     * @return the ObjectDataTypesInner object.
     */
    public ObjectDataTypesInner objectDataTypes() {
        return this.objectDataTypes;
    }

    /**
     * The FieldsInner object to access its operations.
     */
    private FieldsInner fields;

    /**
     * Gets the FieldsInner object to access its operations.
     * @return the FieldsInner object.
     */
    public FieldsInner fields() {
        return this.fields;
    }

    /**
     * The RunbookDraftsInner object to access its operations.
     */
    private RunbookDraftsInner runbookDrafts;

    /**
     * Gets the RunbookDraftsInner object to access its operations.
     * @return the RunbookDraftsInner object.
     */
    public RunbookDraftsInner runbookDrafts() {
        return this.runbookDrafts;
    }

    /**
     * The RunbooksInner object to access its operations.
     */
    private RunbooksInner runbooks;

    /**
     * Gets the RunbooksInner object to access its operations.
     * @return the RunbooksInner object.
     */
    public RunbooksInner runbooks() {
        return this.runbooks;
    }

    /**
     * The TestJobStreamsInner object to access its operations.
     */
    private TestJobStreamsInner testJobStreams;

    /**
     * Gets the TestJobStreamsInner object to access its operations.
     * @return the TestJobStreamsInner object.
     */
    public TestJobStreamsInner testJobStreams() {
        return this.testJobStreams;
    }

    /**
     * The TestJobsInner object to access its operations.
     */
    private TestJobsInner testJobs;

    /**
     * Gets the TestJobsInner object to access its operations.
     * @return the TestJobsInner object.
     */
    public TestJobsInner testJobs() {
        return this.testJobs;
    }

    /**
     * The SchedulesInner object to access its operations.
     */
    private SchedulesInner schedules;

    /**
     * Gets the SchedulesInner object to access its operations.
     * @return the SchedulesInner object.
     */
    public SchedulesInner schedules() {
        return this.schedules;
    }

    /**
     * The VariablesInner object to access its operations.
     */
    private VariablesInner variables;

    /**
     * Gets the VariablesInner object to access its operations.
     * @return the VariablesInner object.
     */
    public VariablesInner variables() {
        return this.variables;
    }

    /**
     * The WebhooksInner object to access its operations.
     */
    private WebhooksInner webhooks;

    /**
     * Gets the WebhooksInner object to access its operations.
     * @return the WebhooksInner object.
     */
    public WebhooksInner webhooks() {
        return this.webhooks;
    }

    /**
     * Initializes an instance of AutomationClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutomationClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of AutomationClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutomationClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AutomationClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutomationClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.automationAccounts = new AutomationAccountsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.statistics = new StatisticsInner(restClient().retrofit(), this);
        this.usages = new UsagesInner(restClient().retrofit(), this);
        this.keys = new KeysInner(restClient().retrofit(), this);
        this.certificates = new CertificatesInner(restClient().retrofit(), this);
        this.connections = new ConnectionsInner(restClient().retrofit(), this);
        this.connectionTypes = new ConnectionTypesInner(restClient().retrofit(), this);
        this.credentials = new CredentialsInner(restClient().retrofit(), this);
        this.dscCompilationJobs = new DscCompilationJobsInner(restClient().retrofit(), this);
        this.dscCompilationJobStreams = new DscCompilationJobStreamsInner(restClient().retrofit(), this);
        this.dscConfigurations = new DscConfigurationsInner(restClient().retrofit(), this);
        this.agentRegistrationInformations = new AgentRegistrationInformationsInner(restClient().retrofit(), this);
        this.dscNodes = new DscNodesInner(restClient().retrofit(), this);
        this.nodeReports = new NodeReportsInner(restClient().retrofit(), this);
        this.dscNodeConfigurations = new DscNodeConfigurationsInner(restClient().retrofit(), this);
        this.hybridRunbookWorkerGroups = new HybridRunbookWorkerGroupsInner(restClient().retrofit(), this);
        this.jobs = new JobsInner(restClient().retrofit(), this);
        this.jobStreams = new JobStreamsInner(restClient().retrofit(), this);
        this.jobSchedules = new JobSchedulesInner(restClient().retrofit(), this);
        this.linkedWorkspaces = new LinkedWorkspacesInner(restClient().retrofit(), this);
        this.activitys = new ActivitysInner(restClient().retrofit(), this);
        this.modules = new ModulesInner(restClient().retrofit(), this);
        this.objectDataTypes = new ObjectDataTypesInner(restClient().retrofit(), this);
        this.fields = new FieldsInner(restClient().retrofit(), this);
        this.runbookDrafts = new RunbookDraftsInner(restClient().retrofit(), this);
        this.runbooks = new RunbooksInner(restClient().retrofit(), this);
        this.testJobStreams = new TestJobStreamsInner(restClient().retrofit(), this);
        this.testJobs = new TestJobsInner(restClient().retrofit(), this);
        this.schedules = new SchedulesInner(restClient().retrofit(), this);
        this.variables = new VariablesInner(restClient().retrofit(), this);
        this.webhooks = new WebhooksInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s)", super.userAgent(), "AutomationClient");
    }
}