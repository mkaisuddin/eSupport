package com.mkyong.customer.action;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.bo.CaseBo;
import com.mkyong.customer.form.AdvanceSearchForm;
import com.mkyong.customer.model.Case;

public class AdvanceSearchAction extends ActionSupport {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		CaseBo caseBo = (CaseBo) getWebApplicationContext().getBean(
				"caseBo");
		
		AdvanceSearchForm advanceSearchForm = (AdvanceSearchForm) form;
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Case> list = caseBo.findCases(Long.parseLong(advanceSearchForm.getId()), advanceSearchForm.getFirstName(), advanceSearchForm.getLastName(), 
				formatter.parse(advanceSearchForm.getFromDate()), formatter.parse(advanceSearchForm.getToDate()));
		
		advanceSearchForm.setCaseList(list);
		request.setAttribute("customerList", list);

		return mapping.findForward("success");

	}

}