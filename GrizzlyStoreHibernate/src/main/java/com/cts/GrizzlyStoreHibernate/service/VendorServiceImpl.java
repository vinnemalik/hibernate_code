package com.cts.GrizzlyStoreHibernate.service;

import java.util.List;

import com.cts.GrizzlyStoreHibernate.bean.Vendors;
import com.cts.GrizzlyStoreHibernate.dao.VendorDAO;
import com.cts.GrizzlyStoreHibernate.dao.VendorDAOImpl;

public class VendorServiceImpl implements VendorService {
		
		private VendorDAO dao = new VendorDAOImpl();

		@Override
		public List<Vendors> getAllVendors() {
			// TODO Auto-generated method stub
			return dao.getAllVendors();
		}

		@Override
		public String insertVendors(Vendors vendors) {
			// TODO Auto-generated method stub
			return dao.insertVendors(vendors);
		}
		
		
}
