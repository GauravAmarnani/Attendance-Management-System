<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page!</title>
</head>
<body>
	<h1>Sorry for the inconvenience.</h1>
	<form:form modelAttribute="message">
		<h1>Title: ${message.title}</h1>
		<h2>Description: ${message.description}</h2>
	</form:form>	
	<a href="#">Complain about this issue to us.</a>
</body>
</html>