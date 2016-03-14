/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a recommendation rule that the recommendation engine can perform.
 */
public class RecommendationRule {
    /**
     * Unique name of the rule.
     */
    private String name;

    /**
     * UI friendly name of the rule.
     */
    private String displayName;

    /**
     * Localized name of the rule (Good for UI).
     */
    private String message;

    /**
     * Recommendation ID of an associated recommendation object tied to the
     * rule, if exists.
     * If such an object doesn't exist, it is set to null.
     */
    private String recommendationId;

    /**
     * Localized detailed description of the rule.
     */
    private String description;

    /**
     * Name of action that is recommended by this rule in string.
     */
    private String actionName;

    /**
     * On/off flag indicating the rule is currently enabled or disabled.
     */
    private Integer enabled;

    /**
     * Level of impact indicating how critical this rule is. Possible values
     * include: 'Critical', 'Warning', 'Information', 'NonUrgentSuggestion'.
     */
    @JsonProperty(required = true)
    private NotificationLevel level;

    /**
     * List of available channels that this rule applies. Possible values
     * include: 'Notification', 'Api', 'Email', 'All'.
     */
    @JsonProperty(required = true)
    private Channels channels;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get the recommendationId value.
     *
     * @return the recommendationId value
     */
    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * Set the recommendationId value.
     *
     * @param recommendationId the recommendationId value to set
     */
    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the actionName value.
     *
     * @return the actionName value
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * Set the actionName value.
     *
     * @param actionName the actionName value to set
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Integer getEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * Get the level value.
     *
     * @return the level value
     */
    public NotificationLevel getLevel() {
        return this.level;
    }

    /**
     * Set the level value.
     *
     * @param level the level value to set
     */
    public void setLevel(NotificationLevel level) {
        this.level = level;
    }

    /**
     * Get the channels value.
     *
     * @return the channels value
     */
    public Channels getChannels() {
        return this.channels;
    }

    /**
     * Set the channels value.
     *
     * @param channels the channels value to set
     */
    public void setChannels(Channels channels) {
        this.channels = channels;
    }

}