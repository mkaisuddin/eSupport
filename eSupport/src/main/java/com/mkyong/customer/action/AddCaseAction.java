package com.mkyong.customer.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		CaseBo caseBo = (CaseBo) getWebApplicationContext().getBean(
				"caseBo");
		
		CaseForm caseForm = (CaseForm) form;
		
		Case case1 = new Case();
		
		case1.setCourt(caseForm.getCourt());
		case1.setCreatedDate(new Date());
		caseBo.addCase(case1);

		return mapping.findForward("success");

	}

}