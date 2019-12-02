package com.light.spring.core.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.light.spring.core.profile")
@org.springframework.context.annotation.Configuration
public class Configuration {

	//@Bean
	public DatabaseConfigurationHandler databaseConfigurationHandler() {
		return new DatabaseConfigurationHandler();
	}
}
