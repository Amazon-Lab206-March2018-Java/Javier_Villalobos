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
    <title>Show</title>
</head>
<body>
    <h1> ${ person.firstName }  ${ person.lastName} </h1>    
    
    <h5>License number: ${ person.license.number } </h5>
    <h5>State: ${ person.license.state } </h5>
    <h5>Expiration Date: ${ person.license.expiration_date } </h5>
    <a href="/licenses/new">New License</a>
    <a href="/person/new">New Person</a>
</body>
</html>