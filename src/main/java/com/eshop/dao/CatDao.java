package com.eshop.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;




@Repository
public class CatDao {
	@Autowired
	 SessionFactory sessionFactory;
	public void insertCategory(CategoryDetails ct)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		System.out.println(ct.getCategoryId());
		session.save(ct); 
		t.commit();
		
	}
	public  List retriveCategory()
	{
	Session session=sessionFactory.openSession();
	Transaction t=session.beginTransaction();
	String hql="from CategoryDetails";
	Query query=session.createQuery(hql);
	List results= query.list();
	System.out.println(results );
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
	
}
