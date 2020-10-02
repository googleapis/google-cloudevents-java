package com.google.events.cloud.audit.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class Auth {
    private String[] accessLevels;
    private String[] audiences;
    private Map<String, Object> claims;
    private String presenter;
    private String principal;

    @JsonProperty("access_levels")
    public String[] getAccessLevels() { return accessLevels; }
    @JsonProperty("access_levels")
    public void setAccessLevels(String[] value) { this.accessLevels = value; }

    @JsonProperty("audiences")
    public String[] getAudiences() { return audiences; }
    @JsonProperty("audiences")
    public void setAudiences(String[] value) { this.audiences = value; }

    @JsonProperty("claims")
    public Map<String, Object> getClaims() { return claims; }
    @JsonProperty("claims")
    public void setClaims(Map<String, Object> value) { this.claims = value; }

    @JsonProperty("presenter")
    public String getPresenter() { return presenter; }
    @JsonProperty("presenter")
    public void setPresenter(String value) { this.presenter = value; }

    @JsonProperty("principal")
    public String getPrincipal() { return principal; }
    @JsonProperty("principal")
    public void setPrincipal(String value) { this.principal = value; }
}
