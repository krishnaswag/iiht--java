<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentLogin</title>
</head>
<body bgcolor="salmon">
<form:form action="login" method="post" modelAttribute="student">
<form:input path="userName" type="text"/>
<form:input path="password" type="text"/>
<input type = "submit" value = "login">
<a href="studentregistration">register</a></form:form>
</body>
</html>