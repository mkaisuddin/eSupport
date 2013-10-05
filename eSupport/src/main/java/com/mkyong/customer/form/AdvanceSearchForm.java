package com.mkyong.customer.form;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.mkyong.customer.model.Case;

public class AdvanceSearchForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5005795764199074021L;
	private String id;
	private String firstName;
	private String lastName;
	private String fromDate;
	private String toDate;
	private List<Case> caseList;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	

	public List<Case> getCaseList() {
		return caseList;
	}

	public void setCaseList(List<Case> caseList) {
		this.caseList = caseList;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
	HttpServletRequest request) {
 
	    ActionErrors errors = new ActionErrors();
 
	   /* if( getId() == null || ("".equals(getName()))) {
	       errors.add("stage.err.name",
              new ActionMessage("stage.err.name.required"));
	    }
	    
	    if( getDescription() == null || ("".equals(getDescription()))) {
		   errors.add("stage.address.err",
	           new ActionMessage("stage.err.address.required"));
		}*/

	    return errors;
	}
 
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// reset properties
		/*name = "";
		description = "";*/
	}
	
}
