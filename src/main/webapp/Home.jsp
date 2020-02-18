<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #4CAF50;
	color: white;
}
.home-page{
	text-align: center;
    margin-top: 60px;
    padding-left: 292px
}
</style>
</head>
<body>

	<div class="topnav">
		<a class="active" href="#home">Home</a> <a href="Register.jsp">Register</a>
		<a href="Login.jsp">Login</a> <a href="#about">About</a>
	</div>

	<div class="home-page">
		<h2>Welcome To Our Page..</h2>
		<p>You can Watch some content here</p>
		<p>Please login to for more info</p>
	</div>

</body>
</html>
