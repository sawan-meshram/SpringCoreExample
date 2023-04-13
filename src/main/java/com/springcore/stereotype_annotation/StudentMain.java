package com.springcore.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * Scope as annotation
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype_annotation/stereotype_config.xml");
		
		//defined the bean name as Student class variable name, naming convention used here
//		Student s1 = context.getBean("student", Student.class); //component annotation without name
		
		//defined name at Component annotation
		Student s1 = context.getBean("stud1", Student.class); //when component annotation specify the name
		System.out.println(s1); //Student [id=101, name=Sawan, address=Nagpur, cities=[Nagpur, Mumbai, Pune]]
		
		//using Spring Expression Language (SpEL)
		System.out.println(s1.getCities()); //[Nagpur, Mumbai, Pune] 
		
		System.out.println(s1.getCities().getClass().getName()); //java.util.ArrayList

		System.out.println(s1.hashCode()); //hashcode=112466394
		
		
		Student s2 = context.getBean("stud1", Student.class);
		
		/*
		 * When two object of Student has return the same hashcode then class has "singleton scope"
		 * But, when we used Scope annotation with defined as "prototype" then each class object has given different hashcode.
		 */
		System.out.println(s2.hashCode()); //hashcode=112466394
	}

}
