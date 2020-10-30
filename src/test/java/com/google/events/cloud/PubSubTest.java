package com.google.events.cloud;

import static org.junit.Assert.assertEquals;

import java.util.Base64;

import com.google.events.cloud.pubsub.v1.MessagePublishedData;
import com.google.events.cloud.pubsub.v1.PubsubMessage;

import org.junit.Test;

/**
 * Tests that you can create a Pub/Sub Message.
 */
public class PubSubTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        String base64String = Base64.getEncoder().encodeToString("foo".getBytes());
        
        // Create Pub/Sub message POJO
        PubsubMessage pubsubMessage = new PubsubMessage();
        pubsubMessage.setData(base64String);
        MessagePublishedData data = new MessagePublishedData();
        data.setMessage(pubsubMessage);

        // Test POJO can get data correctly
        assertEquals(data.getMessage().getData(), base64String);
    }
}
