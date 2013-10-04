package com.mkyong.customer.action;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.bo.AdvocateBo;
import com.mkyong.customer.form.LoginForm;
 
public class LoginAction extends ActionSupport{
 
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
        throws Exception {
 
		AdvocateBo advocateBo = (AdvocateBo) getWebApplicationContext().getBean(
				"advocateBo");
		
		LoginForm loginForm = (LoginForm) form;
		
		advocateBo.findAdvocate(loginForm.getUserName(), loginForm.getPassword());
		
		if(loginForm.getUserName().equals("administrator"))
			return mapping.findForward("success");
		else
			return mapping.findForward("custom_advocate_landing_page");
	  
	}
 
}