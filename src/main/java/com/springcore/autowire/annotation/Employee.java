package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address2") //when there are more that one Address bean specify on XML config then used the annotation, used address1 or address2 to see changes
	private Address address; //when we add autowire on the Address type, then it autowire as byType
	

	public Employee() {
		super();
		System.out.println("Employee : default constructor");
	}

//	@Autowired
	public Employee(Address address) {  //when we add autowire on the setAddress, then it autowire as constructor
		super();
		this.address = address;
		System.out.println("Employee : constructor (Address)");
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {  //when we add autowire on the setAddress, then it autowire as byName
		this.address = address;
		System.out.println("Employee : set property Address)");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
