package com.ques9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/ques9/lifeCycleContext.xml");
	Person details=(Person)context.getBean("person");
	System.out.println(details);
	
	((AbstractApplicationContext) context).close();
}
}
