/**
 * Copyright 2020 Google LLC
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

package com.google.events.firebase.analytics.v1;

/**
 * Information regarding the bundle in which these events were uploaded.
 */
public class BundleInfo {
    private Long bundleSequenceID;
    private IntValue serverTimestampOffsetMicros;

    /**
     * Monotonically increasing index for each bundle set by SDK.
     */
    public Long getBundleSequenceID() { return bundleSequenceID; }
    public void setBundleSequenceID(Long value) { this.bundleSequenceID = value; }

    /**
     * Timestamp offset between collection time and upload time.
     */
    public IntValue getServerTimestampOffsetMicros() { return serverTimestampOffsetMicros; }
    public void setServerTimestampOffsetMicros(IntValue value) { this.serverTimestampOffsetMicros = value; }
}
