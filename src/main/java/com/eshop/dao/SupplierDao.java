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
import com.eshop.model.SupplierDetails;
@Repository
public class SupplierDao {

	@Autowired
	 SessionFactory sessionFactory;
	public void insertSupplier(SupplierDetails ss)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.saveOrUpdate(ss);
		t.commit();
		session.close();
		
		
	}
	
	public  List retriveSupplier()
	{
	Session session=sessionFactory.openSession();
	Transaction t=session.beginTransaction();
	String hql="from SupplierDetails";
	Query query=session.createQuery(hql);
	List results= query.list();
	System.out.println(results );
	session.close();
	return results;
	
		
	}
	public void deletsupplier(int sid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		SupplierDetails s=(SupplierDetails)session.get(SupplierDetails.class, sid);
		System.out.println(s);
		session.delete(s);
		t.commit();
		session.close();
	}
	
	public  SupplierDetails editsupplier(int sid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		SupplierDetails s=(SupplierDetails)session.get(SupplierDetails.class, sid);
		return s;
	}
	
	
}
