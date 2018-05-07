<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<style type="text/css"> <%@include file="../css/skeleton.css" %> </style>
	<title>Team Roster</title>
</head>
<body>
	<h1>Prototype Roster</h1>
	<a href="/Team_Roster/teams	">New Team</a>
	<table>
		<thead>
			<th>Team</th>
			<th>Players</th>
			<th>Action</th>
		</thead>
		<tbody>
		<c:forEach var="team" items="${teams}">
			<tr>
				<td><c:out value="${team.getTeam_Name()}"/></td>
				<td> <c:out value="${team.players.size()}"/> </td>
				<td><a href="/Team_Roster/teams?id=<c:out value="${teams.indexOf(team)}"/>">Details</a>    <a href="/Team_Roster/DeleteTeam?id=<c:out value="${teams.indexOf(team)}"/>">Delete</a></td>
			</tr>
		</c:forEach>
			
		</tbody>
	</table>
</body>
</html>