package com.mkyong.customer.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Contact implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -448539438788410559L;
	private long id;
	private String address;
	private String deskPhone;
	private String mobile;
	private String email;
	private String www;
    private Date createdDate;
    
    private Set<Court> court = 
			new HashSet<Court>(0);
    
    private Set<User> user = 
			new HashSet<User>(0);
	
	public Contact(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDeskPhone() {
		return deskPhone;
	}

	public void setDeskPhone(String deskPhone) {
		this.deskPhone = deskPhone;
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

	public String getWww() {
		return www;
	}

	public void setWww(String www) {
		this.www = www;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Set<Court> getCourt() {
		return court;
	}

	public void setCourt(Set<Court> court) {
		this.court = court;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
	
	
}
