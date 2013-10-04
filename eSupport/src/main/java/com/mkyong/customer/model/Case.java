package com.mkyong.customer.model;

import java.util.Date;

public class Case implements java.io.Serializable{
	private long id;
	private Date prevDate;
	private String court;
	private String Client;
	private String opponent;
	private String currentStage;
	private String nextStage;
	private Date nextDate;
	private String comments;
	private String specialNotes;
	private Date createdDate;
	
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getPrevDate() {
		return prevDate;
	}
	public void setPrevDate(Date prevDate) {
		this.prevDate = prevDate;
	}
	public String getCourt() {
		return court;
	}
	public void setCourt(String court) {
		this.court = court;
	}
	public String getClient() {
		return Client;
	}
	public void setClient(String client) {
		Client = client;
	}
	public String getOpponent() {
		return opponent;
	}
	public void setOpponent(String opponent) {
		this.opponent = opponent;
	}
	public String getCurrentStage() {
		return currentStage;
	}
	public void setCurrentStage(String currentStage) {
		this.currentStage = currentStage;
	}
	public String getNextStage() {
		return nextStage;
	}
	public void setNextStage(String nextStage) {
		this.nextStage = nextStage;
	}
	public Date getNextDate() {
		return nextDate;
	}
	public void setNextDate(Date nextDate) {
		this.nextDate = nextDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSpecialNotes() {
		return specialNotes;
	}
	public void setSpecialNotes(String specialNotes) {
		this.specialNotes = specialNotes;
	}
	
	
}
