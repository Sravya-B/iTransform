package com.ques8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/ques8/beanContext.xml");
	Customer cust=(Customer)context.getBean("customer");
	
System.out.println(cust);


Book read=(Book)context.getBean("book");
System.out.println(read);
((AbstractApplicationContext) context).close();
}
}
