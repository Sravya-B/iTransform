package com.sravya.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleInterestController {
	
@RequestMapping(value="/views/calculate")
public String calculateSimpleInterest(@RequestParam("principal") double p,@RequestParam("time") double t,@RequestParam("rate")double r,Model m) {
	System.out.println("hey you!");
	double SI=(p*t*r)/100;
	m.addAttribute("calc",SI);
	
	return "calculation";
}
}
