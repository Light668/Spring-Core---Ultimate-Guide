package com.light.spring.core.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(MessageConfiguration.class);
		//applicationContext.getBean(MessagePublisher.class).publishMessage();
		applicationContext.start();
		applicationContext.stop();
		applicationContext.close();
	}
}
