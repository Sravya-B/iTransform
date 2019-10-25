package com.ques1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
		public static void main(String args[]) {
			//injection using Setter function
			
		//	ApplicationContext context=new ClassPathXmlApplicationContext("applicationCont.xml");
			//Customer cust=(Customer)context.getBean("custom");
			//cust.display();
			
			//injection using constructor 
			ApplicationContext cont=new ClassPathXmlApplicationContext("com/ques1/constructorCont.xml");
			Customer cust2=(Customer)cont.getBean("custom2");
			cust2.display();
		}
	}
	


