package com.mkyong.customer.dao;

import com.mkyong.customer.model.Advocate;
 
public interface AdvocateDao{
 
	void addAdvocate(Advocate Advocate);

	Advocate findAdvocate(String userName, String password);
	
	//List<Stage> findAllStage();
 
}