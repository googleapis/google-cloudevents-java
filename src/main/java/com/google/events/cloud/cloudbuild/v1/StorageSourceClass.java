/*
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
 * If provided, get the source from this location in Google Cloud Storage.
 *
 * Location of the source in an archive file in Google Cloud Storage.
 */
public class StorageSourceClass {
    private String bucket;
    private DiskSizeGBUnion generation;
    private String object;

    /**
     * Google Cloud Storage bucket containing the source (see
     * [Bucket Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     */
    public String getBucket() { return bucket; }
    public void setBucket(String value) { this.bucket = value; }

    /**
     * Google Cloud Storage generation for the object. If the generation is
     * omitted, the latest generation will be used.
     */
    public DiskSizeGBUnion getGeneration() { return generation; }
    public void setGeneration(DiskSizeGBUnion value) { this.generation = value; }

    /**
     * Google Cloud Storage object containing the source.
     */
    public String getObject() { return object; }
    public void setObject(String value) { this.object = value; }
}
