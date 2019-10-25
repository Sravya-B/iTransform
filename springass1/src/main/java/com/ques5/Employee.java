package com.ques5;
import javax.annotation.Resource;
import javax.inject.Inject;

public class Employee {
@Inject
	Company emp;
@Resource(name="location")
private Address address;
@Resource()
private  Company company;
public Address getAddress() {
	System.out.println("Location of the company is "+address);
	return address;
}

public Company getCompany() {
	System.out.println("Name of the company is "+company);
	return company;
}
public void empDesignation() {
	emp.designation();
}
}
