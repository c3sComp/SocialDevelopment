package com.c3s.core.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.c3s.core.model.Users;

@Repository
public class CommonDao implements ICommonDao,Serializable {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Users loadUser() {
		return (Users) sessionFactory.openSession().load(Users.class, 1);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
