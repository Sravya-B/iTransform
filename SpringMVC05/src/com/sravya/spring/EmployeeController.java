package com.sravya.spring;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class EmployeeController {

	@Autowired
	private EmployeeDAOImpl employeeDAOImpl;
	
	@RequestMapping(value="/views/employees")
	public String listEmployees(Model model)
	{
		
		List employeeList= (List) employeeDAOImpl.getAllEmp();
		model.addAttribute("employeeList",employeeList);
		return "employees";
	}
	@RequestMapping(value="/views/deleteEmp/{empId}")
	public String delEmp(@PathVariable int empId)
	{
		employeeDAOImpl.deleteEmp(empId);
		return "redirect:/employees";
	}
	@RequestMapping(value="/views/editEmp/{empId}")
	public String editEmp(@PathVariable int empId, Model model)
	{
		Employee emp=employeeDAOImpl.getEmpById(empId);
		model.addAttribute("command",emp);
		return "empEditForm";
	}
	@RequestMapping(value="/views/saveTheEdit")
	public String saveTheEdit(@ModelAttribute("emp") Employee emp) {
		employeeDAOImpl.updateEmp(emp);
		return "redirect:/employees";
	}
	@RequestMapping(value="/views/addEmp")
	public String addEmp(@ModelAttribute("emp") Employee emp) {
		employeeDAOImpl.addEmp(emp);
		return "redirect:/addEmployee";
	}
	@RequestMapping(value="/views/saveEmployee")
	public String saveEmployee(Model model) {
		model.addAttribute("command",new Employee());
		return "redirect:/employees";
		
	}
}
