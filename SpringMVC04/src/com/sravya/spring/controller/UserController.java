package com.sravya.spring.controller;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	private DataSource dataSource;
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);    
    
	public void setTemplate(JdbcTemplate jdbcTemplate) {    
	    this.jdbcTemplate = jdbcTemplate;    
	} 
	
	@RequestMapping("/views/register")
	@ResponseBody
	 public String register(@ModelAttribute("user") User user)
	    {
		
		 if(jdbcTemplate.update("insert into springmvc.registration (uname,pwd,email) values(?,?,?)", new Object[] {user.getUname(),user.getPwd(),user.getEmail()})==1)
		 { System.out.println("hey");
			 return "login";}
		 else 
		 return "<h1>Registration Failed<h1>";
	    }
		
	}

