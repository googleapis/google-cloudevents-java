/**
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.audit.v1;

import java.util.Map;

/**
 * Structured claims presented with the credential. JWTs include
 * `{key: value}` pairs for standard and private claims. The following
 * is a subset of the standard required and optional claims that would
 * typically be presented for a Google-based JWT:
 *
 * {'iss': 'accounts.google.com',
 * 'sub': '113289723416554971153',
 * 'aud': ['123456789012', 'pubsub.googleapis.com'],
 * 'azp': '123456789012.apps.googleusercontent.com',
 * 'email': 'jsmith@example.com',
 * 'iat': 1353601026,
 * 'exp': 1353604926}
 *
 * SAML assertions are similarly specified, but with an identity provider
 * dependent structure.
 */
public class Claims {
    private Map<String, Map<String, Object>> fields;

    /**
     * Unordered map of dynamically typed values.
     */
    public Map<String, Map<String, Object>> getFields() { return fields; }
    public void setFields(Map<String, Map<String, Object>> value) { this.fields = value; }
}
