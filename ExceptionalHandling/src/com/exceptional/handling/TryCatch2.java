package com.exceptional.handling;

public class TryCatch2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		try {
			System.out.println("The array index of an element is:" +arr[10]);
		}catch(ArrayIndexOutOfBoundsException  e){
			System.out.println("Error! out of bounds");
		}
		System.out.println("Program continues....");

	}

}
