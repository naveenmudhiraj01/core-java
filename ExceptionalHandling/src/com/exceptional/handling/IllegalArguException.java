package com.exceptional.handling;

import java.util.Scanner;

public class IllegalArguException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age ");
		int num=sc.nextInt();
		if(num<0) {
			throw new IllegalArgumentException("Enter number not a negative");
		}
		System.out.println("Code ended!");
		sc.close();
	}

}
