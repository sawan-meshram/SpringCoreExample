package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowire_config.xml");
		/*
		 * autowire using Annotation
		 */
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);
	}

}
