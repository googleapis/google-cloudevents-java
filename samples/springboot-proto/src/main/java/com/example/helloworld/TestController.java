package com.example.helloworld;

import google.events.cloud.pubsub.v1.MessagePublishedData;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.POST) // consumes = "application/x-protobuf"
    public ResponseEntity<String> receiveMessage(@RequestBody MessagePublishedData body,
            @RequestHeader Map<String, String> headers) throws Exception {

        // JsonFormat.parser().merge(body, builder);
        // MessagePublishedData data = builder.build();
        // PubsubMessage message = body.getMessage();
        // System.out.println(message.getData());
        // System.out.println(message.getMessageId());
        // System.out.println(headers.get("ce-source"));
        System.out.println(body);

        return new ResponseEntity<String>("received!", HttpStatus.OK);
    }
}

// @RestController
// public class TestController {
// @RequestMapping(value = "/", method = RequestMethod.POST)
// public ResponseEntity<String> receiveMessage(
// @RequestBody MessagePublishedData body, @RequestHeader Map<String, String>
// headers) {

// PubsubMessage message = body.getMessage();
// System.out.println(message.getData());
// System.out.println(message.getMessageId());
// System.out.println(headers.get("ce-source"));
// System.out.println(message.toString());

// return new ResponseEntity<String>("received!", HttpStatus.OK);
// }
// }
