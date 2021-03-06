package com.ofs.service;

import java.util.List;

import com.ofs.model.UserDetails;

public interface UserService {

	int createUser(UserDetails user);
	List<UserDetails> getUsers();
	void update(UserDetails user);
	void delete(int id);
}
