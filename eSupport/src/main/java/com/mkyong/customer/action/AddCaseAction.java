package com.mkyong.customer.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.bo.CaseBo;
import com.mkyong.customer.form.CaseForm;
import com.mkyong.customer.model.Case;

public class AddCaseAction extends ActionSupport {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		CaseForm caseForm ;
		
		String id = request.getParameter("id");
		
		CaseBo caseBo = (CaseBo) getWebApplicationContext().getBean(
				"caseBo");
		Case case1 = new Case();
		
		if (id != null && !id.equals("")){
			caseForm = (CaseForm) form;
			case1 = caseBo.findCaseById(id);
			
			//caseForm.setPrevDate(case1.getPrevDate().toString());
			caseForm.setComments(case1.getComments());
			caseForm.setCourt(case1.getCourt());
			//caseForm.setClient(case1.getClient());
			caseForm.setSpecialNotes(case1.getSpecialNotes());
			
			return mapping.findForward("caseUpdate");
		}else{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			
			caseForm = (CaseForm) form;
			case1.setCourt(caseForm.getCourt());
			case1.setPrevDate(formatter.parse(caseForm.getPrevDate()));
			case1.setNextDate(formatter.parse(caseForm.getNextDate()));
			case1.setComments(caseForm.getComments());
			case1.setSpecialNotes(caseForm.getSpecialNotes());
			caseBo.addCase(case1);
			return mapping.findForward("success");
		}
		
	}

}