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

import com.cts.GrizzlyStoreHibernate.util.HibernateUtil;
import com.cts.GrizzlyStoreHibernate.bean.Category;
import com.cts.GrizzlyStoreHibernate.bean.Product;
import com.cts.GrizzlyStoreHibernate.bean.Vendors;
import com.cts.GrizzlyStoreHibernate.util.HibernateUtil;

public class ProductDAOImpl implements ProductDAO{
	
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
	
	public String insertProduct(Product product){
		Session session = null;
		Transaction transaction = null;
		try {
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		transaction.begin();
		session.save(product);
		transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null) {
		        transaction.rollback();
		      }
		      e.printStackTrace();
		}
		finally {
			if (session != null) {
		        session.close();
		      }
		}
		return "Success";
	}
	
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		Transaction transaction = null;
		Session session = null;  
		try {
	    	   session = HibernateUtil.getSessionFactory().openSession();
	         transaction = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<Product> query = builder.createQuery(Product.class);
	         Root<Product> root = query.from(Product.class);
	         query.select(root);
	         Query<Product> q=session.createQuery(query);
	         List<Product> employees=q.getResultList();
	         for (Product employee : employees) {
	            //System.out.println(employee.getName());
	        	 System.out.println(employee.toString());
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
