package com.mkyong.customer.dao;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.mkyong.customer.model.Case;

 
public interface CaseDao{
 
	void addCase(Case case1);

	List<Case> findCases(String id, String firstName, String lastName, String fromDate,
			String toDate) throws ParseException;

	Case findCaseByID(String id);
	
	//List<Stage> findAllStage();
 
}