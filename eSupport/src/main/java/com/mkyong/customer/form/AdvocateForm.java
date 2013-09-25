package com.mkyong.customer.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AdvocateForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6002182610557123428L;
	private String advUserName;
	private String password;
	private String firstName;
	private String lastName;
	private String dob;
	private String address;
	private String deskPhone;
	private String mobile;
	private String email;
	private String www;
	

	

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAdvUserName() {
		return advUserName;
	}

	public void setAdvUserName(String advUserName) {
		this.advUserName = advUserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
	HttpServletRequest request) {
 
	    ActionErrors errors = new ActionErrors();
 
	    if( getAdvUserName() == null || ("".equals(getAdvUserName()))) {
	       errors.add("advocate.err.name",
              new ActionMessage("advocate.err.name.required"));
	    }
	    
	    if( getAdvUserName() == null || ("".equals(getAdvUserName()))) {
		   errors.add("advocate.address.err",
	           new ActionMessage("advocate.err.address.required"));
		}

	    return errors;
	}
 
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// reset properties
		//name = "";
		//address = "";
	}
	
}
