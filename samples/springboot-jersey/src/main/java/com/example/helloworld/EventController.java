package com.example.helloworld;

import static io.cloudevents.core.CloudEventUtils.mapData;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.events.cloud.pubsub.v1.Message;
import com.google.events.cloud.pubsub.v1.MessagePublishedData;
import io.cloudevents.CloudEvent;
import io.cloudevents.core.data.PojoCloudEventData;
import io.cloudevents.jackson.PojoCloudEventDataMapper;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/")
public class EventController {
  @Autowired ObjectMapper objectMapper;

  @POST
  @Path("/")
  public String ce(CloudEvent event) {
    ObjectMapper objectMapper =
        new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.registerModule(new JavaTimeModule());
    PojoCloudEventData<MessagePublishedData> cloudEventData =
        mapData(event, PojoCloudEventDataMapper.from(objectMapper, MessagePublishedData.class));

    Message message = cloudEventData.getValue().getMessage();
    System.out.println(
        new String(Base64.getDecoder().decode(message.getData()), StandardCharsets.UTF_8));
    System.out.println(message.getMessageId());
    System.out.println(event.getSource());

    return "received!";
  }
}
