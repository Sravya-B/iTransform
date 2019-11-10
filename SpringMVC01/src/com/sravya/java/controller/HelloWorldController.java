package com.sravya.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloWorldController {
//@RequestMapping(value="/index", method= RequestMethod.GET)

	//public String hello() {
	//	return "index";
	//}
@RequestMapping(value="/views/helloWorld")
public String helloWorld() {

	return "helloWorld";
}
}