package com.exceptional.handling;

public class UserValidation {
	public static void ValidationUser(String username) {
		if(username == null || username.isEmpty()) {
			System.out.println("the username must be not empty");
		}
		else if(username.length()<5){
			System.out.println("username must be 5 characters");
			
		}
		else {
			System.out.println("User name valid bro...");
		}
	}

	public static void main(String[] args) {
		try {
			ValidationUser("abce");
		}
		catch(IllegalArgumentException e){
			System.out.println("validationError!" + e.getMessage());
		}

	}

}
