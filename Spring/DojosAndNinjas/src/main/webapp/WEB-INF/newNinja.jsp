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
	
	
	<h1>New Ninja: </h1>
	<form:form action="/ninjas/new" modelAttribute="ninja" method="POST">
	
	<form:select path="dojo">
		<c:forEach var ="dojo" items="${dojos }">
			<option value="${ dojo.id }"> <c:out value="${ dojo.name }"/> </option>
		</c:forEach>
	</form:select>
	
	<form:errors path="firstName"/>
	<form:label path="firstName"> First Name
	<form:input type="text" path="firstName"/></form:label>
	
	<form:errors path="lastName"/>
	<form:label path="lastName"> Last Name
	<form:input type="text" path="lastName"/></form:label>
	
	<form:errors path="age"/>
	<form:label path="age"> Age
	<form:input type="text" path="age"/></form:label>
	
	<input type="submit" value="Create"/>
	
	</form:form>
	
	<a href="/dojos/new">New Dojo</a>
</body>
</html>