package com.jspider.jdbc_crud_project_architecture.dto;

import java.io.Serializable;
/*
 * Student is java pojo (player old java object) class
 * @author Himanshu Bharti
 */

import java.util.Objects;

public class Student implements Serializable {

	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	private String gender;
		
	
	
	public Student() {
		
	}

	public Student(int id, String name, String email, long phone, String password, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, email, id, name, phone);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(password, other.password) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name) && phone == other.phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + password + "]";
	}
	
	

}

