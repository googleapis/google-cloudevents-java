package com.google.events.cloud.audit.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * The destination of a network activity, such as accepting a TCP connection.
 */
public class Peer {
    private String ip;
    private Map<String, Object> labels;
    private Long port;
    private String principal;
    private String regionCode;

    @JsonProperty("ip")
    public String getIP() { return ip; }
    @JsonProperty("ip")
    public void setIP(String value) { this.ip = value; }

    @JsonProperty("labels")
    public Map<String, Object> getLabels() { return labels; }
    @JsonProperty("labels")
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    @JsonProperty("port")
    public Long getPort() { return port; }
    @JsonProperty("port")
    public void setPort(Long value) { this.port = value; }

    @JsonProperty("principal")
    public String getPrincipal() { return principal; }
    @JsonProperty("principal")
    public void setPrincipal(String value) { this.principal = value; }

    @JsonProperty("region_code")
    public String getRegionCode() { return regionCode; }
    @JsonProperty("region_code")
    public void setRegionCode(String value) { this.regionCode = value; }
}
