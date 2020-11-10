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

import java.util.Map;

/**
 * The destination of a network activity, such as accepting a TCP connection.
 * In a multi hop network activity, the destination represents the receiver of
 * the last hop. Only two fields are used in this message, Peer.port and
 * Peer.ip. These fields are optionally populated by those services utilizing
 * the IAM condition feature.
 */
public class DestinationAttributes {
    private String ip;
    private Map<String, String> labels;
    private NumResponseItems port;
    private String principal;
    private String regionCode;

    /**
     * The IP address of the peer.
     */
    public String getIP() { return ip; }
    public void setIP(String value) { this.ip = value; }

    /**
     * The labels associated with the peer.
     */
    public Map<String, String> getLabels() { return labels; }
    public void setLabels(Map<String, String> value) { this.labels = value; }

    /**
     * The network port of the peer.
     */
    public NumResponseItems getPort() { return port; }
    public void setPort(NumResponseItems value) { this.port = value; }

    /**
     * The identity of this peer. Similar to `Request.auth.principal`, but
     * relative to the peer instead of the request. For example, the
     * idenity associated with a load balancer that forwared the request.
     */
    public String getPrincipal() { return principal; }
    public void setPrincipal(String value) { this.principal = value; }

    /**
     * The CLDR country/region code associated with the above IP address.
     * If the IP address is private, the `region_code` should reflect the
     * physical location where this peer is running.
     */
    public String getRegionCode() { return regionCode; }
    public void setRegionCode(String value) { this.regionCode = value; }
}
