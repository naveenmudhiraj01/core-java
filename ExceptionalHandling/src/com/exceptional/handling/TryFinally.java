package com.exceptional.handling;

public class TryFinally {

	public static void main(String[] args) {
		try {
			
			int result=10/0;
			System.out.println("try block will executed!");
			
		}
		catch(ArithmeticException e) {
			System.out.println("The Catch will Catched the Error Here:"+e.getMessage());
		}
		finally {
			System.out.println("The Final Will Excecuted always!");
		}

	}

}
