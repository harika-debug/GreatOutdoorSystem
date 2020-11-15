package com.capgemini.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_registration")

public class User{
	@Id
	@Column(name="userId")
	private String userId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phonenumber")
	private long phonenumber;
	
	@Column(name="email")
	private String email;
	
	
	public User(String userId, String password, long phonenumber, String email) {
		super();
		this.userId = userId;
		this.phonenumber = phonenumber;
		this.password = password;
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
	
