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
 * Resource attributes used in IAM condition evaluation. This field contains
 * resource attributes like resource type and resource name.
 *
 * To get the whole view of the attributes used in IAM
 * condition evaluation, the user must also look into
 * `AuditLogData.request_metadata.request_attributes`.
 */
public class ResourceAttributes {
    private Map<String, String> labels;
    private String name;
    private String service;
    private String type;

    /**
     * The labels or tags on the resource, such as AWS resource tags and
     * Kubernetes resource labels.
     */
    public Map<String, String> getLabels() { return labels; }
    public void setLabels(Map<String, String> value) { this.labels = value; }

    /**
     * The stable identifier (name) of a resource on the `service`. A resource
     * can be logically identified as "//{resource.service}/{resource.name}".
     * The differences between a resource name and a URI are:
     *
     * *   Resource name is a logical identifier, independent of network
     * protocol and API version. For example,
     * `//pubsub.googleapis.com/projects/123/topics/news-feed`.
     * *   URI often includes protocol and version information, so it can
     * be used directly by applications. For example,
     * `https://pubsub.googleapis.com/v1/projects/123/topics/news-feed`.
     *
     * See https://cloud.google.com/apis/design/resource_names for details.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    /**
     * The name of the service that this resource belongs to, such as
     * `pubsub.googleapis.com`. The service may be different from the DNS
     * hostname that actually serves the request.
     */
    public String getService() { return service; }
    public void setService(String value) { this.service = value; }

    /**
     * The type of the resource. The syntax is platform-specific because
     * different platforms define their resources differently.
     *
     * For Google APIs, the type format must be "{service}/{kind}".
     */
    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
}
