<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checkerboard</title>
</head>
<body>
	<% int width = Integer.parseInt(request.getParameter("width"));%>
	<% int height = Integer.parseInt(request.getParameter("height"));%>
	<% String x= "first";
	for( int i = 0; i<height;i++){
		if(x=="first"){
        	x="second";
        }
	    else{
	    	x="first";
	    }
		 for( int count = 0; count<width;count++){
			if(x=="first"){
	        	x="second";
	        }
		    else{
		    	x="first";
		    }%>
			<div class="<%= x %>"></div>
		<%}%>
		<br>
	<%}%>
</body>
</html>