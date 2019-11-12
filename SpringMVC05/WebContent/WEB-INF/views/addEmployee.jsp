<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add Employee</title>
</head>
<body>
     <h1>Add New Employee</h1>  
       <form:form method="post" action="saveEmployee">    
        <table >    
         <tr>    
          <td>Emp Id : </td>   
          <td><form:input path="empId"  /></td>  
         </tr>    
         <tr>    
          <td>Emp Name :</td>    
          <td><form:input path="empName" /></td>  
         </tr>
         <tr>    
          <td>Emp dept :</td>    
          <td><form:input path="empdept" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="empDesignation" /></td>  
         </tr> 
         <tr>    
          <td>Emp Salary :</td>    
          <td><form:input path="empSal" /></td>  
         </tr>  
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save Employee" /></td>    
         </tr>    
        </table>    
       </form:form>    

</body>
</html>