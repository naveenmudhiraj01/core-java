package com.exceptional.handling;

public class divbyzero {

	public static void main(String[] args) {
		int a=10/0;
		try {
			int result=a;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("not divide by 0 which is not valid:");
		}

	}

}
