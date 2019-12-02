package com.light.spring.core.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Dev")
@Component
public class DevDatabaseConfiguration implements DatabaseConfiguration {

	public void doSetup() {
		System.out.println("|DEV| Database configuration set up done.");
	}
}
