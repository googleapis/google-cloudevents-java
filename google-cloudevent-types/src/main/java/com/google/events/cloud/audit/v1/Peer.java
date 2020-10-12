package com.google.events.cloud.audit.v1;

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

    public String getIP() { return ip; }
    public void setIP(String value) { this.ip = value; }

    public Map<String, Object> getLabels() { return labels; }
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    public Long getPort() { return port; }
    public void setPort(Long value) { this.port = value; }

    public String getPrincipal() { return principal; }
    public void setPrincipal(String value) { this.principal = value; }

    public String getRegionCode() { return regionCode; }
    public void setRegionCode(String value) { this.regionCode = value; }
}
