<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style> <%@include file="skeleton.css"%></style>
    <style> <%@include file="styles.css"%></style> 
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	
	
	<h1>${ category.name }</h1>
	
	<h3>Products: </h3>
	<ul>
	
	<c:forEach var="product" items="${ category.products }">
		<li>${ product.name }</li>	
	</c:forEach>
	</ul>
	
	<form action="/categories/<c:out value="${category.id}"/>/addProduct" method="post">
		<select name="products">
			<c:forEach var="product" items="${products}">
				<c:if test="${!category.products.contains(product)}">
					<option value="${product.id}" label="${product.name}"/>
				</c:if>
			</c:forEach>
		</select>
		<p><input type="submit" value="Add"></p>
	</form>
	<a href="/products/new">New Product</a>
</body>
</html>