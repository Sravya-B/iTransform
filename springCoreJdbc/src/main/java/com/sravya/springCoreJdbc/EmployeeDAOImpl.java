package com.sravya.springCoreJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.RowMapper;
public class EmployeeDAOImpl implements EmployeeDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	 public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }
	//  ques01
	 
	  @SuppressWarnings("unchecked")
		public List<Employee> employeeByDeptId(int deptId) {
			  String sql="SELECT * FROM WORLD.EMPLOYEE WHERE EMPLOYEEDEPARTMENT=?";
			  jdbcTemplate=new JdbcTemplate(dataSource);
			  List<Employee> employee=(List<Employee>)jdbcTemplate.query(sql,new Object[] { deptId },new EmployeeRowMapper());
			  return employee;
		  }
	  //ques02
	  
	  @SuppressWarnings({ "unchecked" })
	    public Employee employeeByEmpId(int empId){
	          
	        String sql = "SELECT * FROM WORLD.EMPLOYEE WHERE EMPLOYEEID=?";
	 
	        jdbcTemplate = new JdbcTemplate(dataSource);
	        Employee employee = (Employee) jdbcTemplate.queryForObject(
	                sql, new Object[] { empId }, new EmployeeRowMapper());
	      
	        return employee;
	    }
	  //ques03
	  
	  public List<Map<String, Object>> findByEmpSalary(){
			String sql="SELECT EMPLOYEENAME,EMPLOYEEJOBID,EMPLOYEESALARY,DEPARTMENTNAME FROM WORLD.EMPLOYEE JOIN WORLD.DEPARTMENT ON EMPLOYEE.EMPLOYEEDEPARTMENT=DEPARTMENT.DEPARTMENTID WHERE (EMPLOYEESALARY BETWEEN 5000 AND 13000) AND (DEPARTMENTNAME='STOCK CLERK' OR DEPARTMENTNAME='SALES REPRESENTATIVE')";
			  jdbcTemplate=new JdbcTemplate(dataSource);
			  return jdbcTemplate.queryForList(sql);
		  }
	  //ques04
	  
	  public List<Map<String, Object>> empMaxSalary(int deptId) {
		  String sql="select EmployeeName,EmployeeSalary from world.employee where EmployeeSalary=(select MAX(EmployeeSalary) from world.employee where EmployeeDepartment=?)";
			  jdbcTemplate=new JdbcTemplate(dataSource);
			  return jdbcTemplate.queryForList(sql,new Object[] {deptId }); 
	  }
	  //ques05
	  
		public List<Employee> orderByDeptId(){
			String sql="SELECT * FROM WORLD.EMPLOYEE ORDER BY EMPLOYEEDEPARTMENT ASC";
			jdbcTemplate=new JdbcTemplate(dataSource);
			List<Employee> employee=(List<Employee>)jdbcTemplate.query(sql,new EmployeeRowMapper());
			  return employee;
		}
		//ques06
		
		public List<Map<String, Object>> employeeByManagerId(){
			 String sql="SELECT EmployeeId,EmployeeName,departmentManagerId,EmployeeDepartment from world.employee,world.department where employee.EmployeeDepartment=department.departmentId";
			  jdbcTemplate=new JdbcTemplate(dataSource); 
				  return jdbcTemplate.queryForList(sql);
		}
		//ques07
		
		 public List<Map<String,Object>> employeeWithDeptName(){
			 String sql="SELECT EmployeeId,EmployeeName,EmployeeSalary,departmentId,departmentName from world.employee,world.department where employee.EmployeeDepartment=department.departmentId";
		 jdbcTemplate=new JdbcTemplate(dataSource);
		 return jdbcTemplate.queryForList(sql);
		 }
		 
		 //Inserting into table
		 
	/*
	 * public void insert(Employee employee){
	 * 
	 * String sql = "INSERT INTO WORLD.EMPLOYEE " +
	 * "(EMPLOYEEID, EMPLOYEENAME, EMPLOYEEHIREDATE, EMPLOYEEJOBID, EMPLOYEESALARY,EMPLOYEEDEPARTMENT) VALUES (?, ?, ?, ?, ?,?)"
	 * ;
	 * 
	 * jdbcTemplate = new JdbcTemplate(dataSource);
	 * 
	 * jdbcTemplate.update(sql, new Object[] { employee.getEmployeeId(),
	 * employee.getEmployeeName(), employee.getEmployeeHireDate(),
	 * employee.getEmployeeJobId(), employee.getEmployeeSalary(),
	 * employee.getEmployeeDepartment() }); }
	 */	
}
