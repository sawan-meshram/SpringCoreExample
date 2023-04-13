package com.springcore.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/xml/autowire_config.xml");
		/*
		 * autowire using XML
		 */
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);
	}

}
