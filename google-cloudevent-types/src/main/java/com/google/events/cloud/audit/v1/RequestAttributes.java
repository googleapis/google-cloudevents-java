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

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Request attributes used in IAM condition evaluation. This field contains
 * request attributes like request time and access levels associated with
 * the request.
 *
 *
 * To get the whole view of the attributes used in IAM
 * condition evaluation, the user must also look into
 * `AuditLog.authentication_info.resource_attributes`.
 */
public class RequestAttributes {
    private Auth auth;
    private Map<String, String> headers;
    private String host;
    private String id;
    private String method;
    private String path;
    private String protocol;
    private String query;
    private String reason;
    private String scheme;
    private NumResponseItems size;
    private OffsetDateTime time;

    /**
     * The request authentication. May be absent for unauthenticated requests.
     * Derived from the HTTP request `Authorization` header or equivalent.
     */
    public Auth getAuth() { return auth; }
    public void setAuth(Auth value) { this.auth = value; }

    /**
     * The HTTP request headers. If multiple headers share the same key, they
     * must be merged according to the HTTP spec. All header keys must be
     * lowercased, because HTTP header keys are case-insensitive.
     */
    public Map<String, String> getHeaders() { return headers; }
    public void setHeaders(Map<String, String> value) { this.headers = value; }

    /**
     * The HTTP request `Host` header value.
     */
    public String getHost() { return host; }
    public void setHost(String value) { this.host = value; }

    /**
     * The unique ID for a request, which can be propagated to downstream
     * systems. The ID should have low probability of collision
     * within a single day for a specific service.
     */
    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    /**
     * The HTTP request method, such as `GET`, `POST`.
     */
    public String getMethod() { return method; }
    public void setMethod(String value) { this.method = value; }

    /**
     * The HTTP URL path.
     */
    public String getPath() { return path; }
    public void setPath(String value) { this.path = value; }

    /**
     * The network protocol used with the request, such as "http/1.1",
     * "spdy/3", "h2", "h2c", "webrtc", "tcp", "udp", "quic". See
     *
     * https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids
     * for details.
     */
    public String getProtocol() { return protocol; }
    public void setProtocol(String value) { this.protocol = value; }

    /**
     * The HTTP URL query in the format of `name1=value1&name2=value2`, as it
     * appears in the first line of the HTTP request. No decoding is performed.
     */
    public String getQuery() { return query; }
    public void setQuery(String value) { this.query = value; }

    /**
     * A special parameter for request reason. It is used by security systems
     * to associate auditing information with a request.
     */
    public String getReason() { return reason; }
    public void setReason(String value) { this.reason = value; }

    /**
     * The HTTP URL scheme, such as `http` and `https`.
     */
    public String getScheme() { return scheme; }
    public void setScheme(String value) { this.scheme = value; }

    /**
     * The HTTP request size in bytes. If unknown, it must be -1.
     */
    public NumResponseItems getSize() { return size; }
    public void setSize(NumResponseItems value) { this.size = value; }

    /**
     * The timestamp when the `destination` service receives the first byte of
     * the request.
     */
    public OffsetDateTime getTime() { return time; }
    public void setTime(OffsetDateTime value) { this.time = value; }
}
