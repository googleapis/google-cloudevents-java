package com.google.events.cloud.audit.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * This event is triggered when a new audit log entry is written.
 */
public class LogEntryData {
    private String insertID;
    private Map<String, Object> labels;
    private String logName;
    private LogEntryOperation operation;
    private AuditLog protoPayload;
    private String receiveTimestamp;
    private MonitoredResource resource;
    private String severity;
    private String spanID;
    private String timestamp;
    private String trace;

    /**
     * A unique identifier for the log entry.
     */
    @JsonProperty("insert_id")
    public String getInsertID() { return insertID; }
    @JsonProperty("insert_id")
    public void setInsertID(String value) { this.insertID = value; }

    /**
     * A set of user-defined (key, value) data that provides additional information about the
     * log entry.
     */
    @JsonProperty("labels")
    public Map<String, Object> getLabels() { return labels; }
    @JsonProperty("labels")
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    /**
     * The resource name of the log to which this log entry belongs.
     */
    @JsonProperty("log_name")
    public String getLogName() { return logName; }
    @JsonProperty("log_name")
    public void setLogName(String value) { this.logName = value; }

    /**
     * Information about an operation associated with the log entry, if applicable.
     */
    @JsonProperty("operation")
    public LogEntryOperation getOperation() { return operation; }
    @JsonProperty("operation")
    public void setOperation(LogEntryOperation value) { this.operation = value; }

    /**
     * The log entry payload, which is always an AuditLog for Cloud Audit Log events.
     */
    @JsonProperty("proto_payload")
    public AuditLog getProtoPayload() { return protoPayload; }
    @JsonProperty("proto_payload")
    public void setProtoPayload(AuditLog value) { this.protoPayload = value; }

    /**
     * The time the log entry was received by Logging.
     */
    @JsonProperty("receive_timestamp")
    public String getReceiveTimestamp() { return receiveTimestamp; }
    @JsonProperty("receive_timestamp")
    public void setReceiveTimestamp(String value) { this.receiveTimestamp = value; }

    /**
     * The monitored resource that produced this log entry. Example: a log entry that reports a
     * database error would be associated with the monitored resource designating the particular
     * database that reported the error.
     */
    @JsonProperty("resource")
    public MonitoredResource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(MonitoredResource value) { this.resource = value; }

    /**
     * The severity of the log entry.
     */
    @JsonProperty("severity")
    public String getSeverity() { return severity; }
    @JsonProperty("severity")
    public void setSeverity(String value) { this.severity = value; }

    /**
     * The span ID within the trace associated with the log entry, if any. For Trace spans, this
     * is the same format that the Trace API v2 uses: a 16-character hexadecimal encoding of an
     * 8-byte array, such as `000000000000004a`.
     */
    @JsonProperty("span_id")
    public String getSpanID() { return spanID; }
    @JsonProperty("span_id")
    public void setSpanID(String value) { this.spanID = value; }

    /**
     * The time the event described by the log entry occurred.
     */
    @JsonProperty("timestamp")
    public String getTimestamp() { return timestamp; }
    @JsonProperty("timestamp")
    public void setTimestamp(String value) { this.timestamp = value; }

    /**
     * Resource name of the trace associated with the log entry, if any. If it contains a
     * relative resource name, the name is assumed to be relative to `//tracing.googleapis.com`.
     * Example: `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
     */
    @JsonProperty("trace")
    public String getTrace() { return trace; }
    @JsonProperty("trace")
    public void setTrace(String value) { this.trace = value; }
}
