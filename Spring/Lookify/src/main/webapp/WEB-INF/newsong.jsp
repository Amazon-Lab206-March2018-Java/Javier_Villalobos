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
    <title>Add Song</title>
</head>
<body>
    <header>
        <a href="/dashboard">Dashboard</a>
    </header>
    <form:form method="POST" action="/songs/new" modelAttribute="song">
        <form:label path="title">Title
        <form:errors path="title"/>
        <form:input path="title"/></form:label>
        
        <form:label path="artist">Artist
        <form:errors path="artist"/>
        <form:textarea path="artist"/></form:label>
        
        <form:label path="rating">Rating (1-10)
        <form:errors path="rating"/>
        <form:input path="rating" type="number" min="1" max ="10" /></form:label>
        
        <input type="submit" value="Add Song"/>
    </form:form>
</body>
</html>