package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor_injection/ci_config.xml");
		Person p1 = context.getBean("p1", Person.class);
		System.out.println(p1);

		//Order of constructor args are changed and used c schema tag
		Person p2 = context.getBean("p2", Person.class);
		System.out.println(p2);

		//c schema tag
		Person p3 = context.getBean("p3", Person.class);
		System.out.println(p3);
		
		//declare list collection
		Person p4 = context.getBean("p4", Person.class);
		System.out.println(p4);
		
		Addition add1 = context.getBean("add_int", Addition.class);
		add1.printSum();
		
		Addition add2 = context.getBean("add_double", Addition.class);
		add2.printSum();
		
		Addition add3 = context.getBean("add_1", Addition.class);
		add3.printSum();
	}

}
