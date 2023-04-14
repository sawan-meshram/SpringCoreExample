package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		/*
		 * XML based configuration
		 */
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/java_config.xml");
//		
//		Student s1 = context.getBean("student", Student.class); //it will give error when @Component annotation removed
//		System.out.println(s1);
//		context.close();
		
		/*
		 * Annotation based configuration 
		 */
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfigUtil.class);
		
		/*
		 * Using @Component annotation on Student class.
		 */
//		Student s2 = con.getBean("student", Student.class); //it will give error when @Component annotation removed and called from JavaConfigUtil class
//		System.out.println(s2);
//		s2.helloStudent();
		
		/*
		 * using @Bean annotation on JavaConfigUtil class
		 */
		//If there is no name list to declared on @Bean annotation, then used function name to get bean of Student class.
		//Otherwise, name list is given then it will throw a error. To get bean, used either given name from @Bean annotation
//		Student s3 = con.getBean("getStudent", Student.class); 
//		System.out.println(s3);
//		s3.helloStudent();
		
		/*
		 * Creating student object from bean names specified on @Bean annotation on JavaConfigUtil class 
		 */
		Student s4 = con.getBean("student", Student.class); 
		System.out.println(s4);
		s4.helloStudent();
		System.out.println("=================================");
		
		Student s5 = con.getBean("stud", Student.class); 
		System.out.println(s5);
		s5.helloStudent();
		System.out.println("=================================");
		
		Student s6 = con.getBean("s1", Student.class); 
		System.out.println(s6);
		s6.helloStudent();
	}

}
