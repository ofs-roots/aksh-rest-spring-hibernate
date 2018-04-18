package com.ofs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.ofs.model.UserDetails;
import com.ofs.util.HibernateUtil;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	HibernateUtil hibernateUtil;
	
	
//	private SessionFactory sessionFactory;
//
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//	
	public int createUser(UserDetails user) {
		int userid = 0;
		try {
			Session session = hibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			userid = (Integer)session.save(user);
			transaction.commit();
			hibernateUtil.getSessionFactory().close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userid;
	}
	
	public List<UserDetails> getUsers(){
		List<UserDetails> userlist = new ArrayList();
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			Criteria cr = session.createCriteria(UserDetails.class);
			userlist = cr.list();
			transaction.commit();
			HibernateUtil.getSessionFactory().close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userlist;
	}

	@Override
	public void update(UserDetails user) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.update(user);
			transaction.commit();
			HibernateUtil.getSessionFactory().close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			UserDetails user = (UserDetails)session.get(UserDetails.class, id);
			session.delete(user);
			transaction.commit();
			HibernateUtil.getSessionFactory().close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
