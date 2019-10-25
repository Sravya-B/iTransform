package com.ques10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String args[]) {
	AbstractApplicationContext  context = new ClassPathXmlApplicationContext("com/ques10/applicationContext.xml");
	ApplicationAware appcontext= (ApplicationAware)context.getBean("appcont");
	ApplicationContext appCon =appcontext.getContext();
	Task job= (Task)appCon.getBean("task");
	job.doTask();
	//context.registerShutdownHook();
	
}
}
