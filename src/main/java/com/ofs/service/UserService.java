package com.ofs.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ofs.dao.UserDaoImpl;
import com.ofs.model.UserDetails;

public class UserService {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate.cfg.xml");
	UserDaoImpl userdao = context.getBean(UserDaoImpl.class);
	
	public int createUser(UserDetails user) {
		return userdao.createUser(user);
		
	}
	

}
