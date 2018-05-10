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
    <title>Search</title>
</head>
<body>
    <header>
        <h3>Top ten songs: </h3>
        <a href="/dashboard">Dashboard</a>
    </header>
    <div>
        <c:forEach var="song" items="${ songs }">
            <p>
                <c:out value="${ song.rating } "/> - 
                <a href='/songs/<c:out value="${ song.id } "/> '><c:out value="${ song.title } "/></a> - 
                <c:out value="${ song.artist } "/>
            </p>
        </c:forEach>
    </div>
</body>
</html>