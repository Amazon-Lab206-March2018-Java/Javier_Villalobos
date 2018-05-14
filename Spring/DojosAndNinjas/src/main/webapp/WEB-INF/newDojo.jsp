<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style> <%@include file="skeleton.css"%></style>
    <style> <%@include file="styles.css"%></style> 
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
	
	
	<h1>New Dojo: </h1>
	<form:form action="/dojos/new" modelAttribute="dojo" method="POST">
	
	<form:errors path="name"/>
	<form:label path="name"> Name
	<form:input type="text" path="name"/></form:label>
	
	<input type="submit" value="Create"/>
	
	</form:form>
	
	<a href="/ninjas/new">New Ninja</a>
</body>
</html>