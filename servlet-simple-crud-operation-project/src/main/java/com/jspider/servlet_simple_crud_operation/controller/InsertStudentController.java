package com.jspider.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InsertStudentController implements Servlet{

	public InsertStudentController() {
		
	}

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
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		
		System.out.println("This is my first requeast");
		
		System.out.println(id + " " + name + " " + email);
		
		PrintWriter printWriter = res.getWriter();
		
		printWriter.write("<html><body><h4 style='color:red;'> This is my first response</h4></body></html>");
		printWriter.write("<html>");
		printWriter.write("<body><h4>" + id + "</h4><h4>" + name + "</h4></body>");
		printWriter.write("</html>");
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
