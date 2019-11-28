package com.light.spring.core.xmlconfig.setter;

public class Artist {

	private String firstName;
	private String lastName;

	@Override
	public String toString() {
		return "Artist [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
