package com.mkyong.customer.bo.impl;

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
	
	/*public List<Stage> findAllStage(){
		
		return stageDao.findAllStage();
	}*/
 
}