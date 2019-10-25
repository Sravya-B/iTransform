package com.ques2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext collection=new ClassPathXmlApplicationContext("com/ques2/collectionCont.xml");
		Question ques=(Question)collection.getBean("collectionBean");
		System.out.println("List: "+ques.getAnswers1());
		System.out.println("Set: "+ques.getAnswers2());
		System.out.println("Map: "+ques.getAnswers3());
	}

}
