package com.pack.ipem.Dao;

import com.pack.ipem.bean.User;

public interface UserDao {

	void addUser(User user);
	void showAllUsers();
	void updateUser(User newuser);
	void deleteUser(int id);
	void findUserById(int id);
	void findUserByName(String name);
	
}
