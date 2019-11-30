package com.light.spring.core.javaconfig.autowire.multi.locations;

public class Artist {

	private Instrument instrument;

	public Artist(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Artist [instrument=" + instrument + "]";
	}

}
