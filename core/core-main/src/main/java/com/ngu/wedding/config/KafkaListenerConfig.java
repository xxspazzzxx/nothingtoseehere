package com.ngu.wedding.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Spring wired object that has a Kafka Listener.  Using weddinginfo as the topic.  GroupID is the consumer on this
 * topic (domain) to do "something" with the payload.
 */
@Configuration
//@Profile("dev")
public class KafkaListenerConfig
{

	@KafkaListener(topics = "weddinginfo", groupId = "guests")
	public void listenForGuestRequest(String message)
	{
		System.out.println("Received a request to attend: " + message);
	}

	@KafkaListener(topics = "weddinginfo", groupId = "hosts")
	public void listenForHostMessage(String message)
	{
		System.out.println("Received a message from a host: " + message);
	}

}
