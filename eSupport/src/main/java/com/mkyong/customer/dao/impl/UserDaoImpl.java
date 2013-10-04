package com.mkyong.customer.dao.impl;

import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.UserDao;
import com.mkyong.customer.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
	
	public void addUser(User user){
		getHibernateTemplate().save(user);
	}
	
	/*public List<Stage> findAllStage(){
		
		return getHibernateTemplate().find("from stages");
		
	}*/
}