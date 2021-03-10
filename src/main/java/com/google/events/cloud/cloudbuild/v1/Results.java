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

package com.google.events.cloud.cloudbuild.v1;

/**
 * Results of the build.
 */
public class Results {
    private String artifactManifest;
    private ArtifactTiming artifactTiming;
    private String[] buildStepImages;
    private String[] buildStepOutputs;
    private Image[] images;
    private Long numArtifacts;

    /**
     * Path to the artifact manifest. Only populated when artifacts are uploaded.
     */
    public String getArtifactManifest() { return artifactManifest; }
    public void setArtifactManifest(String value) { this.artifactManifest = value; }

    /**
     * Time to push all non-container artifacts.
     */
    public ArtifactTiming getArtifactTiming() { return artifactTiming; }
    public void setArtifactTiming(ArtifactTiming value) { this.artifactTiming = value; }

    /**
     * List of build step digests, in the order corresponding to build step
     * indices.
     */
    public String[] getBuildStepImages() { return buildStepImages; }
    public void setBuildStepImages(String[] value) { this.buildStepImages = value; }

    /**
     * List of build step outputs, produced by builder images, in the order
     * corresponding to build step indices.
     *
     * [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders)
     * can produce this output by writing to `$BUILDER_OUTPUT/output`.
     * Only the first 4KB of data is stored.
     */
    public String[] getBuildStepOutputs() { return buildStepOutputs; }
    public void setBuildStepOutputs(String[] value) { this.buildStepOutputs = value; }

    /**
     * Container images that were built as a part of the build.
     */
    public Image[] getImages() { return images; }
    public void setImages(Image[] value) { this.images = value; }

    /**
     * Number of artifacts uploaded. Only populated when artifacts are uploaded.
     */
    public Long getNumArtifacts() { return numArtifacts; }
    public void setNumArtifacts(Long value) { this.numArtifacts = value; }
}
