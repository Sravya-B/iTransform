package com.sravya.springjdbc.springJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class EmployeeDaoImpl implements EmployeeDao {
private DataSource dataSource;

public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}
//public Employee getByDepartmentId(int departmentId) {
	//String query="SELECT * FROM world.employee JOIN world.department ON world.employee.EmployeeDepartment=world.department.departmentName where world.department.departmentId=?";
	//return 0;
//}
public Employee findByEmployeeId(int employeeId) {
	String query="SELECT * FROM world.employee where EmployeeId=?";
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	Employee emp=jdbcTemplate.queryForObject(query, new Object[] {employeeId},new RowMapper<Employee>() {
		public Employee mapRow(ResultSet rs,int rownum) throws SQLException{
			Employee emp=new Employee();
			emp.setEmployeeId(rs.getInt("id"));
		      emp.setEmployeeName(rs.getString("name"));
		      emp.setEmployeeHireDate(rs.getDate("date"));
		      emp.setEmployeeJobId(rs.getString("jobId"));
		      emp.setEmployeeSalary(rs.getDouble("salary"));
		      return emp;
		}
	});
	return emp;
}
}
