package com.google.events.cloud.audit.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Identity delegation history of an authenticated service account
 */
public class ServiceAccountDelegationInfo {
    private String principalEmail;
    private Map<String, Object> serviceMetadata;
    private Map<String, Object> thirdPartyClaims;

    /**
     * The email address of a Google account.
     */
    @JsonProperty("principal_email")
    public String getPrincipalEmail() { return principalEmail; }
    @JsonProperty("principal_email")
    public void setPrincipalEmail(String value) { this.principalEmail = value; }

    /**
     * Metadata about the service that uses the service account.
     */
    @JsonProperty("service_metadata")
    public Map<String, Object> getServiceMetadata() { return serviceMetadata; }
    @JsonProperty("service_metadata")
    public void setServiceMetadata(Map<String, Object> value) { this.serviceMetadata = value; }

    /**
     * Metadata about third party identity.
     */
    @JsonProperty("third_party_claims")
    public Map<String, Object> getThirdPartyClaims() { return thirdPartyClaims; }
    @JsonProperty("third_party_claims")
    public void setThirdPartyClaims(Map<String, Object> value) { this.thirdPartyClaims = value; }
}

