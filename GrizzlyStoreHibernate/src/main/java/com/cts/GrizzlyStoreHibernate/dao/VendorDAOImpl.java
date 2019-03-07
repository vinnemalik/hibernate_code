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

import com.cts.GrizzlyStoreHibernate.bean.Product;
import com.cts.GrizzlyStoreHibernate.bean.Vendors;
import com.cts.GrizzlyStoreHibernate.util.HibernateUtil;

public class VendorDAOImpl implements VendorDAO {
		
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		public List<Vendors> getAllVendors() {
			// TODO Auto-generated method stub
			Transaction transaction = null;
			Session session = null;  
			try {
		    	   session = HibernateUtil.getSessionFactory().openSession();
		         transaction = session.beginTransaction();

		         CriteriaBuilder builder = session.getCriteriaBuilder();
		         CriteriaQuery<Vendors> query = builder.createQuery(Vendors.class);
		         Root<Vendors> root = query.from(Vendors.class);
		         query.select(root);
		         Query<Vendors> q=session.createQuery(query);
		         List<Vendors> employees=q.getResultList();
		         for (Vendors employee : employees) {
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

		@Override
		public String insertVendors(Vendors vendors) {
			// TODO Auto-generated method stub
			Session session = null;
			Transaction transaction = null;
			try {
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.save(vendors);
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
		
}

