package com.mkyong.customer.bo;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.mkyong.customer.model.Case;

 
public interface CaseBo{
 
	void addCase (Case case1);
	
	List<Case> findCases(String id, String firstName, String lastName, String fromDate, String toDate) throws ParseException;
	
	Case findCaseById(String id) throws ParseException;
 
}