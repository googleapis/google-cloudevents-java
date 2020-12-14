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
 * The log entry payload, which is always an AuditLog for Cloud Audit Log events.
 */
public class ProtoPayload {
    private AuthenticationInfo authenticationInfo;
    private AuthorizationInfo[] authorizationInfo;
    private Metadata metadata;
    private String methodName;
    private Long numResponseItems;
    private Request request;
    private RequestMetadata requestMetadata;
    private ResourceLocation resourceLocation;
    private String resourceName;
    private ResourceOriginalState resourceOriginalState;
    private Response response;
    private ServiceData serviceData;
    private String serviceName;
    private Status status;

    /**
     * Authentication information.
     */
    public AuthenticationInfo getAuthenticationInfo() { return authenticationInfo; }
    public void setAuthenticationInfo(AuthenticationInfo value) { this.authenticationInfo = value; }

    /**
     * Authorization information. If there are multiple
     * resources or permissions involved, then there is
     * one AuthorizationInfo element for each {resource, permission} tuple.
     */
    public AuthorizationInfo[] getAuthorizationInfo() { return authorizationInfo; }
    public void setAuthorizationInfo(AuthorizationInfo[] value) { this.authorizationInfo = value; }

    /**
     * Other service-specific data about the request, response, and other
     * information associated with the current audited event.
     */
    public Metadata getMetadata() { return metadata; }
    public void setMetadata(Metadata value) { this.metadata = value; }

    /**
     * The name of the service method or operation.
     * For API calls, this should be the name of the API method.
     * For example,
     *
     * "google.datastore.v1.Datastore.RunQuery"
     * "google.logging.v1.LoggingService.DeleteLog"
     */
    public String getMethodName() { return methodName; }
    public void setMethodName(String value) { this.methodName = value; }

    /**
     * The number of items returned from a List or Query API method,
     * if applicable.
     */
    public Long getNumResponseItems() { return numResponseItems; }
    public void setNumResponseItems(Long value) { this.numResponseItems = value; }

    /**
     * The operation request. This may not include all request parameters,
     * such as those that are too large, privacy-sensitive, or duplicated
     * elsewhere in the log record.
     * It should never include user-generated data, such as file contents.
     * When the JSON object represented here has a proto equivalent, the proto
     * name will be indicated in the `@type` property.
     */
    public Request getRequest() { return request; }
    public void setRequest(Request value) { this.request = value; }

    /**
     * Metadata about the operation.
     */
    public RequestMetadata getRequestMetadata() { return requestMetadata; }
    public void setRequestMetadata(RequestMetadata value) { this.requestMetadata = value; }

    /**
     * The resource location information.
     */
    public ResourceLocation getResourceLocation() { return resourceLocation; }
    public void setResourceLocation(ResourceLocation value) { this.resourceLocation = value; }

    /**
     * The resource or collection that is the target of the operation.
     * The name is a scheme-less URI, not including the API service name.
     * For example:
     *
     * "shelves/SHELF_ID/books"
     * "shelves/SHELF_ID/books/BOOK_ID"
     */
    public String getResourceName() { return resourceName; }
    public void setResourceName(String value) { this.resourceName = value; }

    /**
     * The resource's original state before mutation. Present only for
     * operations which have successfully modified the targeted resource(s).
     * In general, this field should contain all changed fields, except those
     * that are already been included in `request`, `response`, `metadata` or
     * `service_data` fields.
     * When the JSON object represented here has a proto equivalent,
     * the proto name will be indicated in the `@type` property.
     */
    public ResourceOriginalState getResourceOriginalState() { return resourceOriginalState; }
    public void setResourceOriginalState(ResourceOriginalState value) { this.resourceOriginalState = value; }

    /**
     * The operation response. This may not include all response elements,
     * such as those that are too large, privacy-sensitive, or duplicated
     * elsewhere in the log record.
     * It should never include user-generated data, such as file contents.
     * When the JSON object represented here has a proto equivalent, the proto
     * name will be indicated in the `@type` property.
     */
    public Response getResponse() { return response; }
    public void setResponse(Response value) { this.response = value; }

    /**
     * Deprecated, use `metadata` field instead.
     * Other service-specific data about the request, response, and other
     * activities.
     * When the JSON object represented here has a proto equivalent, the proto
     * name will be indicated in the `@type` property.
     */
    public ServiceData getServiceData() { return serviceData; }
    public void setServiceData(ServiceData value) { this.serviceData = value; }

    /**
     * The name of the API service performing the operation. For example,
     * `"datastore.googleapis.com"`.
     */
    public String getServiceName() { return serviceName; }
    public void setServiceName(String value) { this.serviceName = value; }

    /**
     * The status of the overall operation.
     */
    public Status getStatus() { return status; }
    public void setStatus(Status value) { this.status = value; }
}
