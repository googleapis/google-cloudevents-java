package com.google.events.cloud.audit.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Request attributes used in IAM condition evaluation. This field contains request
 * attributes like request time and access levels associated with the request.
 */
public class Request {
    private Auth auth;
    private Map<String, Object> headers;
    private String host;
    private String id;
    private String method;
    private String path;
    private String protocol;
    private String query;
    private String reason;
    private String scheme;
    private Long size;
    private String time;

    @JsonProperty("auth")
    public Auth getAuth() { return auth; }
    @JsonProperty("auth")
    public void setAuth(Auth value) { this.auth = value; }

    @JsonProperty("headers")
    public Map<String, Object> getHeaders() { return headers; }
    @JsonProperty("headers")
    public void setHeaders(Map<String, Object> value) { this.headers = value; }

    @JsonProperty("host")
    public String getHost() { return host; }
    @JsonProperty("host")
    public void setHost(String value) { this.host = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("method")
    public String getMethod() { return method; }
    @JsonProperty("method")
    public void setMethod(String value) { this.method = value; }

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("protocol")
    public String getProtocol() { return protocol; }
    @JsonProperty("protocol")
    public void setProtocol(String value) { this.protocol = value; }

    @JsonProperty("query")
    public String getQuery() { return query; }
    @JsonProperty("query")
    public void setQuery(String value) { this.query = value; }

    @JsonProperty("reason")
    public String getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(String value) { this.reason = value; }

    @JsonProperty("scheme")
    public String getScheme() { return scheme; }
    @JsonProperty("scheme")
    public void setScheme(String value) { this.scheme = value; }

    @JsonProperty("size")
    public Long getSize() { return size; }
    @JsonProperty("size")
    public void setSize(Long value) { this.size = value; }

    @JsonProperty("time")
    public String getTime() { return time; }
    @JsonProperty("time")
    public void setTime(String value) { this.time = value; }
}
