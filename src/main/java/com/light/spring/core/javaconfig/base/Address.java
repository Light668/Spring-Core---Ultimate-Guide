package com.light.spring.core.javaconfig.base;

public class Address {

	private String unit;
	private String street;

	public Address(String unit, String street) {
		this.unit = unit;
		this.street = street;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [unit=" + unit + ", street=" + street + "]";
	}

}
