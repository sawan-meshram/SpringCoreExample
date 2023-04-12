package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //Using all values declared in xml 
        Student s1 = (Student)context.getBean("student1");
        System.out.println(s1);
        
        //Inline property declare
        Student s2 = context.getBean("student2", Student.class);
        System.out.println(s2);
        
        //Using p schema on bean tag
        Student s3 = context.getBean("student3", Student.class);
        System.out.println(s3);
        
        //Using Id property on bean tag
        Student s4 = context.getBean("student4", Student.class);
        System.out.println(s4);
    }
}
