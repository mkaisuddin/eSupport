package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.Stage;
 
public interface StageBo{
 
	void addStage(Stage stage);
	
	List<Stage> findAllStage();
 
}