package com.cts.GrizzlyStoreHibernate.service;

import com.cts.GrizzlyStoreHibernate.bean.Login;
import com.cts.GrizzlyStoreHibernate.dao.LoginDAO;
import com.cts.GrizzlyStoreHibernate.dao.LoginDAOImpl;
import com.cts.GrizzlyStoreHibernate.service.LoginService;
import com.cts.GrizzlyStoreHibernate.service.LoginServiceImpl;

public class LoginServiceImpl implements LoginService {
	
	private LoginDAO dao = new LoginDAOImpl();
	
	@Override
	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(userName, password);
	}
	@Override
	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return dao.getUserStatus(id);
	}
	@Override
	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return dao.getUserType(id);
	}
	@Override
	public String authorization(String id) {
		// TODO Auto-generated method stub
		return dao.getUserType(id);
	}
}
