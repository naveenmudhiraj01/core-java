package com.exceptional.handling;

public class multiplecatch {

	public static void main(String[] args) {
		try {
			int i=10/0;
			String str=null;
			System.out.println("Here is the coustom try block with two catch");
		}
		
		catch(NullPointerException e) {
			System.out.println("Here null is pointing");
		}
		catch(ArithmeticException e){
			System.out.println("can't divide by 0");
		}
		
			System.out.println("byee continue to move...");
		
	}

}
