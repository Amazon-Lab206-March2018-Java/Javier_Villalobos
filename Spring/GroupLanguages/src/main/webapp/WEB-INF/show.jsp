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
<title></title>
</head>
<body>
	<a href="/" > Dashboard</a> <br>
	
	<c:out value="${ currentLanguage.name }"/><br>
	<c:out value="${ currentLanguage.creator }"/><br>
	<c:out value="${ currentLanguage.version }"/><br>
	
	<a href="/languages/edit/<c:out value="${ id }"/>" > Edit</a>  <a href="/languages/delete/<c:out value="${ id }"/>" > Delete</a>
</body>
</html>