package com.mkyong.customer.model;

import java.util.Date;

public class Stage implements java.io.Serializable{
	private long id;
	private String name;
	private String description;
	private boolean isActive;
	private Date createdDate;
	
	public Stage(){
		
	}
	
	
	
	public Stage(long id, String name, String description, boolean isActive,
			Date createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
