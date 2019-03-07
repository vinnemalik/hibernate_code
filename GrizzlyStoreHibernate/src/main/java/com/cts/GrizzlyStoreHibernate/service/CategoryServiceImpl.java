package com.cts.GrizzlyStoreHibernate.service;

import java.util.List;

import com.cts.GrizzlyStoreHibernate.bean.Category;
import com.cts.GrizzlyStoreHibernate.dao.CategoryDAO;
import com.cts.GrizzlyStoreHibernate.dao.CategoryDAOImpl;;

public class CategoryServiceImpl implements CategoryService{
		
		private CategoryDAO dao = new CategoryDAOImpl();

		@Override
		public String getCategoryName() {
			// TODO Auto-generated method stub
			return dao.getCategoryName();
		}

		@Override
		public List<Category> getAllCategory() {
			// TODO Auto-generated method stub
			return dao.getAllCategory();
		}

		@Override
		public String insertCategory(Category category) {
			// TODO Auto-generated method stub
			return dao.insertCategory(category);
		}
		

		
}
