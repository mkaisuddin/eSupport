package com.mkyong.customer.dao.impl;

import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.CaseDao;
import com.mkyong.customer.model.Case;

public class CaseDaoImpl extends HibernateDaoSupport implements CaseDao{
	
	public void addCase(Case case1){
		case1.setCreatedDate(new Date());
		getHibernateTemplate().save(case1);
	}
	
	/*public List<Stage> findAllStage(){
		
		return getHibernateTemplate().find("from stages");
		
	}*/
}