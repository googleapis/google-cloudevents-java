package com.google.events.cloud.audit.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Information about an operation associated with the log entry, if applicable.
 *
 * Additional information about a potentially long-running operation with which a log entry
 * is associated.
 */
public class LogEntryOperation {
    private Boolean first;
    private String id;
    private Boolean last;
    private String producer;

    /**
     * True if this is the first log entry in the operation.
     */
    @JsonProperty("first")
    public Boolean getFirst() { return first; }
    @JsonProperty("first")
    public void setFirst(Boolean value) { this.first = value; }

    /**
     * An arbitrary operation identifier. Log entries with the same identifier are assumed to be
     * part of the same operation.
     */
    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    /**
     * True if this is the last log entry in the operation.
     */
    @JsonProperty("last")
    public Boolean getLast() { return last; }
    @JsonProperty("last")
    public void setLast(Boolean value) { this.last = value; }

    /**
     * An arbitrary producer identifier. The combination of `id` and `producer` must be globally
     * unique. Examples for `producer`: `"MyDivision.MyBigCompany.com"`,
     * `"github.com/MyProject/MyApplication"`.
     */
    @JsonProperty("producer")
    public String getProducer() { return producer; }
    @JsonProperty("producer")
    public void setProducer(String value) { this.producer = value; }
}
