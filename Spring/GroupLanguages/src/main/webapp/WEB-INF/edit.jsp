<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style> <%@include file="skeleton.css"%></style>
<style> <%@include file="styles.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<a href="/languages/delete/${id}" > Delete</a><a href="/" > Dashboard</a> <br>

    <form:form method="POST" action="/languages/edit/${id}/submit" modelAttribute="language">
	    <form:label path="name">Name
	    <form:input path="name" value="${ currentLanguage.name }"/>
	    <form:errors path="name"/></form:label>
	    
	    <form:label path="creator">Creator
	    <form:input path="creator" value="${ currentLanguage.creator }"/>
	    <form:errors path="creator"/></form:label>
	    
	    <form:label path="version">Version
	    <form:input path="version" value="${ currentLanguage.version }"/>
	    <form:errors path="version"/></form:label>
	        
	    <input type="submit" value="Submit"/>
	</form:form>

</body>
</html>