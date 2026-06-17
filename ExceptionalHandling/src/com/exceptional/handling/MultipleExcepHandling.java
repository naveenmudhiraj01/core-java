package com.exceptional.handling;

public class MultipleExcepHandling {

	public static void main(String[] args) {
		
		try {
			int a=10/0;
			int arr[] =new int[5];//You are creating an array named arr that can store 5 integers.
		}
		catch(ArithmeticException e){
			System.out.println("Error! Cannot divide by 0");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error! out of bounce");
			
		}

	}

}
