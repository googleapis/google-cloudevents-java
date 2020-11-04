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

package com.google.events.cloud.cloudbuild.v1;

/**
 * A step in the build pipeline.
 */
public class Step {
    private String[] args;
    private String dir;
    private String entrypoint;
    private String[] env;
    private String id;
    private String name;
    private PullTiming pullTiming;
    private String[] secretEnv;
    private DiskSizeGBUnion status;
    private StepTimeout timeout;
    private StepTiming timing;
    private Volume[] volumes;
    private String[] waitFor;

    /**
     * A list of arguments that will be presented to the step when it is started.
     *
     * If the image used to run the step's container has an entrypoint, the `args`
     * are used as arguments to that entrypoint. If the image does not define
     * an entrypoint, the first element in args is used as the entrypoint,
     * and the remainder will be used as arguments.
     */
    public String[] getArgs() { return args; }
    public void setArgs(String[] value) { this.args = value; }

    /**
     * Working directory to use when running this step's container.
     *
     * If this value is a relative path, it is relative to the build's working
     * directory. If this value is absolute, it may be outside the build's working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     *
     * If the build specifies a `RepoSource` with `dir` and a step with a `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored for
     * the step's execution.
     */
    public String getDir() { return dir; }
    public void setDir(String value) { this.dir = value; }

    /**
     * Entrypoint to be used instead of the build step image's default entrypoint.
     * If unset, the image's default entrypoint is used.
     */
    public String getEntrypoint() { return entrypoint; }
    public void setEntrypoint(String value) { this.entrypoint = value; }

    /**
     * A list of environment variable definitions to be used when running a step.
     *
     * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
     * being given the value "VALUE".
     */
    public String[] getEnv() { return env; }
    public void setEnv(String[] value) { this.env = value; }

    /**
     * Unique identifier for this build step, used in `wait_for` to
     * reference this build step as a dependency.
     */
    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    /**
     * The name of the container image that will run this particular
     * build step.
     *
     * If the image is available in the host's Docker daemon's cache, it
     * will be run directly. If not, the host will attempt to pull the image
     * first, using the builder service account's credentials if necessary.
     *
     * The Docker daemon's cache will already have the latest versions of all of
     * the officially supported build steps
     *
     * ([https://github.com/GoogleCloudPlatform/cloud-builders](https://github.com/GoogleCloudPlatform/cloud-builders)).
     * The Docker daemon will also have cached many of the layers for some popular
     * images, like "ubuntu", "debian", but they will be refreshed at the time you
     * attempt to use them.
     *
     * If you built an image in a previous build step, it will be stored in the
     * host's Docker daemon's cache and is available to use as the name for a
     * later build step.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    /**
     * Stores timing information for pulling this build step's
     * builder image only.
     */
    public PullTiming getPullTiming() { return pullTiming; }
    public void setPullTiming(PullTiming value) { this.pullTiming = value; }

    /**
     * A list of environment variables which are encrypted using a Cloud Key
     * Management Service crypto key. These values must be specified in the
     * build's `Secret`.
     */
    public String[] getSecretEnv() { return secretEnv; }
    public void setSecretEnv(String[] value) { this.secretEnv = value; }

    /**
     * Status of the build step. At this time, build step status is
     * only updated on build completion; step status is not updated in real-time
     * as the build progresses.
     */
    public DiskSizeGBUnion getStatus() { return status; }
    public void setStatus(DiskSizeGBUnion value) { this.status = value; }

    /**
     * Time limit for executing this build step. If not defined, the step has no
     * time limit and will be allowed to continue to run until either it completes
     * or the build itself times out.
     */
    public StepTimeout getTimeout() { return timeout; }
    public void setTimeout(StepTimeout value) { this.timeout = value; }

    /**
     * Stores timing information for executing this build step.
     */
    public StepTiming getTiming() { return timing; }
    public void setTiming(StepTiming value) { this.timing = value; }

    /**
     * List of volumes to mount into the build step.
     *
     * Each volume is created as an empty volume prior to execution of the
     * build step. Upon completion of the build, volumes and their contents are
     * discarded.
     *
     * Using a named volume in only one step is not valid as it is indicative
     * of a build request with an incorrect configuration.
     */
    public Volume[] getVolumes() { return volumes; }
    public void setVolumes(Volume[] value) { this.volumes = value; }

    /**
     * The ID(s) of the step(s) that this build step depends on.
     * This build step will not start until all the build steps in `wait_for`
     * have completed successfully. If `wait_for` is empty, this build step will
     * start when all previous build steps in the `Build.Steps` list have
     * completed successfully.
     */
    public String[] getWaitFor() { return waitFor; }
    public void setWaitFor(String[] value) { this.waitFor = value; }
}
