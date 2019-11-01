package com.sravya.springjdbc.springJdbc;

import java.sql.Date;
import java.time.LocalDate;

public class Employee {
private int employeeId;
private String employeeName;
private Date employeeHireDate;
private String employeeJobId;
private double employeeSalary;
private Department employeeDepartment;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Date getEmployeeHireDate() {
	return employeeHireDate;
}
public void setEmployeeHireDate(Date employeeHireDate) {
	this.employeeHireDate = employeeHireDate;
}
public String getEmployeeJobId() {
	return employeeJobId;
}
public void setEmployeeJobId(String employeeJobId) {
	this.employeeJobId = employeeJobId;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public Department getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(Department employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
}
