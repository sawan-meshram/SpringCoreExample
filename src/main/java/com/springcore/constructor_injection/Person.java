package com.springcore.constructor_injection;

import java.util.List;

public class Person {
	private int id;
	private String name;
	private Certificate certificate;
	private List<String> address;
	
	public Person(int id, String name, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.certificate = certificate;
	}

	public Person(int id, String name, Certificate certificate, List<String> address) {
		super();
		this.id = id;
		this.name = name;
		this.certificate = certificate;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certificate=" + certificate + ", address=" + address + "]";
	}
	

}
