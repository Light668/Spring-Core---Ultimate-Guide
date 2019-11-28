package com.light.spring.core.circular.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-circular.xml");
		System.out.println(applicationContext.getBean(Department.class));
	}

}
