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
 * The operation response. This may not include all response elements,
 * such as those that are too large, privacy-sensitive, or duplicated
 * elsewhere in the log record.
 * It should never include user-generated data, such as file contents.
 * When the JSON object represented here has a proto equivalent, the proto
 * name will be indicated in the `@type` property.
 */
public class Response {
    private Map<String, Map<String, Object>> fields;

    /**
     * Unordered map of dynamically typed values.
     */
    public Map<String, Map<String, Object>> getFields() { return fields; }
    public void setFields(Map<String, Map<String, Object>> value) { this.fields = value; }
}
