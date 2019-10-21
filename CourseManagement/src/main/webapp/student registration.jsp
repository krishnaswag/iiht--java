<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body bgcolor="salmon">
<form:form action ="studentRegistration" method="post" modelAttribute="student">
<form:input path="studentId" type="text"/>
<form:input path="studentName" type="text"/>
<form:input path="email" type="text"/>
<form:input path="mobile" type="text"/>
<form:input path="password" type="password"/>
<input type="submit" value="registraion">


</form:form>

</body>
</html>