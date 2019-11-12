<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit Employee</title>
</head>
<body>
<h1>Edit Employee</h1>  
       <form:form  action="saveTheEdit">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="empId" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="empName"  /></td>  
         </tr> 
         <tr>  
           <td>emp Dept : </td>   
          <td><form:input path="empdept"  /></td>  
         </tr>  
         <tr>    
          <td>emp Designation :</td>    
          <td><form:input path="empDesignation" /></td>  
         </tr>   
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="empSal" /></td>  
         </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>