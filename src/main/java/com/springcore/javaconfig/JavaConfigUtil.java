package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfigUtil {

	@Bean
	public Address getAddress() {
		return new Address();
	}
	/*
	 * When @Bean annotation class is used to create the object for Student class 
	 * then we don't need to used @ComponentScan annotation
	 */
	@Bean(name= {"student", "stud", "s1"})
	public Student getStudent() {
//		Student student = new Student(); 
		return new Student(getAddress()); //internally, it autowired the Address object to Student class.
	}
}
