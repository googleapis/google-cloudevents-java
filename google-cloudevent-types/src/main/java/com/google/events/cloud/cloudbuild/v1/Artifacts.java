// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.events.cloud.cloudbuild.v1;

/**
 * Artifacts produced by the build that should be uploaded upon
 * successful completion of all build steps.
 */
public class Artifacts {
    private String[] images;
    private Objects objects;

    /**
     * A list of images to be pushed upon the successful completion of all build
     * steps.
     *
     * The images will be pushed using the builder service account's credentials.
     *
     * The digests of the pushed images will be stored in the Build resource's
     * results field.
     *
     * If any of the images fail to be pushed, the build is marked FAILURE.
     */
    public String[] getImages() { return images; }
    public void setImages(String[] value) { this.images = value; }

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
    public Objects getObjects() { return objects; }
    public void setObjects(Objects value) { this.objects = value; }
}
