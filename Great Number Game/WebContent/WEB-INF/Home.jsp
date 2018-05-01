<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <style>
        *{text-align: center;}
        div{
            display: inline-block;
            background-color: red;
            max-width: 150px;

        }
        .won{
        	background-color: green;
        }
    </style> 
</head>
<body>
 <h2>Welcome to the Great Number Game!</h2>
    <p>I am thinking of a number between 1 and 100</p>
    <p>Take a guess!</p>
    <div class=" <c:out value="${won}"/>">
        <h1>  <c:out value="${result}"/> </h1>
	    <form action="/Great_Number_Game/PlayAgain" style="display:<c:out value="${show}"/>">
	        <input type="submit" class="submit" value="Play Again">
	    </form>
    </div>
    <form action="/Great_Number_Game/guess" method="post">
        <input required type="text" name="number">
        <input type="submit" class="submit" value="Guess!">
    </form>
</body>
</html>