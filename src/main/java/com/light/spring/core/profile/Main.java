package com.light.spring.core.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.getEnvironment().setDefaultProfiles("Test");
		applicationContext.scan("com.light.spring.core.profile");
		applicationContext.refresh();
		applicationContext.getBean("databaseConfigurationHandler", DatabaseConfigurationHandler.class).print();
	}

}
