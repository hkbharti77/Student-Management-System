package com.jspider.servlet_simple_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class StudentConnection {

	public StudentConnection() {
		// TODO Auto-generated constructor stub
	}
	static Connection connection = null;
	
    public static Connection getStudentConnection()
    {
  	  try {
  	   Class.forName("com.mysql.cj.jdbc.Driver");	 
  	   return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-m12","root", "hkbharti77@"  );
  	  }
  	  catch(ClassNotFoundException | SQLException e)
  	  {
  		  e.printStackTrace();
  		  return null;
  	  }
    }

}
