<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h2>You have generated a word <c:out value="${counter }"/> times</h2>
    <h1><c:out value="${word }"/></h1>
    <a href="/RandomWordGeneratorWithTime/generate"> <button> Generate</button> </a>
    <h2>The last time you generated a word was:</h2>
    <h1><c:out value="${time }"/></h1>
</body>
</html>