package com.mkyong.customer.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.AdvocateDao;
import com.mkyong.customer.model.Advocate;
import com.mkyong.customer.util.PasswordHash;

public class AdvocateDaoImpl extends HibernateDaoSupport implements AdvocateDao{
	
	public void addAdvocate(Advocate advocate){
		advocate.setCreatedDate(new Date());
		getHibernateTemplate().save(advocate);
	}

	public Advocate findAdvocate(String userName, String password) {
		//Session session = this.getSession();
		List advocate = getSession().createCriteria(Advocate.class)
				.add(Restrictions.eq("advUserName", userName))
				.add(Restrictions.eq("password", PasswordHash.encrypt(password)))
				.list();
		 
		return (Advocate) advocate.get(0);
	}
	
	/*public List<Stage> findAllStage(){
		
		return getHibernateTemplate().find("from stages");
		
	}*/
}