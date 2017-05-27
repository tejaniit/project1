package com.eshop.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CartDetails;
import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;




@Repository
public class CategoryDao {
	@Autowired
	 SessionFactory sessionFactory;
	public void insertCategory(CategoryDetails c)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		
		session.saveOrUpdate(c);
		t.commit();
		session.close();
		
	}
	public  List retriveCategory()
	{
	Session session=sessionFactory.openSession();
	Transaction t=session.beginTransaction();
	String hql="from CategoryDetails";
	Query query=session.createQuery(hql);
	List results= query.list();
	System.out.println(results );
	session.close();
	return results;
	
		
	}
	
	public void deletcategory(int cid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		CategoryDetails c=(CategoryDetails)session.get(CategoryDetails.class, cid);
		System.out.println(c);
		session.delete(c);
		t.commit();
		session.close();
	}
	
	public CategoryDetails editcategory(int cid)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		CategoryDetails c=(CategoryDetails)session.get(CategoryDetails.class, cid);
		return c;
	}
	
	
}
