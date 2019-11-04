package com.sravya.springCoreJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
@SuppressWarnings("rawtypes")
public class EmployeeRowMapper implements RowMapper<Employee>{
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
       
        employee.setEmployeeId(rs.getInt("EMPLOYEEID"));
        employee.setEmployeeName(rs.getString("EMPLOYEENAME"));
        employee.setEmployeeHireDate(rs.getDate("EMPLOYEEHIREDATE"));
        employee.setEmployeeJobId(rs.getString("EMPLOYEEJOBID"));
        employee.setEmployeeSalary(rs.getDouble("EMPLOYEESALARY"));
       employee.setEmployeeDepartment(rs.getInt("EMPLOYEEDEPARTMENT"));
             return employee;
    }
	
}
class DepartmentRowMapper implements RowMapper<Department>{

	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department department=new Department();
		   department.setDepartmentId(rs.getInt("DEPARTMENTID"));
        department.setDepartmentName(rs.getString("DEPARTMENTNAME"));
        department.setDepartmentManagerId(rs.getInt("DEPARTMENTMANAGERID"));

		return department;
	}}