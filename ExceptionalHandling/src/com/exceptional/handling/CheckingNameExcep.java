package com.exceptional.handling;

public class CheckingNameExcep {
	public void validateUsername(String username) {
		if(username == null || username.length()<5) {
			throw new IllegalArgumentException("Username must be atleat more than 5 characters!");
		}
		System.out.println("Valid username");
	}

	public static void main(String[] args) {
		
		CheckingNameExcep obj = new CheckingNameExcep();
		try {
			obj.validateUsername("abe");
		}
		catch(IllegalArgumentException e) {
			System.out.println("error:" + e.getMessage());
		}

	}

}
