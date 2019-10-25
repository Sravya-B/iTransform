package com.ques3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ques2.Question;

public class Test {
public static void main(String args[]) {
	//ApplicationContext acc=new ClassPathXmlApplicationContext("com/ques3/bankContext.xml");
	//BankAccountController bank=(BankAccountController)acc.getBean("accountId");
	//bank.getBalance(12345);
	BankAccount b=new BankAccount();
	b.setAccountBalance(123456);
	b.getAccountBalance();
	b.setAccountId(123);
	b.getAccountId();
	BankAccountServiceImpl bank=new BankAccountServiceImpl();
	bank.deposit(123, 2134);
}
}
