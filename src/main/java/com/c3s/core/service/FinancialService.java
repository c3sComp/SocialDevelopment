package com.c3s.core.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c3s.core.dao.IFinancialDao;
import com.c3s.core.model.FinancialDocument;

@Service
public class FinancialService implements IFinancialService,Serializable {

	@Autowired
	private IFinancialDao financialDao;

	@Transactional
	@Override
	public List<FinancialDocument> loadFinancialDocuments(Integer docType) {
		return financialDao.loadFinancialDocuments(docType);
	}

	@Transactional
	@Override
	public FinancialDocument loadFinancialDocumentById(Integer id) {
		return financialDao.loadFinancialDocumentById(id);
	}

	public IFinancialDao getFinancialDao() {
		return financialDao;
	}

	public void setFinancialDao(IFinancialDao financialDao) {
		this.financialDao = financialDao;
	}	
	
}
