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
import google.events.cloud.audit.v1.AuthenticationInfo;
import google.events.cloud.audit.v1.AuthorizationInfo;
import google.events.cloud.audit.v1.LogEntryData;
import com.google.gson.Gson;
import io.cloudevents.CloudEvent;
import io.cloudevents.core.builder.CloudEventBuilder;
import java.net.URI;
import java.util.Date;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCloudEventTest {
  private static final TestLogHandler LOG_HANDLER = new TestLogHandler();
  private static final Logger logger = Logger.getLogger(HelloCloudEvent.class.getName());

  @Before
  public void beforeTest() throws Exception {
    logger.addHandler(LOG_HANDLER);
  }

  @After
  public void afterTest() {
    LOG_HANDLER.clear();
  }

  @Test
  public void helloGcs_shouldPrintFileName() throws JsonProcessingException {
  
    // LogEntryData logEntry = new LogEntryData();
    // logEntry.setLogName("test");
    // ResourceClass resource = new ResourceClass();
    // String type = "testType";
    // resource.setType(type);
    // logEntry.setResource(resource);
    // ProtoPayload payload = new ProtoPayload();
    // payload.setResourceName("test");
    // AuthenticationInfo authInfo = new AuthenticationInfo();
    // String email = "test@test.com";
    // authInfo.setPrincipalEmail(email);
    // payload.setAuthenticationInfo(authInfo);
    // logEntry.setProtoPayload(payload);
    // Gson gson = new Gson();

    // // Construct a CloudEvent
    // CloudEvent event =
    //     CloudEventBuilder.v1()
    //         .withId("0")
    //         .withType("google.storage.object.finalize")
    //         .withSource(URI.create("https://example.com"))
    //         .withData("application/json", gson.toJson(logEntry).getBytes())
    //         .build();

    // new HelloCloudEvent().accept(event);

    // String actual1 = LOG_HANDLER.getStoredLogRecords().get(0).getMessage();
    // String actual2 = LOG_HANDLER.getStoredLogRecords().get(1).getMessage();
    // assertThat(actual1).contains(type);
    // assertThat(actual2).contains(email);
  }
}
