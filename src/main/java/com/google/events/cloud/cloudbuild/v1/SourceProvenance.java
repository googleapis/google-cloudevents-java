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

import java.util.Map;

/**
 * A permanent fixed identifier for source.
 */
public class SourceProvenance {
    private Map<String, FileHashValue> fileHashes;
    private ResolvedRepoSourceClass resolvedRepoSource;
    private ResolvedStorageSourceClass resolvedStorageSource;

    /**
     * Hash(es) of the build source, which can be used to verify that
     * the original source integrity was maintained in the build. Note that
     * `FileHashes` will only be populated if `BuildOptions` has requested a
     * `SourceProvenanceHash`.
     *
     * The keys to this map are file paths used as build source and the values
     * contain the hash values for those files.
     *
     * If the build source came in a single package such as a gzipped tarfile
     * (`.tar.gz`), the `FileHash` will be for the single path to that file.
     */
    public Map<String, FileHashValue> getFileHashes() { return fileHashes; }
    public void setFileHashes(Map<String, FileHashValue> value) { this.fileHashes = value; }

    /**
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     */
    public ResolvedRepoSourceClass getResolvedRepoSource() { return resolvedRepoSource; }
    public void setResolvedRepoSource(ResolvedRepoSourceClass value) { this.resolvedRepoSource = value; }

    /**
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     */
    public ResolvedStorageSourceClass getResolvedStorageSource() { return resolvedStorageSource; }
    public void setResolvedStorageSource(ResolvedStorageSourceClass value) { this.resolvedStorageSource = value; }
}
