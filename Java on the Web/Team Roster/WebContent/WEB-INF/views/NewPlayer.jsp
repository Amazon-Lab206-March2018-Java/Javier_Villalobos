<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style type="text/css"> <%@include file="../css/skeleton.css" %> </style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Player</title>
</head>
<body>
    <form action="/Team_Roster/Players" method="post">
        <label> First Name: <input type="text" name="first_name"> </label>
        <label> Last Name: <input type="text" name="last_name"> </label>
        <label> Age <input type="number" min="18" max="50" name="age"> </label>
        <input type="submit" value="Create Player">
    </form>
</body>
</html>