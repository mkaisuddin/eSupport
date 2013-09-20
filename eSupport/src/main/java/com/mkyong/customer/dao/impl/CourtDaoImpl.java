package com.mkyong.customer.dao.impl;

import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.CourtDao;
import com.mkyong.customer.model.Court;

public class CourtDaoImpl extends HibernateDaoSupport implements CourtDao{
	
	public void addCourt(Court court){
		
		//stage.setActive(true);
		court.setCreatedDate(new Date());
		getHibernateTemplate().save(court);

	}
	
	/*public List<Stage> findAllStage(){
		
		return getHibernateTemplate().find("from stages");
		
	}*/
}