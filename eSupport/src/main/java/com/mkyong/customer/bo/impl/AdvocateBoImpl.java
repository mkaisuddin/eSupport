package com.mkyong.customer.bo.impl;

import com.mkyong.customer.bo.AdvocateBo;
import com.mkyong.customer.dao.AdvocateDao;
import com.mkyong.customer.model.Advocate;
 
public class AdvocateBoImpl implements AdvocateBo{
 
	AdvocateDao advocateDao;
	
	public void setAdvocateDao(AdvocateDao advocateDao) {
		this.advocateDao = advocateDao;
	}

	public void addAdvocate(Advocate advocate){
		
		advocateDao.addAdvocate(advocate);

	}

	public Advocate findAdvocate(String userName, String password) {
		return advocateDao.findAdvocate(userName, password);
	}
	
	/*public List<Stage> findAllStage(){
		
		return stageDao.findAllStage();
	}*/
 
}