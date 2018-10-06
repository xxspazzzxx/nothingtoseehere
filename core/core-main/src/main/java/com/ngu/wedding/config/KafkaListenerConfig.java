package com.ngu.wedding.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
//@Profile("dev")
public class KafkaListenerConfig
{

	@KafkaListener(topics = "guests", groupId = "weddinginfo")
	public void listen(String message) {
		System.out.println("Received a request to attend: " + message);
	}

}
