Learned Notes
=============

### @Autowired

* When we used association relation and don't want to declare an object reference as bean on **`xml`**, then we used this annotation.
* This annotation will auto check the bean which declared in xml file and inject to reference object.

***Autowired*** can be done using ***byType, byName, and constructor***

And declare **```<context:annotation-config />```** on config **`xml`** to enable annotation while using XML.

*Example :* 1]
```
//when we add annotation on the Address type, then it autowired as byType
public class Employee {
	@Autowired
	private Address address; 
}
```
*Example :* 2]
```
//when we add annotation on the parametrized constructor, then it autowired as constructor
public class Employee {
	private Address address;
	
	@Autowired
	public Employee(Address address) {  
		this.address = address;
	}
}
```
*Example :* 3]
```
//when we add annotation on the setAddress method, then it autowired as byName
public class Employee {
	private Address address;

	@Autowired
	public void setAddress(Address address) {  
		this.address = address;
	}
}
```

Example **xml** config

```
<bean class="com.springcore.autowire.annotation.Address" name="address">
	<property name="street" value="Wadi, Amravati road" />
	<property name="city" value="Nagpur" />
	<property name="state" value="MH" />
	<property name="zip" value="440023" />
</bean>

<bean class="com.springcore.autowire.annotation.Employee" name="emp1" />
```


### @Qualifier

* When we are using ***@Autowired*** annotation to get bean object and there are more than one bean declared on xml for class then used this annotation to which get bean using **name** or **id**.

* Declare **```<context:annotation-config />```** to enable annotation while using XML

*Example :*
```
public class Employee {
	@Autowired
	@Qualifier("address2") //when there are more that one Address bean specify on XML config then used the annotation, 
	//used address1 or address2 to see changes
	private Address address; //when we add autowire on the Address type, then it autowire as byType

}
```

Example **xml** config
```
<bean class="com.springcore.autowire.annotation.Address" name="address1">
	<property name="street" value="Wadi, Amravati road" />
	<property name="city" value="Nagpur" />
	<property name="state" value="MH" />
	<property name="zip" value="440023" />
</bean>

<!-- if qualifier annotation not declared with @Autowired, then it will create ambiguity -->
<!-- to overcome, we used @Qualifier with specify bean name -->
<bean class="com.springcore.autowire.annotation.Address" name="address2">
	<property name="street" value="Dabha, Amravati road" />
	<property name="city" value="Nagpur" />
	<property name="state" value="MH" />
	<property name="zip" value="440023" />
</bean>
```

### @Component

* When we don't want to declare bean on xml file then used this annotation
* If name is not specified on annotation then to get object from IoC container, we need to used Class name as **lowerCamelCase** to get bean.
* If name is defined on annotation then we must used this name to get bean object form IoC container

* And declare **```<context:component-scan base-package="" />```** to enable this annotation while using XML.

*Example :* 1] 
```
@Component
class Student{

}
```
*Example :* 2]
```
@Component("stud1")
public class Student {

}
```

### @Value

* When we used ***@Component*** annotation and its member are not declared, then used this annotation. 
* Default, it shows default values of each member with respective type.

*Example :*
```
@Component("stud1")
public class Student {
	@Value("101")
	private int id;
}
```

* We can fetch standalone any collection from config xml file using this annotation. Here, **```#{id_name}```** is ***spring expression language (SpEL)***.
* We can used **SpEL** on ***@Value*** annotation.

*Example :*
```
@Component("stud1")
public class Student {
	@Value("101")
	private int id;

	@Value("#{city_1}") //used SpEL
	private List<String> cities; //used standalone list collection on config xml
}
```

Example **xml** config
```
<!-- standalone list collection -->
<!-- fetching using @Value annotation using spring expression languag SpEL -->
<util:list list-class="java.util.ArrayList" id="city_1">
	<value>Nagpur</value>
	<value>Mumbai</value>
	<value>Pune</value>
</util:list>
```

