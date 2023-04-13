package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KachoriMain {

	public static void main(String[] args) {
		
		/*
		 * Using XML Spring Life cycle.
		 * Also, there are other ways to achieve life cycle using interface and annnotation
		 */

		//Used this context class to call destroy method
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle_config.xml");
		//registering shut down
		context.registerShutdownHook(); 

		Kachori k1 = context.getBean("kachori", Kachori.class);
		System.out.println(k1);

		/*
		 * Using Interface spring life cycle
		 */
		System.out.println("-------------- Other menu -----------------");
		
		Sprite s1 = context.getBean("sprite", Sprite.class);
		System.out.println(s1);
		
		System.out.println("-------------- after eating -----------------");
		MilkCoffee m1 = context.getBean("c1", MilkCoffee.class);
		System.out.println(m1);
	}

}
