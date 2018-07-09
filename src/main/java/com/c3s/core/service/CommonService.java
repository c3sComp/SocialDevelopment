package com.c3s.core.service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c3s.core.dao.ICommonDao;
import com.c3s.core.model.Users;

@Service
public class CommonService implements ICommonService,Serializable {

	@Autowired
	private ICommonDao commonDao;

	public ICommonDao getCommonDao() {
		return commonDao;
	}

	public void setCommonDao(ICommonDao commonDao) {
		this.commonDao = commonDao;
	}

	@Transactional
	@Override
	public Users loadUser() {
		return commonDao.loadUser();
	}
	
	
}
