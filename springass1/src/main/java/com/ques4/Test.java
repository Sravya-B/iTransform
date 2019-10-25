package com.ques4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ques4.BankAccountServiceImpl;
public class Test {
public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/ques4/bankAccountContext.xml");
	//BankAccountServiceImpl bankService=(BankAccountServiceImpl) context.getBean(BankAccountServiceImpl.class);
BankAccountController controller=(BankAccountController)context.getBean("bankController");
System.out.println(controller.deposit(1, 23456));
}
}
