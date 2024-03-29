package com.light.spring.core.javaconfig.autowire.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(VehicleConfiguration.class);
		applicationContext.getBean(Person.class).driveVehicle();
	}

}
