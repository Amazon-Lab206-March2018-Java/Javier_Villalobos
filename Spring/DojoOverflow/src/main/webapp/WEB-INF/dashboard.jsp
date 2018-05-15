<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style> <%@include file="skeleton.css"%></style>
    <style> <%@include file="styles.css"%></style> 
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Questions Dashboard</title>
</head>
<body>
	<h1>Questions Dashboard</h1>
	<div>
		<table>
			<thead>
				<tr>
					<th>Question</th>
					<th>Tags</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="question" items="${ questions }">
					<tr>
						<td> <a href="/questions/${question.id}"> ${ question.question } </a></td>
						<td> ${question} </td>
					</tr>
				</c:forEach>
	
			</tbody>
		</table>
	</div>
	<a href="/questions/new">New Question</a>
</body>
</html>
