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
 
public class AddAdvocateAction extends ActionSupport{
 
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
        throws Exception {
 
		
	        
		return mapping.findForward("success");
	  
	}
 
}