### @Scope
* This annotation is defined the configure bean scope.
* If this annotation is not defined then default the bean scope is **singleton**.
* There are few Bean scope as follows
	 * Singleton
	 * prototype
	 * request
	 * session
	 * globalsession

* If there are more than bean object created for a class and declared ***@Scope*** annotation or not, then by default bean scope will be **singleton**
* We can verify it by printing the object hashcode, it will gives a same hashcode for each object. Its indicate that the bean giving the same object for each reference instance.
* And declared ***@Scope*** annotation as **prototype**, then whenever creating bean object, it will gives the different object to reference instance.
* We can verify it by printing the object hashcode, it will gives the different hashcode for each object.

*Examples:*
1] 
```
@Component
@Scope
class Student{
}
```
```
2]
@Component
@Scope("prototype")
class Student{
}
```

Alternate **xml** version of this annotation is 
```
<bean class="" name="" scope="" />
```

Example for xml config

```
<!-- used scope on xml instead of annotation on class -->
<!-- if scope is removed from below bean tag, then by default bean scope will be singleton -->
<bean class="com.springcore.stereotype_annotation.Employee" name="emp1" p:name="Sawan" scope="prototype" /> <!-- scope="prototype" -->
```

### SpEL (Spring Expression Language)

* How to invoke static method and variable?

*Syntax :*
```
T(class).method(pararm)

T(class).variable
```

* How to create object?

*Syntax :*
```
new Object(value)
```

*Example :*
```
@Value("#{10+12}") //expressing using SpEL
private int x;

@Value("#{1>2? 1: 2}") //conditional expression using SpEL
private int y;

@Value("#{ T(java.lang.Math).sqrt(64) }") //static method called using SpEL
private int z;

@Value("#{ T(Math).PI }") //static variable called sing SpEL
private double pi;

@Value("#{ new java.lang.String('Sawan')}") //creating a object of class using SpEL
private String name;

@Value("#{28>18}") //boolean expression using SpEL or set value to true
private boolean isAdult;
```

### @Configuration
* When we dont want to used XML configuration and instead config using java, then used this annotation to the class.

*Example*
```
@Configuration
public class JavaConfigUtil {
}
```
and on main class
```
ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfigUtil.class);
```
		
### @ComponentScan
* When we are doing config using java and used ***@Component*** annotation on entity class, to get dependency injection to object into container we need to used this annotation.


*Example :* Using java configuration
```
package com.springcore.javaconfig;

@Configuration
@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfigUtil {

}
```
And entity class
```
package com.springcore.javaconfig;
@Component
public class Student {

}
```

### @Bean
* When we don't want to declare ***@Component*** annotation to entity class and trying to get dependency injection to object into container, we need to used this annotation.

*Example:*
```
@Configuration
@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfigUtil {

	@Bean
	public Address getAddress() {
		return new Address();
	}
}
```

If ***@Bean*** annotation does not declare name then used function name to get bean of entity.

```Address a1 = con.getBean("getAddress", Address.class);```

If ***@Bean*** annotation does declare names then used bean names to get bean of entity.
```
@Configuration
@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfigUtil {

	@Bean
	public Address getAddress() {
		return new Address();
	}

	@Bean(name= {"student", "stud", "s1"})
	public Student getStudent() {
		return new Student(getAddress()); //internally, it autowired the Address object to Student class.
	}
}

Student s4 = con.getBean("student", Student.class); 
Student s5 = con.getBean("stud", Student.class); 
Student s6 = con.getBean("s1", Student.class); 
```

***Notes:-***
Here, When ***@Bean*** annotation declared to get the bean object then we dont have to used ***@ComponentScan*** annotation. Automatically, ***@Bean*** annotation will gets its base package.

So, we can comment or removed the annotation below
```
@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig") //removed or comment this
public class JavaConfigUtil {
}
```
