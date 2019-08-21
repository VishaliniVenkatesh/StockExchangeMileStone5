package com.demo.SpringMVCBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	
	private int id;
	@Column(name="username")
	@NotEmpty(message="Username cannot be empty")
	private String username;
	@Column(name="password")
	@NotEmpty(message="Password cannot be empty")
	private String password;
	@Column(name="usertype")
	@NotEmpty(message="Please enter confirm password")
    private String confirmPassword;
	@Column(name="email")
	@NotEmpty(message="Please enter email-id")
	
    private String email;
	@Column(name="mobile_number")
	private long mobileNumber;
	
	public User()
	{
		
	}

	public User(int id, String username, String password, String confirmPassword, String email, long mobileNumber) {
		super();
		this.id = id;
		this.username = username;
		
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
