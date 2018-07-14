package com.c3s.core.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c3s.core.dao.ICommonDao;

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

	@Override
	public void saveModel(Object model) {
		commonDao.saveModel(model);
	}

	@Override
	public void updateModel(Object model) {
		commonDao.updateModel(model);
	}

	@Override
	public void deleteModel(Object model) {
		commonDao.deleteModel(model);
	}	
	
}
