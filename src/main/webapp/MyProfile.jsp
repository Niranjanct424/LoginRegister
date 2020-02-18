<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background: border-box>

	<%
		if (session.getAttribute("user") == null) {
			response.sendRedirect("Login.jsp");
		}
	%>
	
	<br>
	<h1 style="color: orange;" align="center">Welcome To The Page </h1>
	<br>
	<h2 align="center" style="color:cadetblue;">Click below link see user details</h2><br>
	<h1 align="center"><a href="ViewServlet?page=1">View-Register-Data</a></h1>
</body>
</html>