<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page.</title>
</head>
<body>
	<h1>Hello, Unregistered User!</h1>
	<form:form action="#" method="GET" modelAttribute="path">
		<form:button value="/viewAttendance">View Attendance</form:button>
		<br/> <br/>
		<a href="${path}/login">Login</a>
	</form:form>
</body>
</html>