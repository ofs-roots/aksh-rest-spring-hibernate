package com.ofs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ofs.dao.UserDao;
import com.ofs.dao.UserDaoImpl;
import com.ofs.model.UserDetails;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userdao;
	
	public int createUser(UserDetails user) {
		return userdao.createUser(user);
		
	}

	@Override
	public List<UserDetails> getUsers() {
		return userdao.getUsers();
	}

	@Override
	public void update(UserDetails user) {
		 userdao.update(user);
	}

	@Override
	public void delete(int id) {
		userdao.delete(id);
		
	}
	

}
