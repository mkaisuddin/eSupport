package com.mkyong.customer.bo.impl;

import java.util.Date;
import java.util.List;

import com.mkyong.customer.bo.CaseBo;
import com.mkyong.customer.dao.CaseDao;
import com.mkyong.customer.model.Case;
 
public class CaseBoImpl implements CaseBo{
 
	CaseDao caseDao;
	
	public void setCaseDao(CaseDao caseDao) {
		this.caseDao = caseDao;
	}

	public void addCase(Case case1){
		
		caseDao.addCase(case1);

	}

	public List<Case> findCases(long id, String firstName, String lastName,
			Date fromDate, Date toDate) {
		return caseDao.findCases(id, firstName, lastName, fromDate, toDate);
	}
	
 
}