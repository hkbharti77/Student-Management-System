package com.jspider.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.jspider.jdbc_crud_project_architecture.dto.Student;
import com.jspider.servlet_simple_crud_operation.dao.StudentDAO;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LoginStudentController extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email =  req.getParameter("email");
		String password = req.getParameter("password");
		
		StudentDAO studentDao = new StudentDAO();
		
		Student student = studentDao.getUserByEmailDao(email);
		
	   // PrintWriter out = res.getWriter();
	    res.setContentType("text/html");
	    
	    if(student != null) {
	    	if(password.equals(student.getPassword())) {
	    		req.getRequestDispatcher("student-display.jsp").forward(req, res);
	    	}
	    	else {
	    		req.setAttribute("msg", "password is wrong");
	    		req.getRequestDispatcher("student-login.jsp");
	    	}
	    	//out.println("<h2>Login Successful</h2>");
            //out.println("<p>Welcome, " + student.getName() + "!</p>");
	    }
	    else {
	    	req.setAttribute("msg", "email is wrong");
	    	req.getRequestDispatcher("student-login.jsp").forward(req, res);
           // out.println("<h2>Login Failed</h2>");
           // out.println("<p>Invalid email or password.</p>");
        }
	}

}
