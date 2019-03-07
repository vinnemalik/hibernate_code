package com.cts.GrizzlyStoreHibernate.service;

import com.cts.GrizzlyStoreHibernate.bean.Login;

public interface LoginService {
	public int getUserStatus(String id); 
	public String getUserType(String id);
	public Login authenticate(String userName, String password);
	public String authorization ( String id);
}
