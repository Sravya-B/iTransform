package com.sravya.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

@RequestMapping(value="/views/logIn")	
public String validUser(@ModelAttribute("user") User user) {
	if((user.getUname()).equals("user") && ((user.getPwd()).equals("root"))) {
	return "success";
}
	else {
		return "error";
		}
}
}
