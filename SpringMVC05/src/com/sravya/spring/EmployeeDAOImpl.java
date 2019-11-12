package com.sravya.spring;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class EmployeeDAOImpl {
JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate=jdbcTemplate;
}
public int addEmp(Employee emp) {
	String sql="INSERT INTO itransform.employee (empId, empName, empDept, empDesignation, empSal) VALUES (?,?,?,?)";
return jdbcTemplate.update(sql,new Object[] {emp.getEmpId(),emp.getEmpName(),emp.getEmpdept(),emp.getEmpDesignation(),emp.getEmpSal()});
}
public Employee getEmpById(int empId) {
	String sql="SELECT * FROM itransform.employee where empId=?";
	return jdbcTemplate.queryForObject(sql, new Object[] {empId},new EmpRowMapper());
}
public List<Employee> getAllEmp(){
	String sql="SELECT * FROM itransform.employee";
	return jdbcTemplate.query(sql,new EmpRowMapper());
}
public void deleteEmp(int empId) {
	String sql="delete from itransform.employee where empId=11 ";
	jdbcTemplate.update(sql,new Object[] {empId});
}
public void updateEmp(Employee emp)
{
	String sql="update itransform.employee set empName=?,empdept=?, empDesignation=?,empSal=? where empId=?";
jdbcTemplate.update(sql,new Object[] {emp.getEmpName(),emp.getEmpdept(),emp.getEmpDesignation(),emp.getEmpSal(),emp.getEmpId()});			
}
}
