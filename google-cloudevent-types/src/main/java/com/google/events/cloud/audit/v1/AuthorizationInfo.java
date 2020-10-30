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

/**
 * Authorization information for the operation.
 */
public class AuthorizationInfo {
    private Boolean granted;
    private String permission;
    private String resource;
    private ResourceAttributes resourceAttributes;

    /**
     * Whether or not authorization for `resource` and `permission`
     * was granted.
     */
    public Boolean getGranted() { return granted; }
    public void setGranted(Boolean value) { this.granted = value; }

    /**
     * The required IAM permission.
     */
    public String getPermission() { return permission; }
    public void setPermission(String value) { this.permission = value; }

    /**
     * The resource being accessed, as a REST-style string. For example:
     *
     * bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
     */
    public String getResource() { return resource; }
    public void setResource(String value) { this.resource = value; }

    /**
     * Resource attributes used in IAM condition evaluation. This field contains
     * resource attributes like resource type and resource name.
     *
     * To get the whole view of the attributes used in IAM
     * condition evaluation, the user must also look into
     * `AuditLogData.request_metadata.request_attributes`.
     */
    public ResourceAttributes getResourceAttributes() { return resourceAttributes; }
    public void setResourceAttributes(ResourceAttributes value) { this.resourceAttributes = value; }
}
