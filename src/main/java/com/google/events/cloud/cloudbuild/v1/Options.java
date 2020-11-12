/**
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

package com.google.events.cloud.cloudbuild.v1;

/**
 * Special options for this build.
 */
public class Options {
    private DiskSizeGBUnion diskSizeGB;
    private String[] env;
    private Logging logging;
    private LogStreamingOption logStreamingOption;
    private MachineType machineType;
    private RequestedVerifyOption requestedVerifyOption;
    private String[] secretEnv;
    private SourceProvenanceHashElement[] sourceProvenanceHash;
    private SubstitutionOption substitutionOption;
    private Volume[] volumes;
    private String workerPool;

    /**
     * Requested disk size for the VM that runs the build. Note that this is *NOT*
     * "disk free"; some of the space will be used by the operating system and
     * build utilities. Also note that this is the minimum disk size that will be
     * allocated for the build -- the build may run with a larger disk than
     * requested. At present, the maximum disk size is 1000GB; builds that request
     * more than the maximum are rejected with an error.
     */
    public DiskSizeGBUnion getDiskSizeGB() { return diskSizeGB; }
    public void setDiskSizeGB(DiskSizeGBUnion value) { this.diskSizeGB = value; }

    /**
     * A list of global environment variable definitions that will exist for all
     * build steps in this build. If a variable is defined in both globally and in
     * a build step, the variable will use the build step value.
     *
     * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
     * being given the value "VALUE".
     */
    public String[] getEnv() { return env; }
    public void setEnv(String[] value) { this.env = value; }

    /**
     * Option to specify the logging mode, which determines where the logs are
     * stored.
     */
    public Logging getLogging() { return logging; }
    public void setLogging(Logging value) { this.logging = value; }

    /**
     * Option to define build log streaming behavior to Google Cloud
     * Storage.
     */
    public LogStreamingOption getLogStreamingOption() { return logStreamingOption; }
    public void setLogStreamingOption(LogStreamingOption value) { this.logStreamingOption = value; }

    /**
     * Compute Engine machine type on which to run the build.
     */
    public MachineType getMachineType() { return machineType; }
    public void setMachineType(MachineType value) { this.machineType = value; }

    /**
     * Requested verifiability options.
     */
    public RequestedVerifyOption getRequestedVerifyOption() { return requestedVerifyOption; }
    public void setRequestedVerifyOption(RequestedVerifyOption value) { this.requestedVerifyOption = value; }

    /**
     * A list of global environment variables, which are encrypted using a Cloud
     * Key Management Service crypto key. These values must be specified in the
     * build's `Secret`. These variables will be available to all build steps
     * in this build.
     */
    public String[] getSecretEnv() { return secretEnv; }
    public void setSecretEnv(String[] value) { this.secretEnv = value; }

    /**
     * Requested hash for SourceProvenance.
     */
    public SourceProvenanceHashElement[] getSourceProvenanceHash() { return sourceProvenanceHash; }
    public void setSourceProvenanceHash(SourceProvenanceHashElement[] value) { this.sourceProvenanceHash = value; }

    /**
     * Option to specify behavior when there is an error in the substitution
     * checks.
     */
    public SubstitutionOption getSubstitutionOption() { return substitutionOption; }
    public void setSubstitutionOption(SubstitutionOption value) { this.substitutionOption = value; }

    /**
     * Global list of volumes to mount for ALL build steps
     *
     * Each volume is created as an empty volume prior to starting the build
     * process. Upon completion of the build, volumes and their contents are
     * discarded. Global volume names and paths cannot conflict with the volumes
     * defined a build step.
     *
     * Using a global volume in a build with only one step is not valid as
     * it is indicative of a build request with an incorrect configuration.
     */
    public Volume[] getVolumes() { return volumes; }
    public void setVolumes(Volume[] value) { this.volumes = value; }

    /**
     * Option to specify a `WorkerPool` for the build.
     * Format: projects/{project}/locations/{location}/workerPools/{workerPool}
     */
    public String getWorkerPool() { return workerPool; }
    public void setWorkerPool(String value) { this.workerPool = value; }
}
