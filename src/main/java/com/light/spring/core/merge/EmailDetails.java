package com.light.spring.core.merge;

import java.util.Properties;

public class EmailDetails extends Details {
	
	private Properties details;

	public Properties getDetails() {
		return details;
	}

	public void setDetails(Properties details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "EmailDetails [details=" + details + "]";
	}
	
	
}
