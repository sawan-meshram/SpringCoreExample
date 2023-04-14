package com.springcore.expression_lang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class OperationMain {

	public static void main(String[] args) {

		/*
		 * SpEL mostly used on @Value annotation
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/expression_lang/exp_lang_config.xml");
		Operation op = context.getBean("operation", Operation.class); //lowerCamerlCase for Operation class
		System.out.println(op); //Operation [x=22, y=2]

	
		/*
		 * Alternate ways to used Spring Expression Language
		 */
		SpelExpressionParser exp = new SpelExpressionParser();
		Expression e1 = exp.parseExpression("12+12"); //don't need to add '#{}' expression on function parameter, directly gives expression
		System.out.println(e1.getValue()); //24
	}

}
