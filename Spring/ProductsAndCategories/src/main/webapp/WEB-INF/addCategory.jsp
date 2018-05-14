<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style> <%@include file="skeleton.css"%></style>
    <style> <%@include file="styles.css"%></style> 
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Category</title>
</head>
<body>
	
	
	<h1>${ product.name }</h1>
	
	<h3>Categories: </h3>
	<ul>
	
	<c:forEach var="category" items="${ product.categories }">
		<li>${category.name}</li>	
	</c:forEach>
	</ul>
	<h3>Add new category: </h3>
		<form action="/products/<c:out value="${product.id}"/>/addCategory" method="post">
			<select name="categories">
				<c:forEach var="category" items="${categories}">
					<c:if test="${!product.categories.contains(category)}">
						<option value="${category.id}" label="${category.name}"/>
					</c:if>
				</c:forEach>
			</select>
			<p><input type="submit" value="Add"></p>
		</form>
	<a href="/categories/new">New Category</a>
</body>
</html>
