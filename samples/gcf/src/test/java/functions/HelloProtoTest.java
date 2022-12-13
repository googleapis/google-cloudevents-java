/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package functions;

import static com.google.common.truth.Truth.assertThat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.testing.TestLogHandler;
import com.google.protobuf.InvalidProtocolBufferException;
import io.cloudevents.CloudEvent;
import io.cloudevents.core.builder.CloudEventBuilder;
import java.net.URI;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloProtoTest {
  private static final TestLogHandler LOG_HANDLER = new TestLogHandler();
  private static final Logger logger = Logger.getLogger(HelloProto.class.getName());

  @Before
  public void beforeTest() throws Exception {
    logger.addHandler(LOG_HANDLER);
  }

  @After
  public void afterTest() {
    LOG_HANDLER.clear();
  }

  @Test
  public void helloGcs_shouldPrintFileName()
      throws JsonProcessingException, InvalidProtocolBufferException {
    String data =
        "{\"insertId\":\"9frck8cf9j\",\"logName\":\"projects/test-project/logs/cloudaudit.googleapis.com%2Factivity\",\"protoPayload\":{\"authenticationInfo\":{\"principalEmail\":\"robot@test-project.iam.gserviceaccount.com\",\"principalSubject\":\"user:robot@test-project.iam.gserviceaccount.com\",\"serviceAccountKeyName\":\"//iam.googleapis.com/projects/test-project/serviceAccounts/robot@test-project.iam.gserviceaccount.com/keys/90f662482321f1ca8e82ea675b1a1c30c1fe681f\"},\"authorizationInfo\":[{\"granted\":true,\"permission\":\"pubsub.topics.create\",\"resource\":\"projects/test-project\",\"resourceAttributes\":{}}],\"methodName\":\"google.pubsub.v1.Publisher.CreateTopic\",\"request\":{\"@type\":\"type.googleapis.com/google.pubsub.v1.Topic\",\"name\":\"projects/test-project/topics/test-auditlogs-source\"},\"requestMetadata\":{\"callerIp\":\"192.168.0.1\",\"callerNetwork\":\"//compute.googleapis.com/projects/google.com:my-laptop/global/networks/__unknown__\",\"callerSuppliedUserAgent\":\"google-cloud-sdk\",\"destinationAttributes\":{},\"requestAttributes\":{\"auth\":{},\"time\":\"2020-06-30T16:14:47.600710407Z\"}},\"resourceLocation\":{\"currentLocations\":[\"asia-east1\",\"asia-northeast1\",\"asia-southeast1\",\"australia-southeast1\",\"europe-north1\",\"europe-west1\",\"europe-west2\",\"europe-west3\",\"europe-west4\",\"us-central1\",\"us-central2\",\"us-east1\",\"us-east4\",\"us-west1\",\"us-west2\",\"us-west3\",\"us-west4\"]},\"resourceName\":\"projects/test-project/topics/test-auditlogs-source\",\"response\":{\"@type\":\"type.googleapis.com/google.pubsub.v1.Topic\",\"messageStoragePolicy\":{\"allowedPersistenceRegions\":[\"asia-east1\",\"asia-northeast1\",\"asia-southeast1\",\"australia-southeast1\",\"europe-north1\",\"europe-west1\",\"europe-west2\",\"europe-west3\",\"europe-west4\",\"us-central1\",\"us-central2\",\"us-east1\",\"us-east4\",\"us-west1\",\"us-west2\",\"us-west3\",\"us-west4\"]},\"name\":\"projects/test-project/topics/test-auditlogs-source\"},\"serviceName\":\"pubsub.googleapis.com\"},\"receiveTimestamp\":\"2020-06-30T16:14:48.401489148Z\",\"resource\":{\"labels\":{\"project_id\":\"test-project\",\"topic_id\":\"projects/test-project/topics/test-auditlogs-source\"},\"type\":\"pubsub_topic\"},\"severity\":\"NOTICE\",\"timestamp\":\"2020-06-30T16:14:47.593398572Z\"}";

    // Construct a CloudEvent
    CloudEvent event =
        CloudEventBuilder.v1()
            .withId("0")
            .withType("google.storage.object.finalize")
            .withSource(URI.create("https://example.com"))
            .withData("application/json", data.getBytes())
            .build();

    new HelloProto().accept(event);

    assertThat(LOG_HANDLER.getStoredLogRecords().get(1).getMessage())
        .contains("logs/cloudaudit.googleapis.com");
    assertThat(LOG_HANDLER.getStoredLogRecords().get(2).getMessage()).contains("robot@");
  }
}
