/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.audit.v1;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The data within all Cloud Audit Logs log entry events.
 */
public class LogEntryData {
    private String insertID;
    private Map<String, String> labels;
    private String logName;
    private Operation operation;
    private ProtoPayload protoPayload;
    private OffsetDateTime receiveTimestamp;
    private Resource resource;
    private Severity severity;
    private String spanID;
    private OffsetDateTime timestamp;
    private String trace;

    /**
     * A unique identifier for the log entry.
     */
    public String getInsertID() { return insertID; }
    public void setInsertID(String value) { this.insertID = value; }

    /**
     * A set of user-defined (key, value) data that provides additional
     * information about the log entry.
     */
    public Map<String, String> getLabels() { return labels; }
    public void setLabels(Map<String, String> value) { this.labels = value; }

    /**
     * The resource name of the log to which this log entry belongs.
     */
    public String getLogName() { return logName; }
    public void setLogName(String value) { this.logName = value; }

    /**
     * Information about an operation associated with the log entry, if
     * applicable.
     */
    public Operation getOperation() { return operation; }
    public void setOperation(Operation value) { this.operation = value; }

    /**
     * The log entry payload, which is always an AuditLog for Cloud Audit Log
     * events.
     */
    public ProtoPayload getProtoPayload() { return protoPayload; }
    public void setProtoPayload(ProtoPayload value) { this.protoPayload = value; }

    /**
     * The time the log entry was received by Logging.
     */
    public OffsetDateTime getReceiveTimestamp() { return receiveTimestamp; }
    public void setReceiveTimestamp(OffsetDateTime value) { this.receiveTimestamp = value; }

    /**
     * The monitored resource that produced this log entry.
     *
     * Example: a log entry that reports a database error would be associated with
     * the monitored resource designating the particular database that reported
     * the error.
     */
    public Resource getResource() { return resource; }
    public void setResource(Resource value) { this.resource = value; }

    /**
     * The severity of the log entry.
     */
    public Severity getSeverity() { return severity; }
    public void setSeverity(Severity value) { this.severity = value; }

    /**
     * The span ID within the trace associated with the log entry, if any.
     *
     * For Trace spans, this is the same format that the Trace API v2 uses: a
     * 16-character hexadecimal encoding of an 8-byte array, such as
     * `000000000000004a`.
     */
    public String getSpanID() { return spanID; }
    public void setSpanID(String value) { this.spanID = value; }

    /**
     * The time the event described by the log entry occurred.
     */
    public OffsetDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(OffsetDateTime value) { this.timestamp = value; }

    /**
     * Resource name of the trace associated with the log entry, if any. If it
     * contains a relative resource name, the name is assumed to be relative to
     * `//tracing.googleapis.com`. Example:
     * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
     */
    public String getTrace() { return trace; }
    public void setTrace(String value) { this.trace = value; }
}
