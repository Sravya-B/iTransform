package com.sravya.springCoreJdbc;

import java.sql.Date;
import java.util.List;



public class Employee {
	private int employeeId;
	private String employeeName;
	private Date employeeHireDate;
	private String employeeJobId;
	private double employeeSalary;
	private int employeeDepartment;
	public Employee(int employeeId, String employeeName, Date employeeHireDate, String employeeJobId,
			double employeeSalary,int department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeHireDate = employeeHireDate;
		this.employeeJobId = employeeJobId;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeHireDate="
				+ employeeHireDate + ", employeeJobId=" + employeeJobId + ", employeeSalary=" + employeeSalary
				+ ", employeeDepartment=" + employeeDepartment + "]";
	}

	public Employee() {
		
	}
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
	public int getEmployeeDepartment() {
	return employeeDepartment;
	}
	public void setEmployeeDepartment(int employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
}
