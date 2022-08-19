package com.nagarro.service;

import com.nagarro.entity.User;

public interface UserService {
	void saveUser(User user);

	boolean validateUser(User user);

	void updateUser(User user);
}
