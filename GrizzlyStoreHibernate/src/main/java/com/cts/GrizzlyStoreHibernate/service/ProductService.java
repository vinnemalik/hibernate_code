package com.cts.GrizzlyStoreHibernate.service;

import java.util.List;

import com.cts.GrizzlyStoreHibernate.bean.Product;

public interface ProductService {
	
	public String insertProduct(Product product);
	public List<Product> getAllProduct();
		
}
