package com.example.helloworld;

import com.google.events.cloud.pubsub.v1.MessagePublishedData;
import com.google.protobuf.util.JsonFormat;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudEventController {
  private static final Logger LOGGER = LoggerFactory.getLogger(CloudEventController.class);

  @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
  public ResponseEntity<String> receiveMessage(
      @RequestBody String body, @RequestHeader Map<String, String> headers) throws Exception {

    MessagePublishedData.Builder builder = MessagePublishedData.newBuilder();
    JsonFormat.parser().merge(body, builder);
    MessagePublishedData data = builder.build();

    LOGGER.info("### CloudEvent Data ###");
    LOGGER.info(data.toString());
    LOGGER.info(data.getMessage().getMessageId());

    LOGGER.info("### Header Info ###");
    LOGGER.info("ce-id: " + headers.get("ce-id"));
    LOGGER.info("ce-source: " + headers.get("ce-source"));
    LOGGER.info("ce-type: " + headers.get("ce-type"));

    return new ResponseEntity<String>("Event received!", HttpStatus.OK);
  }
}
