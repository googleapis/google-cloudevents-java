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
 * Container message for hashes of byte content of files, used in
 * SourceProvenance messages to verify integrity of source input to the build.
 */
public class FileHashes {
    private Hash[] fileHash;

    /**
     * Collection of file hashes.
     */
    public Hash[] getFileHash() { return fileHash; }
    public void setFileHash(Hash[] value) { this.fileHash = value; }
}
