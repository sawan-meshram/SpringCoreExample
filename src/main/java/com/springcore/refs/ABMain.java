package com.springcore.refs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ABMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/refs/refs_config.xml");
		
		//Using property and value tag
		A a1 = context.getBean("a1", A.class);
		System.out.println(a1);
		System.out.println(a1.getB().getY());
		
		//Using p schema tag
		A a2 = context.getBean("a2", A.class);
		System.out.println(a2);
	}

}
