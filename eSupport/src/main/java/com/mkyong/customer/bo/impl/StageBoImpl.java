package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.StageBo;
import com.mkyong.customer.dao.StageDao;
import com.mkyong.customer.model.Stage;
 
public class StageBoImpl implements StageBo{
 
	StageDao stageDao;
	
	public void setStageDao(StageDao stageDao) {
		this.stageDao = stageDao;
	}

	public void addStage(Stage stage){
		
		stageDao.addStage(stage);

	}
	
	public List<Stage> findAllStage(){
		
		return stageDao.findAllStage();
	}
 
}