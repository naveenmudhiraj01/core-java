package com.ums.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.ums.model.user.User;
import com.ums.service.UserService;

public class UserServiceImpl implements UserService {
	Scanner sc = new Scanner(System.in);
	List<User> addUsers = new LinkedList<>();

	@Override
	public void addRegister() {
		// TODO Auto-generated method stub
		addUsers = new LinkedList<>();
		System.out.println("Enetr the Number");
		int uid = sc.nextInt();
		System.out.println("Enter the Name: ");
		String name = sc.next();
		System.out.println("Enter the Email: ");
		String email = sc.next();
		System.out.println("Enter the UserName: ");
		String uname = sc.next();
		System.out.println("Enter the Pass: ");
		String pass = sc.next();
		User user = new User(uid, name, email, uname, pass);
		addUsers.add(user);
		System.out.println("User Added Sucessfully!");

	}

	@Override
	public List<User> viewAllUsers() {
		// TODO Auto-generated method stub
		return addUsers;
	}

	@Override
	public boolean verifyUserNameAndPassword(String uname, String pass) {
		// TODO Auto-generated method stub
		for(User user:addUsers) {
			if(user.getUserName().equals(uname)&&user.getPassword().equals(pass))
			{
return true;
			}
		}
		return false;
	}

	@Override
	public String forGotPassword(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
