package com.mkyong.customer.action;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.bo.StageBo;
import com.mkyong.customer.form.StageForm;
import com.mkyong.customer.model.Stage;
 
public class AddStageAction extends ActionSupport{
 
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response) 
        throws Exception {
 
		StageBo stageBo =
			(StageBo) getWebApplicationContext().getBean("stageBo");
		
		StageForm StageForm = (StageForm)form;
		Stage stage = new Stage();
		
		//copy StageForm to model
		BeanUtils.copyProperties(stage, StageForm);
		
		//save it
		stageBo.addStage(stage);
	        
		return mapping.findForward("success");
	  
	}
 
}