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
 * The location of the source files to build.
 */
public class Source {
    private RepoSourceClass repoSource;
    private StorageSourceClass storageSource;

    /**
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     */
    public RepoSourceClass getRepoSource() { return repoSource; }
    public void setRepoSource(RepoSourceClass value) { this.repoSource = value; }

    /**
     * If provided, get the source from this location in Google Cloud Storage.
     */
    public StorageSourceClass getStorageSource() { return storageSource; }
    public void setStorageSource(StorageSourceClass value) { this.storageSource = value; }
}
