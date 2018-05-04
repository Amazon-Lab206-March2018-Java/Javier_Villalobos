<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="styles.css">
<title>Dojo Survey</title>
</head>
<body>
    <div class="wrapper">
        <form action="/results" method="post">
            <label>Your Name: <input type="text" name="name"></label>
            <label>Dojo Location: 
                <select name="location" value="San Jose">
                    <option value="San Jose">San Jose</option>
                    <option value="Seattle">Seattle</option>
                </select>
            </label>
            <label>Favorite Language: 
                <select name="language" value="San Jose">
                    <option value="Python">Python</option>
                    <option value="Java">Java</option>
                </select>
            </label>
            <textarea name="comments" cols="30" rows="3"></textarea>
            <input type="submit">
        </form>
    </div>
</body>
</html>