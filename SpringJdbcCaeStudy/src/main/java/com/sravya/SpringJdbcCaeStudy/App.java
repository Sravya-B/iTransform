package com.sravya.SpringJdbcCaeStudy;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/sravya/SpringJdbcCaeStudy/springConfig.xml");
    	   PersonDAO personDAO=(PersonDAO) context.getBean("personDAO");
    	  personDAO.insert("Chris", "chris@gmail.com");
    	   System.out.println("Details of person inserted successfully");
    	   System.out.println("Details of all the people in the person table ");
    	   List<Person> selectAll=personDAO.selectALL();
    	   System.out.println(selectAll);
    	   personDAO.deletePerson("Chris");
    	   System.out.println("Person deleted successfully");
    	   List<Person> selectAllAfterDeletion=personDAO.selectALL();
    	   System.out.println(selectAllAfterDeletion);
    }
    
}
