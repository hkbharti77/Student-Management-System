 package com.jspider.servlet_simple_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspider.jdbc_crud_project_architecture.dto.Student;
import com.jspider.servlet_simple_crud_operation.connection.StudentConnection;



public class StudentDAO {

	Connection connection = StudentConnection.getStudentConnection();

	public Student InsertStudentDao(Student st) {

		String sql = "insert into student(id,name,email,phone,password,gender) values(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, st.getId());
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setLong(4, st.getPhone());
			ps.setString(5, st.getPassword());
			ps.setString(6, st.getGender());

			int a = ps.executeUpdate();

			if (a != 0) {
				System.out.println("Data inserted ");
				return st;
			} else {
				System.out.println("data not inserted");
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	/* Method for login page start */

	public Student getUserByEmailDao(String email) {

		String sql = "select email,password from student where email=?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Student st = new Student();

				st.setEmail(rs.getString("email"));

				st.setPassword(rs.getString("password"));

				return st;
			} else {
				return null;
			}
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}

	}

	/* Method for login page end */

	/* Method GetStudentById start */

	public Student getStudentByIdDao(int id) {
		
		String sql = "select * from student where id=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				Student st = new Student();
				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setEmail(rs.getString("email"));
				st.setPhone(rs.getLong("phone"));
				st.setPassword(rs.getString("password"));
				st.setGender(rs.getString("gender"));
				return st;
			}else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/* Method getAllStudentDao method end */

	/* Method GetStudentById start */

	public List<Student> getAllStudentDao() {

		String sql = "select * from student";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			List<Student> students = new ArrayList<Student>();

			while (rs.next()) {

				Student st = new Student();
				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setEmail(rs.getString("email"));
				st.setPhone(rs.getLong("phone"));
				st.setPassword(rs.getString("password"));
				st.setGender(rs.getString("gender"));

				students.add(st);
			}

			return students;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}

	}

	public int deleteStudentById(int id) {

		String sql = "delete from student where id=?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			return ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		}

	}
	
/*  Update Method*/
	
	public Student updateStudentDao(Student st) {

		String sql = "update student set name = ?, email = ?, phone = ?, password = ?, gender = ?, wher id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(6, st.getId());
			ps.setString(1, st.getName());
			ps.setString(2, st.getEmail());
			ps.setLong(3, st.getPhone());
			ps.setString(4, st.getPassword());
			ps.setString(5, st.getGender());

			int a = ps.executeUpdate();

			if (a != 0) {
				System.out.println("Data update ");
				return st;
			} else {
				System.out.println("data not update");
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

}
