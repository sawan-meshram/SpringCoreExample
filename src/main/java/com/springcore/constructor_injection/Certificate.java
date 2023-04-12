package com.springcore.constructor_injection;

public class Certificate {
	private String name;

	private Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}
	
}
