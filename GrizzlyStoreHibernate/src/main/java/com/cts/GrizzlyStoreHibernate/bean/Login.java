package com.cts.GrizzlyStoreHibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Login_table")
public class Login {
	
	private String userId;
	private String password;
	private String userType;
	private int	userStatus;
	private String contactno;
	private String address;
	private String name;
	private String designation;
	private int id;
	
	
	@Id
	@Column(name = "LoginId")
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Login(String userId, String password, String userType, int userStatus, String address,
			String name, String designation, int id, String contactno) {
		super();
		this.userId = userId;
		this.password = password;
		this.userType = userType;
		this.userStatus = userStatus;
		this.contactno = contactno;
		this.address = address;
		this.name = name;
		this.designation = designation;
		this.id = id;
	}
	public Login() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", password=" + password + ", userType=" + userType + ", userStatus="
				+ userStatus + ", contactno=" + contactno + ", address=" + address + ", name=" + name + ", designation="
				+ designation + ", id=" + id + "]";
	}

}
