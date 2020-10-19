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

package com.google.events.cloud.audit.v1;

import java.util.Map;

/**
 * The monitored resource that produced this log entry. Example: a log entry that reports a
 * database error would be associated with the monitored resource designating the particular
 * database that reported the error.
 *
 * The monitored resource that produced this log entry.
 */
public class MonitoredResource {
    private Map<String, Object> labels;
    private String type;

    /**
     * Values for all of the labels listed in the associated monitored resource descriptor. For
     * example, Compute Engine VM instances use the labels `"projectId"`, `"instanceId"`, and
     * `"zone"`.
     */
    public Map<String, Object> getLabels() { return labels; }
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    /**
     * Required. The monitored resource type. For example, the type of a Compute Engine VM
     * instance is `gceInstance`.
     */
    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
}
