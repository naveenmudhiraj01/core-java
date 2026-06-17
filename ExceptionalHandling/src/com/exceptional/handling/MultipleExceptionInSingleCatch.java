package com.exceptional.handling;

public class MultipleExceptionInSingleCatch {

	public static void main(String[] args) {
		try {
			int a=10/0;
			int arr[] = new int[3];
			arr[5]=10;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch found this exception:"+ e);
			
		}
		System.out.println("Code ended here!");
		
	}   

	

}
