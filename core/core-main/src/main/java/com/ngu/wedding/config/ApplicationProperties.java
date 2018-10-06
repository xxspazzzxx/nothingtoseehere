package com.ngu.wedding.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "application", ignoreInvalidFields = false)
public class ApplicationProperties
{

	private String kafkaUri = null;
	private String kafkaGroupId = null;

	public String getKafkaUri()
	{
		return kafkaUri;
	}

	public void setKafkaUri(String kafkaUri)
	{
		this.kafkaUri = kafkaUri;
	}

	public String getKafkaGroupId()
	{
		return kafkaGroupId;
	}

	public void setKafkaGroupId(String kafkaGroupId)
	{
		this.kafkaGroupId = kafkaGroupId;
	}
}
