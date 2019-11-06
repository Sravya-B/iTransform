package com.sravya.springAOP;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/sravya/springAOP/applicationContext.xml");
    	   BankAccountServiceImpl bankAccount=(BankAccountServiceImpl) context.getBean("bankAccount");
    	  // System.out.println(bankAccount.getBalance(1001));
    bankAccount.withdraw(1001, 20);
    bankAccount.deposit(1001, 2000);
    }
}
