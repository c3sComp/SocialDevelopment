package com.c3s.core.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c3s.core.dao.ICommonDao;
import com.c3s.core.model.Finance;
import com.c3s.core.model.Projects;
import com.c3s.core.model.SocialCategory;
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

	@Transactional(readOnly = false)
	@Override
	public Users loadUser() {
		return commonDao.loadUser();
	}
	@Transactional(readOnly = false)
	@Override
	public List<Projects> loadProject() {
		// TODO Auto-generated method stub
		return commonDao.loadProject();
	}
	@Transactional(readOnly = false)
	@Override
	public List<Finance> loadFinancialClause() {
		// TODO Auto-generated method stub
		return commonDao.loadFinancialClause();
	}
	@Transactional(readOnly = false)
	@Override
	public void deletObject(Object object) {
		commonDao.deletObject(object);
		
	}
	
	@Transactional(readOnly = false)
	@Override
	public void saveObject(Object object) {
		commonDao.saveObject(object);
		
	}
	
	@Transactional(readOnly = false)
	@Override
	public List<SocialCategory> loadSocialCategories() {
		return commonDao.loadSocialCategories();
	}
	
	@Transactional(readOnly = false)  
	public int loadCurrentFinYear() {
		// TODO Auto-generated method stub
		return commonDao.loadCurrentFinYear();
	}
	@Transactional(readOnly = false)
	@Override
	public void updateObject(Object object) {
		commonDao.updateObject(object);
		
	}
	
	
}
