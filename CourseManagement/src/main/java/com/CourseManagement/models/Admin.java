package com.CourseManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class Admin {

	private String userName;
	
	private String password;
	public Admin() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
