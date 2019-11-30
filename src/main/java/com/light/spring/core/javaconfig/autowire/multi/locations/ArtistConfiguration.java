package com.light.spring.core.javaconfig.autowire.multi.locations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration {

	@Autowired
	private Instrument instrument;

	@Bean
	public Artist artist() {
		return new Artist(instrument);
	}
}
