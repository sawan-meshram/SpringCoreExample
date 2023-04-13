package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collection_config.xml");
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1.getName());
		System.out.println(e1.getAddress());
		System.out.println(e1.getPhones());
		System.out.println(e1.getCourses());
		System.out.println(e1.getProps());
		System.out.println(e1.getPhones().getClass().getName());

				

	}

}
