package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;

@Repository
public class CartDao {

	@Autowired
	 SessionFactory sessionFactory;
	public void insertcart(CartDetails c)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(c); 
		t.commit();
		session.close();
		
	}
	
	public  List retrivecart(String username)
	{
	Session session=sessionFactory.openSession();
	Transaction t=session.beginTransaction();
	String hql="from "+" CartDetails "+" where cartUser=" + "'"+username+"'";
	Query query=session.createQuery(hql);
	List results= query.list();
	System.out.println(results );
	session.close();
	return results;
	
		
	}
	
}
