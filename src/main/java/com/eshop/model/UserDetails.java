package com.eshop.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class UserDetails {

	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "name")
	private String name;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Transient
	private String role;
	@Transient
	private boolean enabled;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "mobile")
	private String mobile;
	
	
	@Column(name = "email")
	private String email;
	
	
}
