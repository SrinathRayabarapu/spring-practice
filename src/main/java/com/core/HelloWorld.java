package com.core;

public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Your names is :"+name;
	}
	
}
