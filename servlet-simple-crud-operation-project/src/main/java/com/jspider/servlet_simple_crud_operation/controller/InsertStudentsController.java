package com.jspider.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.jspider.jdbc_crud_project_architecture.dto.Student;
import com.jspider.servlet_simple_crud_operation.dao.StudentDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InsertStudentsController implements Servlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

	
		
		StudentDAO dao = new StudentDAO();

		res.setContentType("text/html");

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

		Student student2=dao.InsertStudentDao(student);
		
		PrintWriter printWriter = res.getWriter();
		
		if(student2!=null) {
             
			req.setAttribute("msg", "You are susssesfully registred");
			//printWriter.write("<html><body><h4 style='color:green;'>Data Inserted</h4></body></html>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("student-login.jsp");
					//dispatcher.forward(req, res);
					dispatcher.include(req, res);
		}else {
			
			req.setAttribute("msgg", "Something went wrong");
			//printWriter.write("<html><body><h4 style='color:red;'>Something Went Wrong</h4></body></html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("student-Register.jsp");
			dispatcher.include(req, res);
		}
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}
