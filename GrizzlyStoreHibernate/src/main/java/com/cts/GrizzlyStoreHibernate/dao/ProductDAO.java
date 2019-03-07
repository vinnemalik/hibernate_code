package com.cts.GrizzlyStoreHibernate.dao;

import java.util.List;


import com.cts.GrizzlyStoreHibernate.bean.Product;

public interface ProductDAO {
	public String insertProduct(Product product);
	public List<Product> getAllProduct();
}
