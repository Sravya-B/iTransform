package com.sravya.springjdbc.springJdbc;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sravya.springjdbc.springJdbc.EmployeeDao;
import com.sravya.springjdbc.springJdbc.Employee;
public class EmployeeTest {

public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/sravya/springjdbc/springJdbc/dataSource.xml");
	
	EmployeeDao employeeDao=(EmployeeDao)context.getBean("employeeDao");
	int id=new Random().nextInt(6);

	Employee emp=employeeDao.findByEmployeeId(id);
	System.out.println(emp);
	
}
}
