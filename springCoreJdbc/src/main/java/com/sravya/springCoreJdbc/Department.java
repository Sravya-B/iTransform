package com.sravya.springCoreJdbc;

public class Department {
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentManagerId=" + departmentManagerId + "]";
	}
	int departmentId;
	String departmentName;
	int departmentManagerId;
	public Department(int departmentId, String departmentName, int departmentManagerId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentManagerId = departmentManagerId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getDepartmentManagerId() {
		return departmentManagerId;
	}
	public void setDepartmentManagerId(int departmentManagerId) {
		this.departmentManagerId = departmentManagerId;
	}
}
