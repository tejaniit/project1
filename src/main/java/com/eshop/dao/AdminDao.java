package com.eshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.AdminDetails;
import com.eshop.model.CategoryDetails;

@Repository
public class AdminDao {

	@Autowired
	 SessionFactory sessionFactory;
	public void insertUser(AdminDetails a)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(a); 
		t.commit();
		
	}
}
