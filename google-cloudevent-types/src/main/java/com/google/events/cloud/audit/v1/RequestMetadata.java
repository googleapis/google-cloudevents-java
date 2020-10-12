package com.google.events.cloud.audit.v1;

/**
 * Metadata about the operation.
 */
public class RequestMetadata {
    private String callerIP;
    private String callerNetwork;
    private String callerSuppliedUserAgent;
    private Peer destinationAttributes;
    private Request requestAttributes;

    /**
     * The IP address of the caller. For caller from internet, this will be public IPv4 or IPv6
     * address. For caller from a Compute Engine VM with external IP address, this will be the
     * VM's external IP address. For caller from a Compute Engine VM without external IP
     * address, if the VM is in the same organization (or project) as the accessed resource,
     * `caller_ip` will be the VM's internal IPv4 address, otherwise the `caller_ip` will be
     * redacted to "gce-internal-ip". See https://cloud.google.com/compute/docs/vpc/ for more
     * information."
     */
    public String getCallerIP() { return callerIP; }
    public void setCallerIP(String value) { this.callerIP = value; }

    /**
     * The network of the caller.
     */
    public String getCallerNetwork() { return callerNetwork; }
    public void setCallerNetwork(String value) { this.callerNetwork = value; }

    /**
     * The user agent of the caller. This information is not authenticated and should be treated
     * accordingly.
     */
    public String getCallerSuppliedUserAgent() { return callerSuppliedUserAgent; }
    public void setCallerSuppliedUserAgent(String value) { this.callerSuppliedUserAgent = value; }

    /**
     * The destination of a network activity, such as accepting a TCP connection.
     */
    public Peer getDestinationAttributes() { return destinationAttributes; }
    public void setDestinationAttributes(Peer value) { this.destinationAttributes = value; }

    /**
     * Request attributes used in IAM condition evaluation. This field contains request
     * attributes like request time and access levels associated with the request.
     */
    public Request getRequestAttributes() { return requestAttributes; }
    public void setRequestAttributes(Request value) { this.requestAttributes = value; }
}
