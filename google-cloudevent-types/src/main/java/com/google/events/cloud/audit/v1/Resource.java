package com.google.events.cloud.audit.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Resource attributes used in IAM condition evaluation. This field contains resource
 * attributes like resource type and resource name. To get the whole view of the attributes
 * used in IAM condition evaluation, the user must also look into
 * AuditLog.request_metadata.request_attributes.
 */
public class Resource {
    private Map<String, Object> labels;
    private String name;
    private String service;
    private String type;

    @JsonProperty("labels")
    public Map<String, Object> getLabels() { return labels; }
    @JsonProperty("labels")
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("service")
    public String getService() { return service; }
    @JsonProperty("service")
    public void setService(String value) { this.service = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }
}
