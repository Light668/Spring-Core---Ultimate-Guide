package com.light.spring.core.autowire.no;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext-autowire-no.xml");
		System.out.println(applicationContext.getBean("person"));
	}

}