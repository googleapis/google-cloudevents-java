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
     * example, Compute Engine VM instances use the labels `"project_id"`, `"instance_id"`, and
     * `"zone"`.
     */
    public Map<String, Object> getLabels() { return labels; }
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    /**
     * Required. The monitored resource type. For example, the type of a Compute Engine VM
     * instance is `gce_instance`.
     */
    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
}
