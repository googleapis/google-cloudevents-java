package com.google.events.cloud.audit.v1;

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
    public String getInsertID() { return insertID; }
    public void setInsertID(String value) { this.insertID = value; }

    /**
     * A set of user-defined (key, value) data that provides additional information about the
     * log entry.
     */
    public Map<String, Object> getLabels() { return labels; }
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    /**
     * The resource name of the log to which this log entry belongs.
     */
    public String getLogName() { return logName; }
    public void setLogName(String value) { this.logName = value; }

    /**
     * Information about an operation associated with the log entry, if applicable.
     */
    public LogEntryOperation getOperation() { return operation; }
    public void setOperation(LogEntryOperation value) { this.operation = value; }

    /**
     * The log entry payload, which is always an AuditLog for Cloud Audit Log events.
     */
    public AuditLog getProtoPayload() { return protoPayload; }
    public void setProtoPayload(AuditLog value) { this.protoPayload = value; }

    /**
     * The time the log entry was received by Logging.
     */
    public String getReceiveTimestamp() { return receiveTimestamp; }
    public void setReceiveTimestamp(String value) { this.receiveTimestamp = value; }

    /**
     * The monitored resource that produced this log entry. Example: a log entry that reports a
     * database error would be associated with the monitored resource designating the particular
     * database that reported the error.
     */
    public MonitoredResource getResource() { return resource; }
    public void setResource(MonitoredResource value) { this.resource = value; }

    /**
     * The severity of the log entry.
     */
    public String getSeverity() { return severity; }
    public void setSeverity(String value) { this.severity = value; }

    /**
     * The span ID within the trace associated with the log entry, if any. For Trace spans, this
     * is the same format that the Trace API v2 uses: a 16-character hexadecimal encoding of an
     * 8-byte array, such as `000000000000004a`.
     */
    public String getSpanID() { return spanID; }
    public void setSpanID(String value) { this.spanID = value; }

    /**
     * The time the event described by the log entry occurred.
     */
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String value) { this.timestamp = value; }

    /**
     * Resource name of the trace associated with the log entry, if any. If it contains a
     * relative resource name, the name is assumed to be relative to `//tracing.googleapis.com`.
     * Example: `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
     */
    public String getTrace() { return trace; }
    public void setTrace(String value) { this.trace = value; }
}
