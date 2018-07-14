package com.c3s.core.service;

import java.util.List;

import com.c3s.core.model.FinancialDocument;

/**
 * This interface contains all services specific to financial module
 * @author C3S
 *
 */
public interface IFinancialService {

	/**
	 * Load all financial documents (credit or debit) for a financial year
	 * @param docType 
	 * @return
	 */
	public List<FinancialDocument> loadFinancialDocuments(Integer docType);

	/**
	 * Load a specific financial document by id
	 * @param id
	 * @return
	 */
	public FinancialDocument loadFinancialDocumentById(Integer id);

}
