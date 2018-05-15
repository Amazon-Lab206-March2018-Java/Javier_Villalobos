<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style> <%@include file="skeleton.css"%></style>
    <style> <%@include file="styles.css"%></style> 
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Question</title>
</head>
<body>
	<h1>What is your question?</h1>
	<form:form action="/questions/new" method="POST" modelAttribute="q">
		
		<form:label path="question">Question: </form:label>
		<form:textarea path="question"/>
		<br>
		<form:errors path="question"/>
		
		
		<form:label path="tags"> Tags: </form:label>
		<input type="text" name="tags">
		<br>
		<form:errors path="tags" />
		<br>
		
		<input type="submit" value="Submit">

	</form:form>
	<a href="/">Dashboard</a>
</body>
</html>
