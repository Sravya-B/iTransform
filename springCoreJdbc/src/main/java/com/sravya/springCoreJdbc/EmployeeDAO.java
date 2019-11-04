package com.sravya.springCoreJdbc;
import java.util.List;
import java.util.Map;

import com.sravya.springCoreJdbc.Employee;
public interface EmployeeDAO {
	
public List<Employee> employeeByDeptId(int deptId);

public Employee employeeByEmpId(int empId);

public List<Map<String, Object>> findByEmpSalary();

public List<Map<String, Object>> empMaxSalary(int deptId);

public List<Employee> orderByDeptId();

public List<Map<String, Object>> employeeByManagerId();

public List<Map<String,Object>> employeeWithDeptName();

//public void insert(Employee employee);

}
