<%@ page import="java.util.List"%>
<%@ page
	import="com.jspider.servlet_simple_crud_operation.dao.StudentDAO"%>
<%@ page import="com.jspider.jdbc_crud_project_architecture.dto.Student"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Display Page</title>
</head>
<body>
	<h1>Student Display Page</h1>

	<% List<Student> students = new StudentDAO().getAllStudentDao(); %>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>PHONE</th>
			<th>GENDER</th>
			<th colspan="2">ACTION</th>
		</tr>

		<% for (Student student : students) { %>
		<tr>
			<td><%= student.getId() %></td>
			<td><%= student.getName() %></td>
			<td><%= student.getEmail() %></td>
			<td><%= student.getPhone() %></td>
			<td><%= student.getGender() %></td>
			<td><a href="deleteStudent?id=<%= student.getId() %>">DELETE</a></td>
			<td><a href="student-edit.jsp?id=<%= student.getId()%>">EDIT</a></td>
		</tr>
		<% } %>
	</table>
</body>
</html>
