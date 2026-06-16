package com.swapping;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		System.out.println("Before temp values >>A :"+a+" B :"+b+" Temp");
		temp=a;
		a=b;
		b=temp;	
		System.out.println("Here is  the with temp used:");
		System.out.println("A :"+a+" B :"+b+" Temp"+temp);

	System.out.println("Here is  the without temp used:");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(" Without temp values >>A :" +a+" B :"+b+" Temp"+temp);

		

	}

}
