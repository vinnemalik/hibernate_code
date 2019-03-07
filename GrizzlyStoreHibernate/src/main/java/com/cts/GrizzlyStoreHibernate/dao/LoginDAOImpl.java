package com.cts.GrizzlyStoreHibernate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cts.GrizzlyStoreHibernate.bean.Category;
import com.cts.GrizzlyStoreHibernate.bean.Login;
import com.cts.GrizzlyStoreHibernate.util.HibernateUtil;


public class LoginDAOImpl implements LoginDAO {
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public Login authenticate(String userName, String password) {
		
		
		Session session = null;
		
		try {
			session = sessionFactory.openSession();
			Login emp = session.get(Login.class, userName);
			
			//System.out.println(emp);
			if(emp.getPassword().equals(password))
			{
				return emp;	
			}
			
			}
			catch(Exception e)
			{
			      e.printStackTrace();
			}
			finally {
				if (session != null) {
			        session.close();
			      }
			}
		
		
		return null;
		// TODO Auto-generated method stub
		/*
		String query = " select * from glogin where userid = ? and password = ?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		connection = DBUtils.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				String userId= resultSet.getString(1);
				String pwd= resultSet.getString(2);
				String userType= resultSet.getString(3);
				int	userStatus= resultSet.getInt(4);
				String address= resultSet.getString(5);
				String name= resultSet.getString(6);
				String designation= resultSet.getString(7);
				int id= resultSet.getInt(8);
				String contactno= resultSet.getString(9);
				Login login = new Login(userId, pwd, userType, userStatus, address, name, designation, id, contactno);
				return login;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;*/
	}

	@Override
	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		
		Transaction transaction = null;
	      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	         transaction = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<Login> query = builder.createQuery(Login.class);
	         Root<Login> root = query.from(Login.class);
	         query.select(root);
	         Query<Login> q=session.createQuery(query);
	         List<Login> cats =q.getResultList();
	         for (Login cat : cats) {
	            
	            return cat.getUserStatus();
	         }
	         transaction.commit();
	      } catch (Exception e) {
	         e.printStackTrace();
	         if (transaction != null) {
	            transaction.rollback();
	         }
	      }
		return 0;
		
	}

	@Override
	public String getUserType(String id) {
		// TODO Auto-generated method stub
		Transaction transaction = null;
	      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	         transaction = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<Login> query = builder.createQuery(Login.class);
	         Root<Login> root = query.from(Login.class);
	         query.select(root);
	         Query<Login> q=session.createQuery(query);
	         List<Login> cats =q.getResultList();
	         for (Login cat : cats) {
	            
	            return cat.getUserType();
	         }
	         transaction.commit();
	      } catch (Exception e) {
	         e.printStackTrace();
	         if (transaction != null) {
	            transaction.rollback();
	         }
	      }
		return null;
	}

}
