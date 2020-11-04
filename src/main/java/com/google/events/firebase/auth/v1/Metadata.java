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

package com.google.events.firebase.auth.v1;

import java.time.OffsetDateTime;

/**
 * Additional metadata about the user.
 */
public class Metadata {
    private OffsetDateTime createdAt;
    private OffsetDateTime lastSignedInAt;

    /**
     * The date the user was created.
     */
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    /**
     * The date the user last signed in.
     */
    public OffsetDateTime getLastSignedInAt() { return lastSignedInAt; }
    public void setLastSignedInAt(OffsetDateTime value) { this.lastSignedInAt = value; }
}
