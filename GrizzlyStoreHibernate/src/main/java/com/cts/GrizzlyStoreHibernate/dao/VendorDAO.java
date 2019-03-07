package com.cts.GrizzlyStoreHibernate.dao;

import java.util.List;


import com.cts.GrizzlyStoreHibernate.bean.Vendors;

public interface VendorDAO {
	public List<Vendors> getAllVendors();
	public String insertVendors(Vendors vendors);
}
