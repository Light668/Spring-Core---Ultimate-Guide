package com.light.spring.core.javaconfig.autowire.primary;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	@Autowired
	private Vehicle vehicle;

	public void driveVehicle() {
		vehicle.drive();
	}
}
