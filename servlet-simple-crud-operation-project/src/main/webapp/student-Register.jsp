<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="StudentRegister" method="get">
		<label>ID:</label><br> <input type="number"
			placeholder="Enter student id" name="id"><br> <label>NAME:</label><br>
		<input type="text" placeholder="Enter student name" name="name"><br>

		<label>EMAIL:</label><br> <input type="email"
			placeholder="Enter student email" name="email"><br> <label>PHONE:</label><br>
		<input type="tel" placeholder="Enter student phone no" name="phone"><br>

		<label>PASSWORD:</label><br> <input type="text"
			placeholder="Enter student password" name="password"><br>

		<label>GENDER:</label><br> <input type="radio" name="gender"
			value="male">MALE <input type="radio" name="gender"
			value="female">FEMALE <input type="radio" name="gender"
			value="other">OTHER <br> <input type="submit"
			value="register"> <br>
	</form>

</body>
</html>