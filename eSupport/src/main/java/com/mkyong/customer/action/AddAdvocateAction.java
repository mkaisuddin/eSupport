package com.mkyong.customer.action;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.bo.AdvocateBo;
import com.mkyong.customer.bo.ContactBo;
import com.mkyong.customer.bo.UserBo;
import com.mkyong.customer.form.AdvocateForm;
import com.mkyong.customer.model.Advocate;
import com.mkyong.customer.model.Contact;
import com.mkyong.customer.model.User;

public class AddAdvocateAction extends ActionSupport {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ContactBo contactBo = (ContactBo) getWebApplicationContext().getBean(
				"contactBo");
		
		UserBo userBo = (UserBo) getWebApplicationContext().getBean(
				"userBo");
		
		AdvocateBo advocateBo = (AdvocateBo) getWebApplicationContext().getBean(
				"advocateBo");

		AdvocateForm advocateForm = (AdvocateForm) form;

		Contact contact = new Contact();

		contact.setAddress(advocateForm.getAddress());
		contact.setDeskPhone(advocateForm.getDeskPhone());
		contact.setMobile(advocateForm.getMobile());
		contact.setEmail(advocateForm.getEmail());
		contact.setWww(advocateForm.getWww());
		// Save Contact Detail Info First
		contactBo.addContact(contact);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		
		User user = new User();
		
		user.setFirstName(advocateForm.getFirstName());
		user.setLastName(advocateForm.getLastName());
		user.setDob(formatter.parse(advocateForm.getDob()));
		user.setPassword("P@55word");
		user.setContact(contact);
		
		contact.getUser().add(user);
		
		userBo.addUser(user);
		
		Advocate advocate = new Advocate();
		
		advocate.setAdvUserName(advocateForm.getAdvUserName());
		advocate.setUser(user);
		
		user.getAdvocate().add(advocate);
		
		advocateBo.addAdvocate(advocate);
		
		

		return mapping.findForward("success");

	}

}