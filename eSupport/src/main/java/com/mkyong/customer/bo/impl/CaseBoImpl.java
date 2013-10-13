package com.mkyong.customer.bo.impl;

import java.text.ParseException;
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

	public List<Case> findCases(String id, String firstName, String lastName,
			String fromDate, String toDate) throws ParseException {
		return caseDao.findCases(id, firstName, lastName, fromDate, toDate);
	}

	public Case findCaseById(String id) throws ParseException {
		return caseDao.findCaseByID(id);
	}
	
 
}