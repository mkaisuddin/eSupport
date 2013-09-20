package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.Stage;
 
public interface StageDao{
 
	void addStage(Stage stage);
	
	List<Stage> findAllStage();
 
}