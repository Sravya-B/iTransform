package com.ques6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
public static void main(String args[]) {
	ApplicationContext context=new AnnotationConfigApplicationContext(DbConfig.class);
	System.out.println(context.getBean("db",Db.class));
	
}
}
