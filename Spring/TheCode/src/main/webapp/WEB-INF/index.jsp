<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The code</title>
</head>
<body>
    <div style="text-align: center">
        <p style="color: red;"> <c:out value="${errors}"/>  </p>
        <h3>What is the code?</h3>
        <form action="/code" method="post">
            <input type="text" name="word">
            <input type="submit" value="Try code">
        </form>
    </div>
</body>
</html>