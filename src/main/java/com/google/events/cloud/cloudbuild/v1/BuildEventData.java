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

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Build event data
 * Common build format for Google Cloud Platform API operations.
 * Copied from
 *
 * https://github.com/googleapis/googleapis/blob/master/google/devtools/cloudbuild/v1/cloudbuild.proto.
 */
public class BuildEventData {
    private Artifacts artifacts;
    private String buildTriggerID;
    private OffsetDateTime createTime;
    private OffsetDateTime finishTime;
    private String id;
    private String[] images;
    private String logsBucket;
    private String logURL;
    private Options options;
    private String projectID;
    private QueueTTL queueTTL;
    private Results results;
    private Secret[] secrets;
    private Source source;
    private SourceProvenance sourceProvenance;
    private OffsetDateTime startTime;
    private Status status;
    private String statusDetail;
    private Step[] steps;
    private Map<String, String> substitutions;
    private String[] tags;
    private BuildEventDataTimeout timeout;
    private Map<String, TimeSpan> timing;

    /**
     * Artifacts produced by the build that should be uploaded upon
     * successful completion of all build steps.
     */
    public Artifacts getArtifacts() { return artifacts; }
    public void setArtifacts(Artifacts value) { this.artifacts = value; }

    /**
     * The ID of the `BuildTrigger` that triggered this build, if it
     * was triggered automatically.
     */
    public String getBuildTriggerID() { return buildTriggerID; }
    public void setBuildTriggerID(String value) { this.buildTriggerID = value; }

    /**
     * Time at which the request to create the build was received.
     */
    public OffsetDateTime getCreateTime() { return createTime; }
    public void setCreateTime(OffsetDateTime value) { this.createTime = value; }

    /**
     * Time at which execution of the build was finished.
     *
     * The difference between finish_time and start_time is the duration of the
     * build's execution.
     */
    public OffsetDateTime getFinishTime() { return finishTime; }
    public void setFinishTime(OffsetDateTime value) { this.finishTime = value; }

    /**
     * Unique identifier of the build.
     */
    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    /**
     * A list of images to be pushed upon the successful completion of all build
     * steps.
     *
     * The images are pushed using the builder service account's credentials.
     *
     * The digests of the pushed images will be stored in the `Build` resource's
     * results field.
     *
     * If any of the images fail to be pushed, the build status is marked
     * `FAILURE`.
     */
    public String[] getImages() { return images; }
    public void setImages(String[] value) { this.images = value; }

    /**
     * Google Cloud Storage bucket where logs should be written (see
     * [Bucket Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
     */
    public String getLogsBucket() { return logsBucket; }
    public void setLogsBucket(String value) { this.logsBucket = value; }

    /**
     * URL to logs for this build in Google Cloud Console.
     */
    public String getLogURL() { return logURL; }
    public void setLogURL(String value) { this.logURL = value; }

    /**
     * Special options for this build.
     */
    public Options getOptions() { return options; }
    public void setOptions(Options value) { this.options = value; }

    /**
     * ID of the project.
     */
    public String getProjectID() { return projectID; }
    public void setProjectID(String value) { this.projectID = value; }

    /**
     * TTL in queue for this build. If provided and the build is enqueued longer
     * than this value, the build will expire and the build status will be
     * `EXPIRED`.
     *
     * The TTL starts ticking from create_time.
     */
    public QueueTTL getQueueTTL() { return queueTTL; }
    public void setQueueTTL(QueueTTL value) { this.queueTTL = value; }

    /**
     * Results of the build.
     */
    public Results getResults() { return results; }
    public void setResults(Results value) { this.results = value; }

    /**
     * Secrets to decrypt using Cloud Key Management Service.
     */
    public Secret[] getSecrets() { return secrets; }
    public void setSecrets(Secret[] value) { this.secrets = value; }

    /**
     * The location of the source files to build.
     */
    public Source getSource() { return source; }
    public void setSource(Source value) { this.source = value; }

    /**
     * A permanent fixed identifier for source.
     */
    public SourceProvenance getSourceProvenance() { return sourceProvenance; }
    public void setSourceProvenance(SourceProvenance value) { this.sourceProvenance = value; }

    /**
     * Time at which execution of the build was started.
     */
    public OffsetDateTime getStartTime() { return startTime; }
    public void setStartTime(OffsetDateTime value) { this.startTime = value; }

    /**
     * Status of the build.
     */
    public Status getStatus() { return status; }
    public void setStatus(Status value) { this.status = value; }

    /**
     * Customer-readable message about the current status.
     */
    public String getStatusDetail() { return statusDetail; }
    public void setStatusDetail(String value) { this.statusDetail = value; }

    /**
     * The operations to be performed on the workspace.
     */
    public Step[] getSteps() { return steps; }
    public void setSteps(Step[] value) { this.steps = value; }

    /**
     * Substitutions data for `Build` resource.
     */
    public Map<String, String> getSubstitutions() { return substitutions; }
    public void setSubstitutions(Map<String, String> value) { this.substitutions = value; }

    /**
     * Tags for annotation of a `Build`. These are not docker tags.
     */
    public String[] getTags() { return tags; }
    public void setTags(String[] value) { this.tags = value; }

    /**
     * Amount of time that this build should be allowed to run, to second
     * granularity. If this amount of time elapses, work on the build will cease
     * and the build status will be `TIMEOUT`.
     */
    public BuildEventDataTimeout getTimeout() { return timeout; }
    public void setTimeout(BuildEventDataTimeout value) { this.timeout = value; }

    /**
     * Stores timing information for phases of the build. Valid keys
     * are:
     *
     * * BUILD: time to execute all build steps
     * * PUSH: time to push all specified images.
     * * FETCHSOURCE: time to fetch source.
     *
     * If the build does not specify source or images,
     * these keys will not be included.
     */
    public Map<String, TimeSpan> getTiming() { return timing; }
    public void setTiming(Map<String, TimeSpan> value) { this.timing = value; }
}
