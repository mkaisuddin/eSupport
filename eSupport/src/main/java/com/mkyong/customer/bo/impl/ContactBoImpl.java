package com.mkyong.customer.bo.impl;

import com.mkyong.customer.bo.ContactBo;
import com.mkyong.customer.dao.ContactDao;
import com.mkyong.customer.model.Contact;
 
public class ContactBoImpl implements ContactBo{
 
	ContactDao contactDao;
	
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	public void addContact(Contact contact){
		
		contactDao.addContact(contact);

	}
	
	/*public List<Stage> findAllStage(){
		
		return stageDao.findAllStage();
	}*/
 
}