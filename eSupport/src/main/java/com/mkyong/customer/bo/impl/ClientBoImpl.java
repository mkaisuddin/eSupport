package com.mkyong.customer.bo.impl;

import com.mkyong.customer.bo.ClientBo;
import com.mkyong.customer.dao.ClientDao;
import com.mkyong.customer.model.Client;
 
public class ClientBoImpl implements ClientBo{
 
	ClientDao clientDao;
	
	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	public void addClient(Client client){
		
		clientDao.addClient(client);

	}
	
	/*public List<Stage> findAllStage(){
		
		return stageDao.findAllStage();
	}*/
 
}