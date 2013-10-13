package com.mkyong.customer.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.customer.dao.CaseDao;
import com.mkyong.customer.model.Case;

public class CaseDaoImpl extends HibernateDaoSupport implements CaseDao {

	public void addCase(Case case1) {
		case1.setCreatedDate(new Date());
		getHibernateTemplate().save(case1);
	}

	public List<Case> findCases(String id, String firstName, String lastName,
			String fromDate, String toDate) throws ParseException {

		Criteria criteria = getSession().createCriteria(Case.class);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		if (id != null && !id.equals("")) {

			criteria.add(Restrictions.eq("id", Long.parseLong(id)));
		}
		if (firstName != null && !firstName.equals("")) {
			criteria.add(Restrictions.eq("Client", firstName));
		}
		if (lastName != null && !lastName.equals("")) {
			criteria.add(Restrictions.eq("lastName", lastName));
		}
		if (fromDate != null && !fromDate.equals("") && toDate != null
				&& !toDate.equals("")) {
			criteria.add(Restrictions.between("nextDate",
					formatter.parse(fromDate), formatter.parse(toDate)));
		}
		/*
		 * if (toDate != null && !toDate.equals("")) {
		 * criteria.add(Restrictions.eq("toDate", formatter.parse(toDate))); }
		 */

		List case1 = criteria.list();

		return case1;
	}

	public Case findCaseByID(String id) {
		
		List<Case> case1 =  getSession().createCriteria(Case.class).add(Restrictions.eq("id", Long.parseLong(id))).list();
							
		return case1.get(0);
	}

	/*
	 * public List<Stage> findAllStage(){
	 * 
	 * return getHibernateTemplate().find("from stages");
	 * 
	 * }
	 */
}