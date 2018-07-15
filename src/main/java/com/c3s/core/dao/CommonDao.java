package com.c3s.core.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.c3s.core.model.Finance;
import com.c3s.core.model.FinancialYears;
import com.c3s.core.model.Projects;
import com.c3s.core.model.SocialCategory;
import com.c3s.core.model.Users;

@Repository
public class CommonDao extends HibernateTemplate implements ICommonDao,Serializable {
	
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

	@Override
	public List<Projects> loadProject() {
//		DetachedCriteria subCriteria= DetachedCriteria.forClass(Finance.class);
//	     subCriteria.add(Property.forName("financialYearId").eq("1"));
//	     subCriteria.setProjection(Projections.property("company_id "));
//
//	DetachedCriteria criteria = DetachedCriteria.forClass(Projects.class);
//	     criteria.add(Property.forName("id").notIn(subCriteria));

//	     return getHibernateTemplate().findByCriteria(criteria);
	     
//		Query query = sessionFactory.getCurrentSession().createQuery(hql);
//		query.setParameter("deptId", deptId);
//		if (!query.list().isEmpty() && query.list() != null)
//			return query.list();
//		else
//			return new ArrayList<User>();
//		return	loadAll(Projects.class);
//		String query ="(SELECT * FROM `projects`  WHERE `id` NOT IN (SELECT `project_id` FROM `finance` )";
	     List<Projects> projectList = new ArrayList<>();
	     String hql = "from  projects proj where proj.id not in (SELECT  fin.projectId  FROM  finance fin) ";
//		
//		String hql = Utils.readQuery("findAllUsers");
		Query query1 = sessionFactory.getCurrentSession().createQuery(hql);
		projectList = query1.list();
		return projectList;
// sessionFactory.getCurrentSession().loadall		return null;
	}

	@Override
	public List<Finance> loadFinancialClause() {
		// TODO Auto-generated method stub
		List<Finance> financesList = new ArrayList<>();
		financesList =  loadAll(Finance.class);
		if (!financesList.isEmpty() && financesList != null ) {
			return financesList;
			
		}
		else {
			  return null;
		}		
	}

	@Override
	public void deletObject(Object object) {
		delete(object);
//		clear();
	}

	@Override
	public void saveObject(Object object) {
		save(object);
		
	}

	@Override
	public List<SocialCategory> loadSocialCategories() {
		// TODO Auto-generated method stub
		return loadAll(SocialCategory.class);
	}

	@Override
	public int loadCurrentFinYear() {
Criteria criteria = sessionFactory.getCurrentSession().createCriteria(FinancialYears.class);
criteria.add(Restrictions.eq("opened", 1));
criteria.setProjection(Projections.max("id"));
int i = (int) criteria.uniqueResult();
return i;
	}

	@Override
	public void updateObject(Object object) {
		update(object);
		
	}

}
