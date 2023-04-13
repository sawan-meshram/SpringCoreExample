package com.springcore.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype_annotation/stereotype_config.xml");
		
		//defined the bean name as Student class variable name, naming convention used here
//		Student s1 = context.getBean("student", Student.class); //component annotation without name
		
		//defined name at Component annotation
		Student s1 = context.getBean("stud1", Student.class); //when component annotation specify the name
		System.out.println(s1); //Student [id=101, name=Sawan, address=Nagpur, cities=[Nagpur, Mumbai, Pune]]
		
		//using Spring Expression Language (SpEL)
		System.out.println(s1.getCities()); //[Nagpur, Mumbai, Pune] 
		
		System.out.println(s1.getCities().getClass().getName()); //java.util.ArrayList

	}

}
