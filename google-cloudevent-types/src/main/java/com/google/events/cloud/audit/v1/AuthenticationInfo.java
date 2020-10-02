package com.google.events.cloud.audit.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Authentication information.
 *
 * Authentication information for the operation.
 */
public class AuthenticationInfo {
    private String authoritySelector;
    private String principalEmail;
    private String principalSubject;
    private ServiceAccountDelegationInfo[] serviceAccountDelegationInfo;
    private String serviceAccountKeyName;
    private Map<String, Object> thirdPartyPrincipal;

    /**
     * The authority selector specified by the requestor, if any. It is not guaranteed that the
     * principal was allowed to use this authority.
     */
    @JsonProperty("authority_selector")
    public String getAuthoritySelector() { return authoritySelector; }
    @JsonProperty("authority_selector")
    public void setAuthoritySelector(String value) { this.authoritySelector = value; }

    /**
     * The email address of the authenticated user (or service account on behalf of third party
     * principal) making the request. For privacy reasons, the principal email address is
     * redacted for all read-only operations that fail with a "permission denied" error.
     */
    @JsonProperty("principal_email")
    public String getPrincipalEmail() { return principalEmail; }
    @JsonProperty("principal_email")
    public void setPrincipalEmail(String value) { this.principalEmail = value; }

    /**
     * String representation of identity of requesting party. Populated for both first and third
     * party identities.
     */
    @JsonProperty("principal_subject")
    public String getPrincipalSubject() { return principalSubject; }
    @JsonProperty("principal_subject")
    public void setPrincipalSubject(String value) { this.principalSubject = value; }

    /**
     * Identity delegation history of an authenticated service account that makes the request.
     * It contains information on the real authorities that try to access GCP resources by
     * delegating on a service account. When multiple authorities present, they are guaranteed
     * to be sorted based on the original ordering of the identity delegation events.
     */
    @JsonProperty("service_account_delegation_info")
    public ServiceAccountDelegationInfo[] getServiceAccountDelegationInfo() { return serviceAccountDelegationInfo; }
    @JsonProperty("service_account_delegation_info")
    public void setServiceAccountDelegationInfo(ServiceAccountDelegationInfo[] value) { this.serviceAccountDelegationInfo = value; }

    /**
     * The name of the service account key used to create or exchange credentials for
     * authenticating the service account making the request. This is a scheme-less URI full
     * resource name.
     */
    @JsonProperty("service_account_key_name")
    public String getServiceAccountKeyName() { return serviceAccountKeyName; }
    @JsonProperty("service_account_key_name")
    public void setServiceAccountKeyName(String value) { this.serviceAccountKeyName = value; }

    /**
     * The third party identification (if any) of the authenticated user making the request.
     * When the JSON object represented here has a proto equivalent, the proto name will be
     * indicated in the @type property.
     */
    @JsonProperty("third_party_principal")
    public Map<String, Object> getThirdPartyPrincipal() { return thirdPartyPrincipal; }
    @JsonProperty("third_party_principal")
    public void setThirdPartyPrincipal(Map<String, Object> value) { this.thirdPartyPrincipal = value; }
}
