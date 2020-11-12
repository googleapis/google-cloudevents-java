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
 * An image built by the pipeline.
 */
public class Image {
    private String digest;
    private String name;
    private PushTiming pushTiming;

    /**
     * Docker Registry 2.0 digest.
     */
    public String getDigest() { return digest; }
    public void setDigest(String value) { this.digest = value; }

    /**
     * Name used to push the container image to Google Container Registry, as
     * presented to `docker push`.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    /**
     * Stores timing information for pushing the specified image.
     */
    public PushTiming getPushTiming() { return pushTiming; }
    public void setPushTiming(PushTiming value) { this.pushTiming = value; }
}
