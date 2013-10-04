package com.mkyong.customer.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {

	private String userName;
	private String password;
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
	
	

	@Override
	public ActionErrors validate(ActionMapping mapping,
	HttpServletRequest request) {
 
	    ActionErrors errors = new ActionErrors();
 
	    if( getUserName() == null || ("".equals(getUserName()))) {
	       errors.add("advocate.err.name",
              new ActionMessage("advocate.err.name.required"));
	    }
	    
	    if( getPassword() == null || ("".equals(getPassword()))) {
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
