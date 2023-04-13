package com.springcore.autowire.xml;

public class Employee {
	private Address address;

	public Employee() {
		super();
		System.out.println("Employee : default constructor");
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Employee : constructor (Address)");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee : set property Address)");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
