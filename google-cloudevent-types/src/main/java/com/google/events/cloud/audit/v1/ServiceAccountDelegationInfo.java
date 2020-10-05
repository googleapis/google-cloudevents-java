package com.google.events.cloud.audit.v1;

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
    public String getPrincipalEmail() { return principalEmail; }
    public void setPrincipalEmail(String value) { this.principalEmail = value; }

    /**
     * Metadata about the service that uses the service account.
     */
    public Map<String, Object> getServiceMetadata() { return serviceMetadata; }
    public void setServiceMetadata(Map<String, Object> value) { this.serviceMetadata = value; }

    /**
     * Metadata about third party identity.
     */
    public Map<String, Object> getThirdPartyClaims() { return thirdPartyClaims; }
    public void setThirdPartyClaims(Map<String, Object> value) { this.thirdPartyClaims = value; }
}
