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

package com.google.events.cloud.audit.v1;

import java.util.Map;

/**
 * Other service-specific data about the request, response, and other
 * information associated with the current audited event.
 */
public class Metadata {
    private Map<String, Map<String, Object>> fields;

    /**
     * Unordered map of dynamically typed values.
     */
    public Map<String, Map<String, Object>> getFields() { return fields; }
    public void setFields(Map<String, Map<String, Object>> value) { this.fields = value; }
}
