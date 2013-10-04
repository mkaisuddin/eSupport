package com.mkyong.customer.form;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CaseForm extends ActionForm {

	private String prevDate;
	private String court;
	private String Client;
	private String opponent;
	private String currentStage;
	private String nextStage;
	private String nextDate;
	private String comments;
	private String specialNotes;
	
	

	public String getPrevDate() {
		return prevDate;
	}

	public void setPrevDate(String prevDate) {
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

	public String getNextDate() {
		return nextDate;
	}

	public void setNextDate(String nextDate) {
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

	//@Override
	/*public ActionErrors validate(ActionMapping mapping,
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
	*/
}
