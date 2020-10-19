// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

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
