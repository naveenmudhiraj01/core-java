package com.exceptional.handling;

public class nullPEx {

	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println("we are taking the values :"+ str.length());
		}
		catch(NullPointerException e) {
			System.out.println("Error! becz NullPointerException");
		}
	}

}
