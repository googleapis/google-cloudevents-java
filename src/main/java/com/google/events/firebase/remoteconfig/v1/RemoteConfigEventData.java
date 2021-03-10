/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.firebase.remoteconfig.v1;

import java.time.OffsetDateTime;

/**
 * The data within all Firebase Remote Config events.
 */
public class RemoteConfigEventData {
    private String description;
    private Long rollbackSource;
    private UpdateOrigin updateOrigin;
    private OffsetDateTime updateTime;
    private UpdateType updateType;
    private UpdateUser updateUser;
    private Long versionNumber;

    /**
     * The user-provided description of the corresponding Remote Config template.
     */
    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    /**
     * Only present if this version is the result of a rollback, and will be the
     * version number of the Remote Config template that was rolled-back to.
     */
    public Long getRollbackSource() { return rollbackSource; }
    public void setRollbackSource(Long value) { this.rollbackSource = value; }

    /**
     * Where the update action originated.
     */
    public UpdateOrigin getUpdateOrigin() { return updateOrigin; }
    public void setUpdateOrigin(UpdateOrigin value) { this.updateOrigin = value; }

    /**
     * When the Remote Config template was written to the Remote Config server.
     */
    public OffsetDateTime getUpdateTime() { return updateTime; }
    public void setUpdateTime(OffsetDateTime value) { this.updateTime = value; }

    /**
     * What type of update was made.
     */
    public UpdateType getUpdateType() { return updateType; }
    public void setUpdateType(UpdateType value) { this.updateType = value; }

    /**
     * Aggregation of all metadata fields about the account that performed the
     * update.
     */
    public UpdateUser getUpdateUser() { return updateUser; }
    public void setUpdateUser(UpdateUser value) { this.updateUser = value; }

    /**
     * The version number of the version's corresponding Remote Config template.
     */
    public Long getVersionNumber() { return versionNumber; }
    public void setVersionNumber(Long value) { this.versionNumber = value; }
}
