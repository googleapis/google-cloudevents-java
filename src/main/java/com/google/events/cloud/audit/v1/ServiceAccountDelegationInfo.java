/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.audit.v1;

/**
 * Identity delegation history of an authenticated service account.
 */
public class ServiceAccountDelegationInfo {
    private FirstPartyPrincipal firstPartyPrincipal;
    private ServiceAccountDelegationInfoThirdPartyPrincipal thirdPartyPrincipal;

    /**
     * First party (Google) identity as the real authority.
     */
    public FirstPartyPrincipal getFirstPartyPrincipal() { return firstPartyPrincipal; }
    public void setFirstPartyPrincipal(FirstPartyPrincipal value) { this.firstPartyPrincipal = value; }

    /**
     * Third party identity as the real authority.
     */
    public ServiceAccountDelegationInfoThirdPartyPrincipal getThirdPartyPrincipal() { return thirdPartyPrincipal; }
    public void setThirdPartyPrincipal(ServiceAccountDelegationInfoThirdPartyPrincipal value) { this.thirdPartyPrincipal = value; }
}
