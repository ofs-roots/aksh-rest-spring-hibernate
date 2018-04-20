package com.ofs.dao;

import java.util.List;

import com.ofs.model.UserDetails;

public interface UserDao {
	
	int createUser(UserDetails user);
	List<UserDetails> getUsers();
	void update(UserDetails user);
	void delete(int id);
}
