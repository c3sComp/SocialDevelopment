package com.c3s.core.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.c3s.core.model.FinancialDocument;

@Repository
public class FinancialDao extends HibernateTemplate implements IFinancialDao,Serializable {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FinancialDocument> loadFinancialDocuments(Integer docType) {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(FinancialDocument.class);
		crit.add(Restrictions.eq("docType", docType));
		return crit.list();
	}

	@Override
	@Transactional
	public FinancialDocument loadFinancialDocumentById(Integer id) {
		return (FinancialDocument) sessionFactory.openSession().load(FinancialDocument.class, id);
	}

}
