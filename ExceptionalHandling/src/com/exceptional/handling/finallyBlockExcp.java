package com.exceptional.handling;

public class finallyBlockExcp {
	public static void main(String[] args) {
		try {
			int arr[]= {};
			System.out.println("the reslut of try block:"+arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is finally block executed every time");
		}
	}

}
