<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" href="style.css">
<title>Login</title>
</head>
<body>
	<div>
		<div align="center" class="parent">
			<h1 class="hed">LogIn</h1>
			<form action="Loginuser" method="get" id="form_login">
				<label>UserName</label><br>
				<input type="text" name="uname"><br>
				<label>Password</label><br>
				<input type="password" name="upass"><br>
				<br> <button type="submit" value="login">Submit</button>
			</form>
		</div>
	</div>

</body>
</html>