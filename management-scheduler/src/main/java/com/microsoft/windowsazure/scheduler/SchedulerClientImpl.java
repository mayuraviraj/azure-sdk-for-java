/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.scheduler;

import com.microsoft.windowsazure.core.ServiceClient;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import com.microsoft.windowsazure.management.configuration.ManagementConfiguration;
import com.microsoft.windowsazure.scheduler.models.JobActionType;
import com.microsoft.windowsazure.scheduler.models.JobHistoryActionName;
import com.microsoft.windowsazure.scheduler.models.JobHistoryStatus;
import com.microsoft.windowsazure.scheduler.models.JobRecurrenceFrequency;
import com.microsoft.windowsazure.scheduler.models.JobScheduleDay;
import com.microsoft.windowsazure.scheduler.models.JobState;
import com.microsoft.windowsazure.scheduler.models.RetryType;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.http.impl.client.HttpClientBuilder;

public class SchedulerClientImpl extends ServiceClient<SchedulerClient> implements SchedulerClient {
    private String apiVersion;
    
    /**
    * Gets the API version.
    * @return The ApiVersion value.
    */
    public String getApiVersion() {
        return this.apiVersion;
    }
    
    private URI baseUri;
    
    /**
    * Gets the URI used as the base for all cloud service requests.
    * @return The BaseUri value.
    */
    public URI getBaseUri() {
        return this.baseUri;
    }
    
    private String cloudServiceName;
    
    /**
    * @return The CloudServiceName value.
    */
    public String getCloudServiceName() {
        return this.cloudServiceName;
    }
    
    /**
    * @param cloudServiceNameValue The CloudServiceName value.
    */
    public void setCloudServiceName(final String cloudServiceNameValue) {
        this.cloudServiceName = cloudServiceNameValue;
    }
    
    private SubscriptionCloudCredentials credentials;
    
    /**
    * Gets subscription credentials which uniquely identify Microsoft Azure
    * subscription. The subscription ID forms part of the URI for every
    * service call.
    * @return The Credentials value.
    */
    public SubscriptionCloudCredentials getCredentials() {
        return this.credentials;
    }
    
    private String jobCollectionName;
    
    /**
    * @return The JobCollectionName value.
    */
    public String getJobCollectionName() {
        return this.jobCollectionName;
    }
    
    /**
    * @param jobCollectionNameValue The JobCollectionName value.
    */
    public void setJobCollectionName(final String jobCollectionNameValue) {
        this.jobCollectionName = jobCollectionNameValue;
    }
    
    private int longRunningOperationInitialTimeout;
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @return The LongRunningOperationInitialTimeout value.
    */
    public int getLongRunningOperationInitialTimeout() {
        return this.longRunningOperationInitialTimeout;
    }
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @param longRunningOperationInitialTimeoutValue The
    * LongRunningOperationInitialTimeout value.
    */
    public void setLongRunningOperationInitialTimeout(final int longRunningOperationInitialTimeoutValue) {
        this.longRunningOperationInitialTimeout = longRunningOperationInitialTimeoutValue;
    }
    
