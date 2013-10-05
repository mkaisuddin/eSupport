package com.mkyong.customer.bo;

import java.util.Date;
import java.util.List;

import com.mkyong.customer.model.Case;

 
public interface CaseBo{
 
	void addCase (Case case1);
	
	List<Case> findCases(long id, String firstName, String lastName, Date fromDate, Date toDate);
 
}