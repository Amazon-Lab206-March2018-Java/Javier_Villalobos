<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>New Team</title>
	<style type="text/css"> <%@include file="../css/skeleton.css" %> </style>
</head>
<body>
    <h1></h1>
    <form action="/Team_Roster/teams" method="post">
        <label> Team Name: <input type="text" name="teamName"> </label>
        <input type="submit" value="Create" >
    </form>
</body>
</html>