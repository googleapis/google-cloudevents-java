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

package google.events.cloud.audit.v1;

import java.util.Map;

/**
 * Resource attributes used in IAM condition evaluation. This field contains resource
 * attributes like resource type and resource name. To get the whole view of the attributes
 * used in IAM condition evaluation, the user must also look into
 * AuditLog.requestMetadata.requestAttributes.
 */
public class Resource {
    private Map<String, Object> labels;
    private String name;
    private String service;
    private String type;

    public Map<String, Object> getLabels() { return labels; }
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getService() { return service; }
    public void setService(String value) { this.service = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
}
