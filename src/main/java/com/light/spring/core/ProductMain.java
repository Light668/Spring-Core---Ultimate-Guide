package com.light.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {

		// Instantiate theSpring IoC Container

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Get the bean information from Spring IoC

		Product product = applicationContext.getBean("product2", Product.class);

		// Use the bean
		
		System.out.println(product);
	}

}
