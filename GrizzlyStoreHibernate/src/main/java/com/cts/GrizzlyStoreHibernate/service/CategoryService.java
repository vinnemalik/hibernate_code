package com.cts.GrizzlyStoreHibernate.service;

import java.util.List;

import com.cts.GrizzlyStoreHibernate.bean.Category;

public interface CategoryService {
	public String getCategoryName();
	public List<Category> getAllCategory();
	public String insertCategory(Category category);
}
