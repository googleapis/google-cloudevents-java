/**
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.cloudbuild.v1;

import java.time.OffsetDateTime;

/**
 * Stores timing information for executing this build step.
 *
 * Stores timing information for pushing all artifact objects.
 *
 * Start and end times for a build execution phase.
 */
public class StepTiming {
    private OffsetDateTime endTime;
    private OffsetDateTime startTime;

    /**
     * End of time span.
     */
    public OffsetDateTime getEndTime() { return endTime; }
    public void setEndTime(OffsetDateTime value) { this.endTime = value; }

    /**
     * Start of time span.
     */
    public OffsetDateTime getStartTime() { return startTime; }
    public void setStartTime(OffsetDateTime value) { this.startTime = value; }
}
