package com.jspider.servlet_simple_crud_operation.controller;

import java.io.IOException;

import com.jspider.servlet_simple_crud_operation.dao.StudentDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteStudentController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		int a = new StudentDAO().deleteStudentById(id);
		
		if(a != 0) {
			System.out.println(id + " given id data deleted from table");
			req.getRequestDispatcher("student-display.jsp").forward(req, resp);
		}
	}
}
