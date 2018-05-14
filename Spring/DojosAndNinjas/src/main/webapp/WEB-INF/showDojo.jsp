<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style> <%@include file="skeleton.css"%></style>
    <style> <%@include file="styles.css"%></style> 
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
	
	
	<h1> <c:out value="${ ninjas.name}"/> </h1>
	
	<table>
		<thead>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Age</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="ninja" items="${ ninjas.ninjas }" >
			<tr>
				<td>${ninja.firstName}</td>
				<td>${ninja.lastName}</td>
				<td>${ninja.age}</td>
			</tr>
		</c:forEach>
		
		</tbody>
	
	</table>

	
	<a href="/dojos/new">New Dojo</a>
</body>
</html>