package com.c3s.core.dao;

import java.util.List;

import com.c3s.core.model.Finance;
import com.c3s.core.model.Projects;
import com.c3s.core.model.SocialCategory;
import com.c3s.core.model.Users;

public interface ICommonDao {

	Users loadUser();

	List<Projects> loadProject();

	List<Finance> loadFinancialClause();

	void deletObject(Object object);

	void saveObject(Object object);

	List<SocialCategory> loadSocialCategories();

	int loadCurrentFinYear();

	void updateObject(Object object);

}
