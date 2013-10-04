package com.mkyong.customer.action;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.bo.ClientBo;
import com.mkyong.customer.bo.ContactBo;
import com.mkyong.customer.bo.UserBo;
import com.mkyong.customer.form.ClientForm;
import com.mkyong.customer.model.Client;
import com.mkyong.customer.model.Contact;
import com.mkyong.customer.model.User;

public class AddClientAction extends ActionSupport {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ContactBo contactBo = (ContactBo) getWebApplicationContext().getBean(
				"contactBo");
		
		UserBo userBo = (UserBo) getWebApplicationContext().getBean(
				"userBo");
		
		ClientBo clientBo = (ClientBo) getWebApplicationContext().getBean(
				"clientBo");
		
		ClientForm clientForm = (ClientForm) form;

		Contact contact = new Contact();

		contact.setAddress(clientForm.getAddress());
		contact.setDeskPhone(clientForm.getDeskPhone());
		contact.setMobile(clientForm.getMobile());
		contact.setEmail(clientForm.getEmail());
		
		// Save Contact Detail Info First
		contactBo.addContact(contact);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		
		User user = new User();
		
		user.setFirstName(clientForm.getFirstName());
		user.setLastName(clientForm.getLastName());
		user.setDob(formatter.parse(clientForm.getDob()));
		user.setPassword("P@55word");
		user.setContact(contact);
		
		contact.getUser().add(user);
		
		userBo.addUser(user);
		
		Client client = new Client();
		
		
		client.setUser(user);
		
		user.getClient().add(client);
		
		clientBo.addClient(client);
		

		return mapping.findForward("success");

	}

}