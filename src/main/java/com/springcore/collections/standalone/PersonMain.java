package com.springcore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/standalone/standalone_collection_config.xml");
		Person p1 = context.getBean("p1", Person.class);
		System.out.println(p1); //Person [friends=[Sawan, Jackie, Ram], feeStructure={Java 1.8=8000, Spring Framework=10000, Hibernet=5000}, properties={address=Nagpur, name=Sawan, designation=Software Engg}]
		
		System.out.println(p1.getFriends().getClass().getName()); //java.util.ArrayList
		System.out.println(p1.getFeeStructure().getClass().getName()); //java.util.LinkedHashMap
		System.out.println(p1.getProperties().getClass().getName()); //java.util.Properties

		System.out.println(p1.getFriends()); //[Sawan, Jackie, Ram]

		System.out.println(p1.getFeeStructure()); //{Java 1.8=8000, Spring Framework=10000, Hibernet=5000}

		System.out.println(p1.getProperties()); //{address=Nagpur, name=Sawan, designation=Software Engg}
		
		System.out.println("----------------------------------------");
		
		Person p2 = context.getBean("p2", Person.class);
		System.out.println(p2);  //Person [friends=[Sawan, Jackie, Ram], feeStructure={Java 1.8=8000, Spring Framework=10000, Hibernet=5000}, properties=null]
		
		Person p3 = context.getBean("p3", Person.class);
		System.out.println(p3); //Person [friends=[Sawan, Jackie, Ram], feeStructure={Java 1.8=8000, Spring Framework=10000, Hibernet=5000}, properties=null]

	}

}
