package com.exceptional.handling;

public class NestedTry {

	
	 public static void main(String[] args){
	 try {
		 try {
			 int a=10/0;
			 
		 }
		 catch(ArithmeticException e) {
			 System.out.println("Inner Exception");
		 }
		 int[] arr=new int[2];
		  arr[5]=10;
	 }
	 catch(ArithmeticException e) {
		 System.out.println("Outer exception");
	 }
	}

}
