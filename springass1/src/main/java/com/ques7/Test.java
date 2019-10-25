package com.ques7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/ques7/spELcontext.xml");
	Customer cust=(Customer)context.getBean("customerBean");
	System.out.println(cust);
}
}
