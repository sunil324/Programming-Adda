<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Form</title>

<h3>railway Reservation Form</h3>
</head>
<body>
<form:form action="submitForm" modelAttribute="reservation">
FirstName:<form:input path="firstName" />
<br><br>
LastName:<form:input path="lastName" />
<br><br>
<input type="submit" value="submit" />
</form:form>
</body>
</html>