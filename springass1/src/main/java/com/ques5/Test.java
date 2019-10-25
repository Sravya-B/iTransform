package com.ques5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/ques5/employeeContext.xml");
	Employee emp=(Employee)context.getBean(Employee.class);
	emp.getAddress().getLocation();
	emp.getCompany().getCompanyName();
emp.empDesignation();
}

}
