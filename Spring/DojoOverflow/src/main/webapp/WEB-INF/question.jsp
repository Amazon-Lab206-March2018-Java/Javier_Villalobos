<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style> <%@include file="skeleton.css"%></style>
    <style> <%@include file="styles.css"%></style> 
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question Profile</title>
</head>
<body>
	<h1> ${ question.question }</h1>
	<c:forEach var="tag" items="${ question.tags }">
		<div> <c:out value="${ tag }"/> </div>
	</c:forEach>
	<table>
		<thead>
			<tr>
				<th>Answers</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="answer" items="${ question.answers }">
				<tr>
					<td> ${ answer.answer } </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<h3>Add your answer: </h3>
	<form:form action="/questions/${question.id }" method="POST" modelAttribute="answer">
	
		<form:errors path="answer"/>
		<form:label path="answer">
		<form:input type="text" path="answer"/></form:label>
	</form:form>
	<a href="/">Dashboard</a>
</body>
</html>
