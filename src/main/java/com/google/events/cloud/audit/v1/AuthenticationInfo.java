/**
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.audit.v1;

/**
 * Authentication information.
 */
public class AuthenticationInfo {
    private String authoritySelector;
    private String principalEmail;
    private String principalSubject;
    private ServiceAccountDelegationInfo[] serviceAccountDelegationInfo;
    private String serviceAccountKeyName;
    private AuthenticationInfoThirdPartyPrincipal thirdPartyPrincipal;

    /**
     * The authority selector specified by the requestor, if any.
     * It is not guaranteed that the principal was allowed to use this authority.
     */
    public String getAuthoritySelector() { return authoritySelector; }
    public void setAuthoritySelector(String value) { this.authoritySelector = value; }

    /**
     * The email address of the authenticated user (or service account on behalf
     * of third party principal) making the request. For privacy reasons, the
     * principal email address is redacted for all read-only operations that fail
     * with a "permission denied" error.
     */
    public String getPrincipalEmail() { return principalEmail; }
    public void setPrincipalEmail(String value) { this.principalEmail = value; }

    /**
     * String representation of identity of requesting party.
     * Populated for both first and third party identities.
     */
    public String getPrincipalSubject() { return principalSubject; }
    public void setPrincipalSubject(String value) { this.principalSubject = value; }

    /**
     * Identity delegation history of an authenticated service account that makes
     * the request. It contains information on the real authorities that try to
     * access GCP resources by delegating on a service account. When multiple
     * authorities present, they are guaranteed to be sorted based on the original
     * ordering of the identity delegation events.
     */
    public ServiceAccountDelegationInfo[] getServiceAccountDelegationInfo() { return serviceAccountDelegationInfo; }
    public void setServiceAccountDelegationInfo(ServiceAccountDelegationInfo[] value) { this.serviceAccountDelegationInfo = value; }

    /**
     * The name of the service account key used to create or exchange
     * credentials for authenticating the service account making the request.
     * This is a scheme-less URI full resource name. For example:
     *
     * "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}"
     */
    public String getServiceAccountKeyName() { return serviceAccountKeyName; }
    public void setServiceAccountKeyName(String value) { this.serviceAccountKeyName = value; }

    /**
     * The third party identification (if any) of the authenticated user making
     * the request.
     * When the JSON object represented here has a proto equivalent, the proto
     * name will be indicated in the `@type` property.
     */
    public AuthenticationInfoThirdPartyPrincipal getThirdPartyPrincipal() { return thirdPartyPrincipal; }
    public void setThirdPartyPrincipal(AuthenticationInfoThirdPartyPrincipal value) { this.thirdPartyPrincipal = value; }
}
