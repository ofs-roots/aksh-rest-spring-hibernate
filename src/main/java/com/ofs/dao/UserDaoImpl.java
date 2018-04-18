package com.ofs.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ofs.model.UserDetails;
import com.ofs.util.HibernateUtil;

public class UserDaoImpl {
	
	public int createUser(UserDetails user) {
		int userid = 0;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			userid = (Integer)session.save(user);
			transaction.commit();
			HibernateUtil.getSessionFactory().close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userid;
	}

}
