package com.light.spring.core.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {// implements ApplicationListener<MessageEvent> {

	@EventListener
	public void onApplicationEvent(MessageEvent event) {
		System.out.println(event.getMessage());
		// System.out.println(event.getTimestamp());
	}

	@EventListener
	public void onApplicationEvent(DateTimeEvent dateTimeEvent) {
		System.out.println(dateTimeEvent.getDateTime());
	}

	@EventListener
	public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
		System.out.println("Context started!");
	}

	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		System.out.println("Context refreshed!");
	}

	@EventListener
	public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
		System.out.println("Context stopped!");
	}

	@EventListener
	public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
		System.out.println("Context closed!");
	}

}
