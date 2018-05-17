<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style> <%@include file="skeleton.css"%></style>
    <style> <%@include file="styles.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<header>
	    <h4>Welcome <c:out value="${currentUser.firstName}"></c:out></h4>
	    <form id="logoutForm" method="POST" action="/logout">
	        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	        <input type="submit" value="Logout!" />
	    </form>
    </header>
    <div>
    	<h4>First Name: ${currentUser.firstName}</h4>
    	<h4>Last Name: ${currentUser.lastName}</h4>
    	<h4>Email: ${currentUser.email}</h4>
    	<h4>Sign up date Name: ${currentUser.createdAt}</h4>
    	<h4>Last Sign In: ${currentUser.lastSignIn}</h4>
    
    </div>
    
</body>
</html>