package com.c3s.core.bean;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.event.RowEditEvent;

import com.c3s.core.model.Finance;
import com.c3s.core.model.Projects;
import com.c3s.core.model.SocialCategory;
import com.c3s.core.service.ICommonService;

@ManagedBean
@ViewScoped
public class ClauseBean implements Serializable {

	@ManagedProperty(value = "#{commonService}")
	private ICommonService commonService;
	private List<Projects> projectList;
	private List<Finance> financialList;
	private List<Finance> finfilter;
	private List<Finance> selectfin;

	private List<SocialCategory> ListSocialCategories;
	
	private int projectId;
	private Finance finance;
	private int cashResource;
	private Double cashMoney;
	private int CurrentFinancialYear;


//method to load lists and object for add clause form and search clause
	@PostConstruct
		public void loadData() {
		//initiate object financial for add clause form
		finance = new Finance();
		//create list of projects for add clause that is not define in financial table for current year 
		projectList = commonService.loadProject();
		//create list of social category 
		ListSocialCategories = commonService.loadSocialCategories();
		//get current financial year
		CurrentFinancialYear = commonService.loadCurrentFinYear();
		//get list of financial clause define with cash of current year
		financialList = commonService.loadFinancialClause();
//		System.out.println(financialList.get(0).getMinistryCredit());
		// TODO Auto-generated constructor stub
	}
	//method for redirct to page add clause from button new on search clause form
	public void redir() {
		
		try {
			
			FacesContext.getCurrentInstance().getExternalContext().redirect("addClause.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onRowEdit(RowEditEvent event) {
		financialList.remove(event.getObject());
		commonService.updateObject(event.getObject());
		
		System.out.println("onRowEdit");
//		commonService.updateObject((Finance) event.getObject());
	}
public void deleteFinancial() {
	for(Finance fin  : selectfin) {
		
		commonService.deletObject(fin);
	}
//	commonService.deletObject(event.getObject());
}
//	public void onRowCancel(RowEditEvent event) {
//		commonService.deletObject(event.getObject());
//		System.out.println("RowEditEvent");
//
//	}
	//method for save object financial clause from add clause form
	public void save() {
		
		if (cashResource ==1)
			finance.setMinistryCredit(cashMoney);
		else if (cashResource ==2)
			finance.setPeopleCredit(cashMoney);
		else if (cashResource ==3)
			finance.setOtherCredit(cashMoney);
		finance.setFinancialYearId(CurrentFinancialYear);
		commonService.saveObject(finance);
		finance = new Finance();
		
	}
	public ICommonService getCommonService() {
		return commonService;
	}

	public void setCommonService(ICommonService commonService) {
		this.commonService = commonService;
	}

	public List<Projects> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Projects> projectList) {
		this.projectList = projectList;
	}

//	public int getProjectId() {
//		return projectId;
//	}
//
//	public void setProjectId(int projectId) {
//		this.projectId = projectId;
//	}

	public List<Finance> getFinancialList() {
		return financialList;
	}

	public void setFinancialList(List<Finance> financialList) {
		this.financialList = financialList;
	}

	public List<Finance> getFinfilter() {
		return finfilter;
	}

	public void setFinfilter(List<Finance> finfilter) {
		this.finfilter = finfilter;
	}

	public int getCashResource() {
		return cashResource;
	}
	public void setCashResource(int cashResource) {
		this.cashResource = cashResource;
	}
	public Double getCashMoney() {
		return cashMoney;
	}
	public void setCashMoney(Double cashMoney) {
		this.cashMoney = cashMoney;
	}
	public List<SocialCategory> getListSocialCategories() {
		return ListSocialCategories;
	}
	public void setListSocialCategories(List<SocialCategory> listSocialCategories) {
		ListSocialCategories = listSocialCategories;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public Finance getFinance() {
		return finance;
	}

	public void setFinance(Finance finance) {
		this.finance = finance;
	}

	public int getCurrentFinancialYear() {
		return CurrentFinancialYear;
	}

	public void setCurrentFinancialYear(int currentFinancialYear) {
		CurrentFinancialYear = currentFinancialYear;
	}
	public List<Finance> getSelectfin() {
		return selectfin;
	}
	public void setSelectfin(List<Finance> selectfin) {
		this.selectfin = selectfin;
	}

	
	
}
