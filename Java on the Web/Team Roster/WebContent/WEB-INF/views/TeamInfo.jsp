<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style type="text/css"> <%@include file="../css/skeleton.css" %> </style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Team</title>
</head>
<body>
    <h1>Team Name</h1>
        <a href="/Team_Roster/Players	">New Ninja</a>
        <table>
            <thead>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
                <th>Actions</th>
            </thead>
            <tbody>
           		<c:forEach var="player" items="${players}">
					<tr>
						<td><c:out value="${player.getFirst_name()}"/></td>
						<td><c:out value="${player.getLast_name()}"/></td>
						<td><c:out value="${player.getAge()}"/></td>
						<td><a href="/Team_Roster/DeletePlayer?id=<c:out value="${players.indexOf(player)}"/>">Delete</a></td>
					</tr>
				</c:forEach>
            </tbody>
        </table>
</body>
</html>