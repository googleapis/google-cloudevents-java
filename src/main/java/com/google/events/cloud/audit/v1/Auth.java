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
 * The request authentication. May be absent for unauthenticated requests.
 * Derived from the HTTP request `Authorization` header or equivalent.
 */
public class Auth {
    private String[] accessLevels;
    private String[] audiences;
    private Claims claims;
    private String presenter;
    private String principal;

    /**
     * A list of access level resource names that allow resources to be
     * accessed by authenticated requester. It is part of Secure GCP processing
     * for the incoming request. An access level string has the format:
     * "//{api_service_name}/accessPolicies/{policy_id}/accessLevels/{short_name}"
     *
     * Example:
     * "//accesscontextmanager.googleapis.com/accessPolicies/MY_POLICY_ID/accessLevels/MY_LEVEL"
     */
    public String[] getAccessLevels() { return accessLevels; }
    public void setAccessLevels(String[] value) { this.accessLevels = value; }

    /**
     * The intended audience(s) for this authentication information. Reflects
     * the audience (`aud`) claim within a JWT. The audience
     * value(s) depends on the `issuer`, but typically include one or more of
     * the following pieces of information:
     *
     * *  The services intended to receive the credential such as
     * ["pubsub.googleapis.com", "storage.googleapis.com"]
     * *  A set of service-based scopes. For example,
     * ["https://www.googleapis.com/auth/cloud-platform"]
     * *  The client id of an app, such as the Firebase project id for JWTs
     * from Firebase Auth.
     *
     * Consult the documentation for the credential issuer to determine the
     * information provided.
     */
    public String[] getAudiences() { return audiences; }
    public void setAudiences(String[] value) { this.audiences = value; }

    /**
     * Structured claims presented with the credential. JWTs include
     * `{key: value}` pairs for standard and private claims. The following
     * is a subset of the standard required and optional claims that would
     * typically be presented for a Google-based JWT:
     *
     * {'iss': 'accounts.google.com',
     * 'sub': '113289723416554971153',
     * 'aud': ['123456789012', 'pubsub.googleapis.com'],
     * 'azp': '123456789012.apps.googleusercontent.com',
     * 'email': 'jsmith@example.com',
     * 'iat': 1353601026,
     * 'exp': 1353604926}
     *
     * SAML assertions are similarly specified, but with an identity provider
     * dependent structure.
     */
    public Claims getClaims() { return claims; }
    public void setClaims(Claims value) { this.claims = value; }

    /**
     * The authorized presenter of the credential. Reflects the optional
     * Authorized Presenter (`azp`) claim within a JWT or the
     * OAuth client id. For example, a Google Cloud Platform client id looks
     * as follows: "123456789012.apps.googleusercontent.com".
     */
    public String getPresenter() { return presenter; }
    public void setPresenter(String value) { this.presenter = value; }

    /**
     * The authenticated principal. Reflects the issuer (`iss`) and subject
     * (`sub`) claims within a JWT. The issuer and subject should be `/`
     * delimited, with `/` percent-encoded within the subject fragment. For
     * Google accounts, the principal format is:
     * "https://accounts.google.com/{id}"
     */
    public String getPrincipal() { return principal; }
    public void setPrincipal(String value) { this.principal = value; }
}
