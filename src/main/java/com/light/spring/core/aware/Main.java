package com.light.spring.core.aware;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		StandardEnvironment standardEnvironment = new StandardEnvironment();
		MutablePropertySources mutablePropertySources = standardEnvironment.getPropertySources();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "john doe");
		
		mutablePropertySources.addFirst(new MapPropertySource("custom", map));
		
		ctx.setEnvironment(standardEnvironment);
		
		ctx.scan("com.light.spring.core.aware");
		ctx.refresh();
	}
}
