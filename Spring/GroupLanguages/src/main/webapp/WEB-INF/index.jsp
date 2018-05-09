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

<title>Group Languages</title>
</head>
<body>
    <table>
        <thead>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Action</th>
        </thead>
        <tbody>
           	<c:forEach var="language" items="${languages }">
	            <tr>
	                <td><a href="/languages/<c:out value="${ language.id }"/>"> <c:out value="${ language.name }"/> </a> </td>
	                <td><c:out value="${ language.creator }"/></td>
	                <td><c:out value="${ language.version }"/></td>
	                <td>	<a href="/languages/edit/<c:out value="${ language.id }"/>" > Edit</a>  <a href="/languages/delete/<c:out value="${ language.id  }"/>" > Delete</a></td>
    	        </tr>
  	        </c:forEach>
        </tbody>
    </table>
    
    <form:form method="POST" action="/languages/new" modelAttribute="language">
    	<form:hidden path="id" />
    	
	    <form:label path="name">Name
	    <form:input path="name"/>
	    <form:errors path="name"/></form:label>
	    
	    <form:label path="creator">Creator
	    <form:input path="creator"/>
	    <form:errors path="creator"/></form:label>
	    
	    <form:label path="version">Version
	    <form:input path="version"/>
	    <form:errors path="version"/></form:label>
	        
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>