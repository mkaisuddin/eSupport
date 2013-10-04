package com.mkyong.customer.bo.impl;

import com.mkyong.customer.bo.UserBo;
import com.mkyong.customer.dao.UserDao;
import com.mkyong.customer.model.User;
 
public class UserBoImpl implements UserBo{
 
	UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user){
		
		userDao.addUser(user);

	}
	
	/*public List<Stage> findAllStage(){
		
		return stageDao.findAllStage();
	}*/
 
}