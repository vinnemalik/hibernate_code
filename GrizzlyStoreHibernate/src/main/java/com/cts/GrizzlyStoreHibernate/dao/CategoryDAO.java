package com.cts.GrizzlyStoreHibernate.dao;

import java.util.List;

import com.cts.GrizzlyStoreHibernate.bean.Category;

public interface CategoryDAO {
	public String getCategoryName();
	public List<Category> getAllCategory();
	public String insertCategory(Category category);
}
