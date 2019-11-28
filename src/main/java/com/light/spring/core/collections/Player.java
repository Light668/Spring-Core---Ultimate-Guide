package com.light.spring.core.collections;

public class Player {
	
	private String name;

	public Player(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[ Player: " +name+ " ]";
	}

}
