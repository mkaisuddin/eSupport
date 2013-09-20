package com.mkyong.customer.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class StageForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9146122332694062744L;
	private String name;
	private String description;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
	HttpServletRequest request) {
 
	    ActionErrors errors = new ActionErrors();
 
	    if( getName() == null || ("".equals(getName()))) {
	       errors.add("stage.err.name",
              new ActionMessage("stage.err.name.required"));
	    }
	    
	    if( getDescription() == null || ("".equals(getDescription()))) {
		   errors.add("stage.address.err",
	           new ActionMessage("stage.err.address.required"));
		}

	    return errors;
	}
 
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// reset properties
		name = "";
		description = "";
	}
	
}
