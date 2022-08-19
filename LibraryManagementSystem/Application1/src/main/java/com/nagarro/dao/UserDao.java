package com.nagarro.dao;

import com.nagarro.entity.User;

public interface UserDao {
	void saveUser(User user);

	boolean validateUser(User user);

	void updateUser(User user);
}
