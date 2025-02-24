<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN PAGE</title>

</head>
<body>
	<%  String message = (String)request.getAttribute("msg");
      if(message != null){
  %>

	<h5 style="color: green"><%= message %></h5>

	<% } %>


	<h1>Welcome to my login page</h1>
	<div>
		<form action="loginStudent" method="get">

			<label>USERNAME:</label><br> <input type="email"
				placeholder="Enter your email" name="email"><br> <label>PASSWORD:</label><br>
			<input type="text" placeholder="Enter your password" name="password"><br>
			<input type="submit" value="login">

		</form>
	</div>

</body>
</html>