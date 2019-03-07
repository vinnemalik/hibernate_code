package com.cts.GrizzlyStoreHibernate.dao;

import com.cts.GrizzlyStoreHibernate.bean.Login;

public interface LoginDAO {
	public int getUserStatus(String id); 
	public String getUserType(String id);
	public Login authenticate(String userName, String password);
}
