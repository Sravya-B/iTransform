package com.sravya.springAOP02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("com/sravya/springAOP02/applicationContext.xml");
      Customer customer=(Customer)context.getBean("customerImpl");
      customer.customer();
      customer.customerReturn();
     // customer.customerException();
      customer.customerAround();
      
    }
}
