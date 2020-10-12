package com.google.events.cloud.audit.v1;

import java.util.Map;

public class Auth {
    private String[] accessLevels;
    private String[] audiences;
    private Map<String, Object> claims;
    private String presenter;
    private String principal;

    public String[] getAccessLevels() { return accessLevels; }
    public void setAccessLevels(String[] value) { this.accessLevels = value; }

    public String[] getAudiences() { return audiences; }
    public void setAudiences(String[] value) { this.audiences = value; }

    public Map<String, Object> getClaims() { return claims; }
    public void setClaims(Map<String, Object> value) { this.claims = value; }

    public String getPresenter() { return presenter; }
    public void setPresenter(String value) { this.presenter = value; }

    public String getPrincipal() { return principal; }
    public void setPrincipal(String value) { this.principal = value; }
}
