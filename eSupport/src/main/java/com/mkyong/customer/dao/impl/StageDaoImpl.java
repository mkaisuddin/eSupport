package com.mkyong.customer.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.StageDao;
import com.mkyong.customer.model.Stage;

public class StageDaoImpl extends HibernateDaoSupport implements StageDao{
	
	public void addStage(Stage stage){
		
		//stage.setActive(true);
		stage.setCreatedDate(new Date());
		getHibernateTemplate().save(stage);

	}
	
	public List<Stage> findAllStage(){
		
		return getHibernateTemplate().find("from stages");
		
	}
}