package com.exceptional.handling;

import java.util.Scanner;

public class DynamicUserValidation {
	public static void ValidUserName(String username) {
		if(username==null || username.isEmpty()) {
			System.out.println("Please enter the username valid not empty:");
		}
		else if(username.length()<5) {
			System.out.println(" Username must be 5 characters or more ");
		}
		else {
			System.out.println(username+" here Your name is valid! Thank u");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese Enter the UserName:");
		
		String username=sc.nextLine();
		try {
			ValidUserName(username);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Validation Erro!"+e.getMessage());
		}
		finally {
			System.out.println("here is the finally for close the program or for database connection out");
		}

	}

}
