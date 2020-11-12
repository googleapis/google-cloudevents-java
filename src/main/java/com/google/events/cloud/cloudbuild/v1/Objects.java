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

package com.google.events.cloud.cloudbuild.v1;

/**
 * A list of objects to be uploaded to Cloud Storage upon successful
 * completion of all build steps.
 *
 * Files in the workspace matching specified paths globs will be uploaded to
 * the specified Cloud Storage location using the builder service account's
 * credentials.
 *
 * The location and generation of the uploaded objects will be stored in the
 * Build resource's results field.
 *
 * If any objects fail to be pushed, the build is marked FAILURE.
 */
public class Objects {
    private String location;
    private String[] paths;
    private ObjectsTiming timing;

    /**
     * Cloud Storage bucket and optional object path, in the form
     * "gs://bucket/path/to/somewhere/". (see [Bucket Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     *
     * Files in the workspace matching any path pattern will be uploaded to
     * Cloud Storage with this location as a prefix.
     */
    public String getLocation() { return location; }
    public void setLocation(String value) { this.location = value; }

    /**
     * Path globs used to match files in the build's workspace.
     */
    public String[] getPaths() { return paths; }
    public void setPaths(String[] value) { this.paths = value; }

    /**
     * Stores timing information for pushing all artifact objects.
     */
    public ObjectsTiming getTiming() { return timing; }
    public void setTiming(ObjectsTiming value) { this.timing = value; }
}
