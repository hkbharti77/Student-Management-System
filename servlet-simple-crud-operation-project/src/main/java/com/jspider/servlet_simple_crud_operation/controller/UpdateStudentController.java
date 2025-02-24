package com.jspider.servlet_simple_crud_operation.controller;

import java.io.IOException;

import com.jspider.jdbc_crud_project_architecture.dto.Student;
import com.jspider.servlet_simple_crud_operation.dao.StudentDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/studentUpdate")
public class UpdateStudentController extends HttpServlet {
	
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");

		Student student = new Student();
		
		student.setId(id);
		student.setName(name);
		student.setEmail(email);
		student.setPhone(phone);
		student.setPassword(password);
		student.setGender(gender);
		
		Student  a= new StudentDAO().updateStudentDao(student);
		if(a!= null) {
			req.getRequestDispatcher("student-dsplay.jsp").forward(req, resp);
		}

}
}
