package com.mkyong.customer.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3053877305854669735L;
	private long id;
	private String firstName;
	private String lastName;
	private Date dob;
	private String password;
	private Contact contact;
	
	private Set<Advocate> advocate = 
			new HashSet<Advocate>(0);
	
	private Set<Client> client = 
			new HashSet<Client>(0);
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Set<Advocate> getAdvocate() {
		return advocate;
	}
	public void setAdvocate(Set<Advocate> advocate) {
		this.advocate = advocate;
	}
	public Set<Client> getClient() {
		return client;
	}
	public void setClient(Set<Client> client) {
		this.client = client;
	}
	
	
}
