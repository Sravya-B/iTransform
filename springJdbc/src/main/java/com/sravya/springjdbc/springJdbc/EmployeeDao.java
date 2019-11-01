package com.sravya.springjdbc.springJdbc;

//import javax.sql.DataSource;

public interface EmployeeDao {
//public void setDataSource(DataSource dataSource);
public Employee findByEmployeeId(int employeeId); 
}
