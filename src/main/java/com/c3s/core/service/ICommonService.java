package com.c3s.core.service;

import java.util.List;

import com.c3s.core.model.Finance;
import com.c3s.core.model.Projects;
import com.c3s.core.model.SocialCategory;
import com.c3s.core.model.Users;

public interface ICommonService {

	public Users loadUser();

	public List<Projects> loadProject();

	public List<Finance> loadFinancialClause();

	public void deletObject(Object object);

	public void saveObject(Object object);

	public List<SocialCategory> loadSocialCategories();

	public int loadCurrentFinYear();

	public void updateObject(Object object);
}
