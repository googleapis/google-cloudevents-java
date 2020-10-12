package com.google.events.cloud.audit.v1;

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

    public Map<String, Object> getLabels() { return labels; }
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getService() { return service; }
    public void setService(String value) { this.service = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
}
