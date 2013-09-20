package com.mkyong.customer.bo.impl;

import com.mkyong.customer.bo.CourtBo;
import com.mkyong.customer.dao.CourtDao;
import com.mkyong.customer.model.Court;
 
public class CourtBoImpl implements CourtBo{
 
	CourtDao courtDao;
	
	public void setCourtDao(CourtDao courtDao) {
		this.courtDao = courtDao;
	}

	public void addCourt(Court court){
		
		courtDao.addCourt(court);

	}
	
	/*public List<Stage> findAllStage(){
		
		return stageDao.findAllStage();
	}*/
 
}