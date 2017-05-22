package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;

@Repository
public class ProdDao {

	@Autowired
	 SessionFactory sessionFactory;
	public void insertprod(ProductDetails pp)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		System.out.println(pp.getProductId());
		session.saveOrUpdate(pp); 
		t.commit();
		session.close();
		
	}
	public  List retriveProd()
	{
	Session session=sessionFactory.openSession();
	Transaction t=session.beginTransaction();
	String hql="from ProductDetails";
	Query query=session.createQuery(hql);
	List results= query.list();
	System.out.println(results );
	session.close();
	return results;
	
		
	}
	public void deletproduct(int pid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		ProductDetails p=(ProductDetails)session.get(ProductDetails.class, pid);
		System.out.println(p);
		session.delete(p);
		t.commit();
		session.close();
	}
	
	public ProductDetails editproduct(int pid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		ProductDetails p=(ProductDetails)session.get(ProductDetails.class, pid);
		return p;
	}
	
}
  