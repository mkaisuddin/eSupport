package com.mkyong.customer.bo;

import com.mkyong.customer.model.Advocate;
 
public interface AdvocateBo{
 
	void addAdvocate (Advocate advocate);
	
	Advocate findAdvocate(String userName, String password);
 
}