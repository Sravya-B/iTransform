package com.sravya.springCoreJdbc;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/sravya/springCoreJdbc/applicationContext.xml");
   EmployeeDAO employeeDAO=(EmployeeDAO) context.getBean("employeeDAO");
 
   List<Employee> emp1=employeeDAO.employeeByDeptId(121);
   System.out.println("Details of all the Employees with the entered Department id ");
   System.out.println(emp1);
   Employee emp2=employeeDAO.employeeByEmpId(1);
   System.out.println("Details of an Employee with the entered employee id ");
   System.out.println(emp2);
   List<Map<String, Object>> emp3=employeeDAO.findByEmpSalary();
   System.out.println("Employees with salary between 5000 and 13000 and departname as 'stock clerk' or 'sales representative' are");
   System.out.println(emp3);
   List<Map<String, Object>> emp4=employeeDAO.empMaxSalary(121);
   System.out.println("Employee with the max salary of the given Department id is");
   System.out.println(emp4);
   List<Employee> emp5=employeeDAO.orderByDeptId();
   System.out.println("Display employees of given dept Id in ascending order of department Id");
   System.out.println(emp5);
   List<Map<String, Object>> emp6=employeeDAO.employeeByManagerId();
   System.out.println("Displaying employees along with their manager id");
   System.out.println(emp6);
   List<Map<String, Object>> emp7=employeeDAO.employeeWithDeptName();
   System.out.println("Employee details along with their department name");
   System.out.println(emp7);
  
/*Employee emp = new Employee(179, "Bell",1997-01-11,"12342",13213);
  employeeDAO.insert(emp);*/
   context.close();
    }
}
