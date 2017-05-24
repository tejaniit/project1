package com.eshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.UserCredentials;
import com.eshop.model.UserDetails;

@Repository

public class RegDao {
	@Autowired
	 SessionFactory sessionFactory;
	public void insertUser(UserDetails ud)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(ud); 
		t.commit();
		
	}
	public void insertUserCredentials(UserCredentials uc)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(uc); 
		t.commit();
		session.close();
		
	}
}
