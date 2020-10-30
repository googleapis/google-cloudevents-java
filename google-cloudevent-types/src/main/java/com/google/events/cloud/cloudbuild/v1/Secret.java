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

import java.util.Map;

/**
 * Pairs a set of secret environment variables containing encrypted
 * values with the Cloud KMS key to use to decrypt the value.
 */
public class Secret {
    private String kmsKeyName;
    private Map<String, String> secretEnv;

    /**
     * Cloud KMS key name to use to decrypt these envs.
     */
    public String getKmsKeyName() { return kmsKeyName; }
    public void setKmsKeyName(String value) { this.kmsKeyName = value; }

    /**
     * Map of environment variable name to its encrypted value.
     *
     * Secret environment variables must be unique across all of a build's
     * secrets, and must be used by at least one build step. Values can be at most
     * 64 KB in size. There can be at most 100 secret values across all of a
     * build's secrets.
     */
    public Map<String, String> getSecretEnv() { return secretEnv; }
    public void setSecretEnv(Map<String, String> value) { this.secretEnv = value; }
}
