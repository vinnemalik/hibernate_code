package com.cts.GrizzlyStoreHibernate.service;

import java.util.List;

import com.cts.GrizzlyStoreHibernate.bean.Product;
import com.cts.GrizzlyStoreHibernate.dao.ProductDAO;
import com.cts.GrizzlyStoreHibernate.dao.ProductDAOImpl;

public class ProductServiceImpl implements ProductService {
		
		private ProductDAO dao = new ProductDAOImpl();

		@Override
		public String insertProduct(Product product) {
			// TODO Auto-generated method stub
			return dao.insertProduct(product);
		}

		@Override
		public List<Product> getAllProduct() {
			// TODO Auto-generated method stub
			return dao.getAllProduct();
		}
		
		

}
