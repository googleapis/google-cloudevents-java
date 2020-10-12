package com.google.events.cloud.audit.v1;

/**
 * The status of the overall operation.
 */
public class Status {
    private Long code;
    private Object details;
    private String message;

    /**
     * The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code].
     */
    public Long getCode() { return code; }
    public void setCode(Long value) { this.code = value; }

    /**
     * A list of messages that carry the error details.  There is a common set of message types
     * for APIs to use.
     */
    public Object getDetails() { return details; }
    public void setDetails(Object value) { this.details = value; }

    /**
     * A developer-facing error message, which should be in English. Any user-facing error
     * message should be localized and sent in the
     * [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client.
     */
    public String getMessage() { return message; }
    public void setMessage(String value) { this.message = value; }
}
