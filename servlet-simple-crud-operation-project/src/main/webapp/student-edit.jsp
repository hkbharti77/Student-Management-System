<%@ page
	import="com.jspider.servlet_simple_crud_operation.dao.StudentDAO"%>
<%@ page import="com.jspider.jdbc_crud_project_architecture.dto.Student"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
			int id = Integer.parseInt(request.getParameter("id"));
			Student student=new StudentDAO().getStudentByIdDao(id);
		%>


	<form action="studentUpdate" method="post">

		<input type="number" name="id" value="<%= student.getId() %>"
			hidden="true"><br> <label>NAME:</label><br> <input
			type="text" value="<%= student.getName() %>" name="name"><br>

		<label>EMAIL:</label><br> <input type="email"
			value="<%= student.getEmail() %>" name="email"><br> <label>PHONE:</label><br>
		<input type="tel" value="<%= student.getPhone() %>" name="phone"><br>

		<label>PASSWORD:</label><br> <input type="password"
			value="<%= student.getPassword() %>" name="password"><br>

		<label>GENDER:</label><br> <input type="radio" name="gender"
			value="male" <% if(student.getGender().equalsIgnoreCase("male")){%>
			checked="checked" <%} %>>MALE <input type="radio"
			name="gender" value="female"
			<% if(student.getGender().equalsIgnoreCase("female")){%>
			checked="checked" <%} %>>FEMALE <input type="radio"
			name="gender" value="other"
			<% if(student.getGender().equalsIgnoreCase("other")) {%>
			checked="checked" <%} %>>OTHER <br>
		<br> <input type="submit" value="UPDATE"> <br>
	</form>

</body>
</html>