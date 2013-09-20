package com.mkyong.customer.action;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.bo.ContactBo;
import com.mkyong.customer.bo.CourtBo;
import com.mkyong.customer.form.CourtForm;
import com.mkyong.customer.model.Contact;
import com.mkyong.customer.model.Court;
import com.mkyong.customer.model.Stage;
 
public class AddCourtAction extends ActionSupport{
 
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
        throws Exception {
 
		ContactBo contactBo =
			(ContactBo) getWebApplicationContext().getBean("contactBo");
		CourtBo courtBo =
				(CourtBo) getWebApplicationContext().getBean("courtBo");
		
		CourtForm courtForm = (CourtForm)form;
		
		Contact contact = new Contact();
		
		contact.setAddress(courtForm.getAddress());
		contact.setDeskPhone(courtForm.getDeskPhone());
		contact.setMobile(courtForm.getMobile());
		contact.setEmail(courtForm.getEmail());
		contact.setWww(courtForm.getWww());
		//Save Contact Info First
		contactBo.addContact(contact);
		
		Court court = new Court();
		
		court.setName(courtForm.getName());
		court.setContact(contact);
		
		contact.getCourt().add(court);
		
		courtBo.addCourt(court);
	        
		return mapping.findForward("success");
	  
	}
 
}