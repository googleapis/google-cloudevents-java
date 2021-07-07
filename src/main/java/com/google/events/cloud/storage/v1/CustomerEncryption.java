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

package com.google.events.cloud.storage.v1;

/**
 * Metadata of customer-supplied encryption key, if the object is encrypted by
 * such a key.
 */
public class CustomerEncryption {
    private String encryptionAlgorithm;
    private String keySha256;

    /**
     * The encryption algorithm.
     */
    public String getEncryptionAlgorithm() { return encryptionAlgorithm; }
    public void setEncryptionAlgorithm(String value) { this.encryptionAlgorithm = value; }

    /**
     * SHA256 hash value of the encryption key.
     */
    public String getKeySha256() { return keySha256; }
    public void setKeySha256(String value) { this.keySha256 = value; }
}
