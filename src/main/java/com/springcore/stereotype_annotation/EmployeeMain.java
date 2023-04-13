package com.springcore.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		/*
		 * Scope on xml
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype_annotation/stereotype_config.xml");
		
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1); //Employee [name=Sawan]
		System.out.println(e1.hashCode()); //1295226194
		
		
		Employee e2 = context.getBean("emp1", Employee.class);
		System.out.println(e2); //Employee [name=Sawan]
		System.out.println(e2.hashCode()); //252651381
	}

}
