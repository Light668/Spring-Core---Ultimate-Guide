package com.light.spring.core.circular.dependency;

public class Department {

	private Employee emp;

	private Department(Employee emp) {
		this.emp = emp;
	}
}