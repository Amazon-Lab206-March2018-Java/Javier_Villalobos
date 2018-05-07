<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css"><%@include file="bootstrap.css" %></style>
<style type="text/css"><%@include file="styles.css" %></style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ninja Gold</title>
</head>
<body>
    <h3 class="gold">Your gold: </h3>
    <h3 class="gold"> <c:out value="${ gold }"/>  </h3>
    <form action="/process_money" method="post" class="thumbnail">
        <h3>Farm</h3>
        
        <p>(earns 10-20 golds)</p>
        <input type="hidden" name="building" value="farm" />
        <input type="submit" value="Find Gold!" class="btn btn-primary"/>
    </form>
    <form action="/process_money" method="post" class="thumbnail">
        <h3>Cave</h3>
        <p>(earns 5-10 golds)</p>
        <input type="hidden" name="building" value="cave" />
        <input type="submit" value="Find Gold!" class="btn btn-primary"/>
    </form>
    <form action="/process_money" method="post" class="thumbnail">
        <h3>House</h3>
        <p>(earns 2-5 golds)</p>
        <input type="hidden" name="building" value="house" />
        <input type="submit" value="Find Gold!" class="btn btn-primary" />
    </form>
    <form action="/process_money" method="post" class="thumbnail">
        <h3>Casino</h3>
        <p>(earns 0-50 golds)</p>
        <input type="hidden" name="building" value="casino" />
        <input type="submit" value="Find Gold!" class="btn btn-primary "/>
    </form>
    <h3>Activities: </h3>
    <div class="alert">
        <p>
        <c:forEach var="activity" items="${ activities }">
        	<p class="<c:out value="${ activity.color }"/>"> <c:out value="${ activity.message }"/> <p/>
        </c:forEach>
        </p>
    </div>
    <form action="/reset" method="post">
        <input type="submit" value="Reset" class="btn btn-inverse">
    </form>
</body>
</html>