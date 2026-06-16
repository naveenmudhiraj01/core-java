package com.ums.service;

import java.util.List;

import com.ums.model.user.User;





public interface UserService {
	void addRegister();

	List<User> viewAllUsers();
	boolean verifyUserNameAndPassword(String uname,String pass);
	String forGotPassword(String email);

}