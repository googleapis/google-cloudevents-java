/*
 * Copyright 2021 Google LLC
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

package com.google.events.firebase.testlab.v1;

import java.time.OffsetDateTime;

/**
 * The data within all Firebase test matrix events.
 */
public class TestMatrixEventData {
    private ClientInfo clientInfo;
    private OffsetDateTime createTime;
    private String invalidMatrixDetails;
    private OutcomeSummary outcomeSummary;
    private ResultStorage resultStorage;
    private State state;

    /**
     * Information provided by the client that created the test matrix.
     */
    public ClientInfo getClientInfo() { return clientInfo; }
    public void setClientInfo(ClientInfo value) { this.clientInfo = value; }

    /**
     * Time the test matrix was created.
     */
    public OffsetDateTime getCreateTime() { return createTime; }
    public void setCreateTime(OffsetDateTime value) { this.createTime = value; }

    /**
     * Code that describes why the test matrix is considered invalid. Only set for
     * matrices in the INVALID state.
     */
    public String getInvalidMatrixDetails() { return invalidMatrixDetails; }
    public void setInvalidMatrixDetails(String value) { this.invalidMatrixDetails = value; }

    /**
     * Outcome summary of the test matrix.
     */
    public OutcomeSummary getOutcomeSummary() { return outcomeSummary; }
    public void setOutcomeSummary(OutcomeSummary value) { this.outcomeSummary = value; }

    /**
     * Locations where test results are stored.
     */
    public ResultStorage getResultStorage() { return resultStorage; }
    public void setResultStorage(ResultStorage value) { this.resultStorage = value; }

    /**
     * State of the test matrix.
     */
    public State getState() { return state; }
    public void setState(State value) { this.state = value; }
}
