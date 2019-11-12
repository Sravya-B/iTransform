<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
</head>
<body>
<h1>All Employees</h1>
<table border="2">
<tr><th>empId</th>
<th>empName</th>
<th>empdept</th>
<th>empDesignation</th>
<th>empSal</th>
<th>edit</th>
<th>delete</th>
<c:forEach var="emp" items="${employeeList}">
<tr>
<td>${emp.empId}</td>
<td>${emp.empName}</td>
<td>${emp.empdept}</td>
<td>${emp.empDesignation}</td>
<td>${emp.empSal}</td>
<td><a href="editEmp/${emp.empId}">edit Emp</a></td>
<td><a href="deleteEmp/${emp.empId}">edit Emp</a></td>
</tr>
</c:forEach>
</table>
<br/>
<a href="addEmployee">Add New Employee </a>
</body>
</html>