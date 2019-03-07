package com.cts.GrizzlyStoreHibernate.dao;

import java.util.List;
import javax.persistence.criteria.*;
import org.hibernate.*;
import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cts.GrizzlyStoreHibernate.bean.Category;
import com.cts.GrizzlyStoreHibernate.util.HibernateUtil;

import com.cts.GrizzlyStoreHibernate.bean.Category;
import com.cts.GrizzlyStoreHibernate.bean.Login;
import com.cts.GrizzlyStoreHibernate.util.HibernateUtil;





public class CategoryDAOImpl implements CategoryDAO {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public String getCategoryName() {
		// TODO Auto-generated method stub\
		
		Transaction transaction = null;
	      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	         transaction = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<Category> query = builder.createQuery(Category.class);
	         Root<Category> root = query.from(Category.class);
	         query.select(root);
	         Query<Category> q=session.createQuery(query);
	         List<Category> cats =q.getResultList();
	         for (Category cat : cats) {
	            System.out.println(cat.getName());
	        
	         }
	         transaction.commit();
	         return "Success OF getCategoryName-----------------------------";
	      } catch (Exception e) {
	         e.printStackTrace();
	         if (transaction != null) {
	            transaction.rollback();
	         }
	      }
		return "null of getCategoryName";
	}
	
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		Transaction transaction = null;
	      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	         transaction = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<Category> query = builder.createQuery(Category.class);
	         Root<Category> root = query.from(Category.class);
	         query.select(root);
	         Query<Category> q=session.createQuery(query);
	         List<Category> employees=q.getResultList();
	         for (Category employee : employees) {
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
	
	public String insertCategory(Category category) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		try {
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		transaction.begin();
		session.save(category);
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
		return "null of insertCategory";
	}

}
