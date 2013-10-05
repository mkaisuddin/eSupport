package com.mkyong.customer.dao;

import java.util.Date;
import java.util.List;

import com.mkyong.customer.model.Case;

 
public interface CaseDao{
 
	void addCase(Case case1);

	List<Case> findCases(long id, String firstName, String lastName, Date fromDate,
			Date toDate);
	
	//List<Stage> findAllStage();
 
}