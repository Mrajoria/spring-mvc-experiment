<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
		FirstName: <form:input path="firstName"/>
		<br>
		LastName: <form:input path="lastName"/>
		
		<input type="submit" value="submit">
	</form:form>




</body>




</html>