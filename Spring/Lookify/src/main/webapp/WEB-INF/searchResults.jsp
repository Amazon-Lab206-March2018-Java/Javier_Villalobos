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
        <h4>Songs by Artist: ${  songs[0].artist } </h4>
         <form action="/search/">    <!--********************************** -->
            <input type="text" name="artist">
            <input type="submit" value="New Search">
        </form>
        <a href="/dashboard">Dashboard</a>
    </header>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Rating</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="song" items="${ songs }">
            <tr>
                <td> <a href='/songs/<c:out value="${ song.id } "/> '><c:out value="${ song.title } "/></a> </td>
                <td> <c:out value="${ song.rating } "/> </td>
                <td> <a href='/songs/delete/<c:out value="${ song.id } "/> '>Delete</a> </td>
            </tr>
		</c:forEach>
        </tbody>
    </table>
</body>
</html>