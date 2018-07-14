package com.c3s.core.bean;

import static com.c3s.core.util.Utils.addDetailMessage;
import static com.c3s.template.util.Assert.has;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Faces;

import com.c3s.core.infra.model.Filter;
import com.c3s.core.model.FinancialDocument;
import com.c3s.core.service.ICommonService;
import com.c3s.core.service.IFinancialService;
import com.c3s.core.util.FinancialDocType;
import com.c3s.template.exception.BusinessException;

/**
 * This bean will manage the credit and debit financial documents
 * 
 * @author C3S
 *
 */
@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class FinancialDocumentBean implements Serializable {

	@ManagedProperty(value = "#{commonService}")
	private ICommonService commonService;
	@ManagedProperty(value = "#{financialService}")
	private IFinancialService financialService;
	private List<FinancialDocument> documents;
	private Filter<FinancialDocument> filter1 = new Filter<>(new FinancialDocument());
	private List<FinancialDocument> selectedDocuments;
	private List<FinancialDocument> filteredDocuments;
	private FinancialDocument financialDocument;
	private Integer docType;
	private Integer id;

	/**
	 * Init method for search screen
	 */

	public void initDataModel() {
		docType = FinancialDocType.CREDIT.getType();
		documents = financialService.loadFinancialDocuments(docType);
	}

	/**
	 * Load selected document by his id
	 * 
	 * @param id
	 */
	public void findDocumentByNo(Integer id) {
		if (id == null) {
			throw new BusinessException("Provide Car ID to load");
		}
		FinancialDocument document = documents.stream().filter(doc -> doc.getDocNo().equals(id)).findFirst()
				.orElseThrow(() -> new BusinessException("Car not found with id " + id));
		selectedDocuments.add(document);
	}

	/**
	 * Delete selected document from list
	 */
	public void delete() {

	}
	
	/**
	 * Redirect to consult page
	 * @param id
	 * @return
	 */
	public String goToAdd(Integer id) {
		return "/finance/financial-document-form.xhtml?id="+id+"&faces-redirect=true";
	}

	/**
	 * View action for add or update form
	 */
	public void init() {
		if (Faces.isAjaxRequest()) {
			return;
		}
		if (has(id)) {
			financialDocument = financialService.loadFinancialDocumentById(id);
		} else {
			financialDocument = new FinancialDocument();
		}
	}
	   
	/**
	 * Save new financial document
	 */
	public void save() {
		String msg;
		if (financialDocument.getId() == null) {
			commonService.saveModel(financialDocument);
			msg = "financialDocument " + financialDocument.getDocOwner() + " created successfully";
		} else {
			commonService.updateModel(financialDocument);
			msg = "Car " + financialDocument.getDocOwner() + " updated successfully";
		}
		addDetailMessage(msg);
	}

	/**
	 * Reset fields
	 */
	public void clearData() {
		financialDocument = new FinancialDocument();
		id = null;
	}

	/**
	 * Check if add or update mode
	 * 
	 * @return
	 */
	public boolean isNew() {
		return financialDocument == null || financialDocument.getId() == null;
	}

	/**
	 * Delete financial document
	 * 
	 * @throws IOException
	 */
	public void remove() throws IOException {
		if (has(financialDocument) && has(financialDocument.getId())) {
			commonService.deleteModel(financialDocument);
			addDetailMessage("financialDocument " + financialDocument.getDocOwner() + " removed successfully");
			Faces.getFlash().setKeepMessages(true);
			Faces.redirect("financial-document-list.xhtml");
		}
	}

	/**
	 * Getters and setters
	 */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<FinancialDocument> getDocuments() {
		return documents;
	}

	public void setDocuments(List<FinancialDocument> documents) {
		this.documents = documents;
	}

	public Filter<FinancialDocument> getFilter1() {
		return filter1;
	}

	public void setFilter1(Filter<FinancialDocument> filter1) {
		this.filter1 = filter1;
	}

	public List<FinancialDocument> getSelectedDocuments() {
		return selectedDocuments;
	}

	public void setSelectedDocuments(List<FinancialDocument> selectedDocuments) {
		this.selectedDocuments = selectedDocuments;
	}

	public List<FinancialDocument> getFilteredDocuments() {
		return filteredDocuments;
	}

	public void setFilteredDocuments(List<FinancialDocument> filteredDocuments) {
		this.filteredDocuments = filteredDocuments;
	}

	public ICommonService getCommonService() {
		return commonService;
	}

	public void setCommonService(ICommonService commonService) {
		this.commonService = commonService;
	}

	public FinancialDocument getFinancialDocument() {
		return financialDocument;
	}

	public void setFinancialDocument(FinancialDocument financialDocument) {
		this.financialDocument = financialDocument;
	}

	public Integer getDocType() {
		return docType;
	}

	public void setDocType(Integer docType) {
		this.docType = docType;
	}

	public IFinancialService getFinancialService() {
		return financialService;
	}

	public void setFinancialService(IFinancialService financialService) {
		this.financialService = financialService;
	}
}
