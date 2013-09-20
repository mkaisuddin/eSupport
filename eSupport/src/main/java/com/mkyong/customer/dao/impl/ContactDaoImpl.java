package com.mkyong.customer.dao.impl;

import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.ContactDao;
import com.mkyong.customer.model.Contact;

public class ContactDaoImpl extends HibernateDaoSupport implements ContactDao{
	
	public void addContact(Contact contact){
		
		//stage.setActive(true);
		contact.setCreatedDate(new Date());
		getHibernateTemplate().save(contact);

	}
	
	/*public List<Stage> findAllStage(){
		
		return getHibernateTemplate().find("from stages");
		
	}*/
}