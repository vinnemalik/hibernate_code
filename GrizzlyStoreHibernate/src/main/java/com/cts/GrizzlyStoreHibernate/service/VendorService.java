package com.cts.GrizzlyStoreHibernate.service;

import java.util.List;

import com.cts.GrizzlyStoreHibernate.bean.Vendors;

public interface VendorService {
	
	public List<Vendors> getAllVendors();
	public String insertVendors(Vendors vendors);

}
