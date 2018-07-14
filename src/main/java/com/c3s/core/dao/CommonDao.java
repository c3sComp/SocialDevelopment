package com.c3s.core.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.c3s.core.model.FinancialDocument;
import com.c3s.core.model.Users;

@Repository
public class CommonDao extends HibernateTemplate implements ICommonDao,Serializable {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveModel(Object model) {
		save(model);
	}

	@Override
	public void updateModel(Object model) {
		update(model);
	}

	@Override
	public void deleteModel(Object model) {
		delete(model);
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
