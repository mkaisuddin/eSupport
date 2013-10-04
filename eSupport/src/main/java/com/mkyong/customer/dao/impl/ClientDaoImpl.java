package com.mkyong.customer.dao.impl;

import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.ClientDao;
import com.mkyong.customer.model.Client;

public class ClientDaoImpl extends HibernateDaoSupport implements ClientDao{
	
	public void addClient(Client client){
		client.setCreatedDate(new Date());
		getHibernateTemplate().save(client);
	}
	
	/*public List<Stage> findAllStage(){
		
		return getHibernateTemplate().find("from stages");
		
	}*/
}