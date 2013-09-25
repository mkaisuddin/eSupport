package com.mkyong.customer.model;

import java.util.Date;

public class Advocate implements java.io.Serializable{
	private long id;
	private String advUserName;
	private Date createdDate;
	
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdvUserName() {
		return advUserName;
	}

	public void setAdvUserName(String advUserName) {
		this.advUserName = advUserName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