    private int longRunningOperationRetryTimeout;
    
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @return The LongRunningOperationRetryTimeout value.
    */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }
    
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @param longRunningOperationRetryTimeoutValue The
    * LongRunningOperationRetryTimeout value.
    */
    public void setLongRunningOperationRetryTimeout(final int longRunningOperationRetryTimeoutValue) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeoutValue;
    }
    
    private JobOperations jobs;
    
    /**
    * @return The JobsOperations value.
    */
    public JobOperations getJobsOperations() {
        return this.jobs;
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    private SchedulerClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService) {
        super(httpBuilder, executorService);
        this.jobs = new JobOperationsImpl(this);
        this.apiVersion = "2013-03-01";
        this.longRunningOperationInitialTimeout = -1;
        this.longRunningOperationRetryTimeout = -1;
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param cloudServiceName Required.
    * @param jobCollectionName Required.
    * @param credentials Required. Gets subscription credentials which uniquely
    * identify Microsoft Azure subscription. The subscription ID forms part of
    * the URI for every service call.
    * @param baseUri Required. Gets the URI used as the base for all cloud
    * service requests.
    */
    @Inject
    public SchedulerClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, @Named(ManagementConfiguration.CLOUD_SERVICE_NAME) String cloudServiceName, @Named(ManagementConfiguration.JOB_COLLECTION_NAME) String jobCollectionName, @Named(ManagementConfiguration.SUBSCRIPTION_CLOUD_CREDENTIALS) SubscriptionCloudCredentials credentials, @Named(ManagementConfiguration.URI) URI baseUri) {
        this(httpBuilder, executorService);
        if (cloudServiceName == null) {
            throw new NullPointerException("cloudServiceName");
        } else {
            this.cloudServiceName = cloudServiceName;
        }
        if (jobCollectionName == null) {
            throw new NullPointerException("jobCollectionName");
        } else {
            this.jobCollectionName = jobCollectionName;
        }
        if (credentials == null) {
            throw new NullPointerException("credentials");
        } else {
            this.credentials = credentials;
        }
        if (baseUri == null) {
            try {
                this.baseUri = new URI("https://management.core.windows.net/");
            }
            catch (URISyntaxException ex) {
            }
        } else {
            this.baseUri = baseUri;
        }
        this.cloudServiceName = cloudServiceName;
        this.jobCollectionName = jobCollectionName;
        this.credentials = credentials;
        this.baseUri = baseUri;
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param cloudServiceName Required.
    * @param jobCollectionName Required.
    * @param credentials Required. Gets subscription credentials which uniquely
    * identify Microsoft Azure subscription. The subscription ID forms part of
    * the URI for every service call.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    */
    public SchedulerClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, String cloudServiceName, String jobCollectionName, SubscriptionCloudCredentials credentials) throws URISyntaxException {
        this(httpBuilder, executorService);
        if (cloudServiceName == null) {
            throw new NullPointerException("cloudServiceName");
        }
        if (jobCollectionName == null) {
            throw new NullPointerException("jobCollectionName");
        }
        if (credentials == null) {
            throw new NullPointerException("credentials");
        }
        this.cloudServiceName = cloudServiceName;
        this.jobCollectionName = jobCollectionName;
        this.credentials = credentials;
        this.baseUri = new URI("https://management.core.windows.net/");
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param cloudServiceName Required.
    * @param jobCollectionName Required.
    * @param credentials Required. Gets subscription credentials which uniquely
    * identify Microsoft Azure subscription. The subscription ID forms part of
    * the URI for every service call.
    * @param baseUri Required. Gets the URI used as the base for all cloud
    * service requests.
    * @param apiVersion Required. Gets the API version.
    * @param longRunningOperationInitialTimeout Required. Gets or sets the
    * initial timeout for Long Running Operations.
    * @param longRunningOperationRetryTimeout Required. Gets or sets the retry
    * timeout for Long Running Operations.
    */
    public SchedulerClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, String cloudServiceName, String jobCollectionName, SubscriptionCloudCredentials credentials, URI baseUri, String apiVersion, int longRunningOperationInitialTimeout, int longRunningOperationRetryTimeout) {
        this(httpBuilder, executorService);
        this.cloudServiceName = cloudServiceName;
        this.jobCollectionName = jobCollectionName;
        this.credentials = credentials;
        this.baseUri = baseUri;
        this.apiVersion = apiVersion;
        this.longRunningOperationInitialTimeout = longRunningOperationInitialTimeout;
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    protected SchedulerClientImpl newInstance(HttpClientBuilder httpBuilder, ExecutorService executorService) {
        return new SchedulerClientImpl(httpBuilder, executorService, this.getCloudServiceName(), this.getJobCollectionName(), this.getCredentials(), this.getBaseUri(), this.getApiVersion(), this.getLongRunningOperationInitialTimeout(), this.getLongRunningOperationRetryTimeout());
    }
    
    /**
    * Parse enum values for type JobActionType.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobActionType parseJobActionType(String value) {
        if ("http".equalsIgnoreCase(value)) {
            return JobActionType.Http;
        }
        if ("https".equalsIgnoreCase(value)) {
            return JobActionType.Https;
        }
        if ("storageQueue".equalsIgnoreCase(value)) {
            return JobActionType.StorageQueue;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobActionType to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobActionTypeToString(JobActionType value) {
        if (value == JobActionType.Http) {
            return "http";
        }
        if (value == JobActionType.Https) {
            return "https";
        }
        if (value == JobActionType.StorageQueue) {
            return "storageQueue";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobHistoryActionName.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobHistoryActionName parseJobHistoryActionName(String value) {
        if ("MainAction".equalsIgnoreCase(value)) {
            return JobHistoryActionName.MainAction;
        }
        if ("ErrorAction".equalsIgnoreCase(value)) {
            return JobHistoryActionName.ErrorAction;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobHistoryActionName to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobHistoryActionNameToString(JobHistoryActionName value) {
        if (value == JobHistoryActionName.MainAction) {
            return "MainAction";
        }
        if (value == JobHistoryActionName.ErrorAction) {
            return "ErrorAction";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobHistoryStatus.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobHistoryStatus parseJobHistoryStatus(String value) {
        if ("completed".equalsIgnoreCase(value)) {
            return JobHistoryStatus.Completed;
        }
        if ("failed".equalsIgnoreCase(value)) {
            return JobHistoryStatus.Failed;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobHistoryStatus to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobHistoryStatusToString(JobHistoryStatus value) {
        if (value == JobHistoryStatus.Completed) {
            return "completed";
        }
        if (value == JobHistoryStatus.Failed) {
            return "failed";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobRecurrenceFrequency.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobRecurrenceFrequency parseJobRecurrenceFrequency(String value) {
        if ("minute".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.Minute;
        }
        if ("hour".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.Hour;
        }
        if ("day".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.Day;
        }
        if ("week".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.Week;
        }
        if ("month".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.Month;
        }
        if ("year".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.Year;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobRecurrenceFrequency to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobRecurrenceFrequencyToString(JobRecurrenceFrequency value) {
        if (value == JobRecurrenceFrequency.Minute) {
            return "minute";
        }
        if (value == JobRecurrenceFrequency.Hour) {
            return "hour";
        }
        if (value == JobRecurrenceFrequency.Day) {
            return "day";
        }
        if (value == JobRecurrenceFrequency.Week) {
            return "week";
        }
        if (value == JobRecurrenceFrequency.Month) {
            return "month";
        }
        if (value == JobRecurrenceFrequency.Year) {
            return "year";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobScheduleDay.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobScheduleDay parseJobScheduleDay(String value) {
        if ("monday".equalsIgnoreCase(value)) {
            return JobScheduleDay.Monday;
        }
        if ("tuesday".equalsIgnoreCase(value)) {
            return JobScheduleDay.Tuesday;
        }
        if ("wednesday".equalsIgnoreCase(value)) {
            return JobScheduleDay.Wednesday;
        }
        if ("thursday".equalsIgnoreCase(value)) {
            return JobScheduleDay.Thursday;
        }
        if ("friday".equalsIgnoreCase(value)) {
            return JobScheduleDay.Friday;
        }
        if ("saturday".equalsIgnoreCase(value)) {
            return JobScheduleDay.Saturday;
        }
        if ("sunday".equalsIgnoreCase(value)) {
            return JobScheduleDay.Sunday;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobScheduleDay to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobScheduleDayToString(JobScheduleDay value) {
        if (value == JobScheduleDay.Monday) {
            return "monday";
        }
        if (value == JobScheduleDay.Tuesday) {
            return "tuesday";
        }
        if (value == JobScheduleDay.Wednesday) {
            return "wednesday";
        }
        if (value == JobScheduleDay.Thursday) {
            return "thursday";
        }
        if (value == JobScheduleDay.Friday) {
            return "friday";
        }
        if (value == JobScheduleDay.Saturday) {
            return "saturday";
        }
        if (value == JobScheduleDay.Sunday) {
            return "sunday";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobState.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobState parseJobState(String value) {
        if ("enabled".equalsIgnoreCase(value)) {
            return JobState.Enabled;
        }
        if ("disabled".equalsIgnoreCase(value)) {
            return JobState.Disabled;
        }
        if ("faulted".equalsIgnoreCase(value)) {
            return JobState.Faulted;
        }
        if ("completed".equalsIgnoreCase(value)) {
            return JobState.Completed;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobState to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobStateToString(JobState value) {
        if (value == JobState.Enabled) {
            return "enabled";
        }
        if (value == JobState.Disabled) {
            return "disabled";
        }
        if (value == JobState.Faulted) {
            return "faulted";
        }
        if (value == JobState.Completed) {
            return "completed";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type RetryType.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static RetryType parseRetryType(String value) {
        if ("none".equalsIgnoreCase(value)) {
            return RetryType.None;
        }
        if ("fixed".equalsIgnoreCase(value)) {
            return RetryType.Fixed;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type RetryType to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String retryTypeToString(RetryType value) {
        if (value == RetryType.None) {
            return "none";
        }
        if (value == RetryType.Fixed) {
            return "fixed";
        }
        throw new IllegalArgumentException("value");
    }
}