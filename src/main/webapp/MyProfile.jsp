<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#E6E6FA">

	<%
		if (session.getAttribute("user") == null) {
			response.sendRedirect("Login.jsp");
		}
	%>
	
	<br>
	<h1 style="color: orange;">Welcome to  is your Profile</h1>
	<br>
	<a href="ViewServlet?page=1">View-Register-Data</a>
</body>
</html>