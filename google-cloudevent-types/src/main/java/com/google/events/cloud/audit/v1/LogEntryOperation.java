package com.google.events.cloud.audit.v1;

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
    public Boolean getFirst() { return first; }
    public void setFirst(Boolean value) { this.first = value; }

    /**
     * An arbitrary operation identifier. Log entries with the same identifier are assumed to be
     * part of the same operation.
     */
    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    /**
     * True if this is the last log entry in the operation.
     */
    public Boolean getLast() { return last; }
    public void setLast(Boolean value) { this.last = value; }

    /**
     * An arbitrary producer identifier. The combination of `id` and `producer` must be globally
     * unique. Examples for `producer`: `"MyDivision.MyBigCompany.com"`,
     * `"github.com/MyProject/MyApplication"`.
     */
    public String getProducer() { return producer; }
    public void setProducer(String value) { this.producer = value; }
}
