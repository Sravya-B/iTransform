package com.sravya.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Employee employee = new Employee();
	       
	        employee.setEmpId(rs.getInt("empId"));
	        employee.setEmpName(rs.getString("empName"));
	        employee.setEmpdept(rs.getString("empdept"));
	        employee.setEmpDesignation(rs.getString("empDesignation"));
	        employee.setEmpSal(rs.getDouble("empSal"));
	  
	             return employee;
	    }

}
