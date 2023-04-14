package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void helloStudent() {
		System.out.println("Hi, this is student from Student class.");
		address.showAddress();
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
