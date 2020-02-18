<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Sign Up</title>
<link rel="stylesheet" href="s.css">
</head>

<body bgcolor="whitesmoke">

	<div class="main" >

		<form action="Register" method="post">

			<h1>Sign Up</h1>
			<input type="text" placeholder="Username" name="Username" required="required"> <br><br>
			<input type="email" placeholder="Email" name="Email" required="required"> <br><br>
			<input type="text" placeholder="Mobile-number" name="Mobile-number" required="required"><br><br>
			<input type="password" placeholder="Password" name="Password" required="required"><br><br>
			<input type="password" placeholder="Confirm-Password"
				name="Confirm-Password" required="required"> <br> <br><input type="submit"
				value="Sign Up">

		</form>

	</div>

</body>

</html>