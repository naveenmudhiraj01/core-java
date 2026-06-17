package com.swapping;

public class SwappingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  a="Apple";
		String b="Bananna";
		String temp;
		System.out.println("===================");
		temp=a;//temp=Apple
		a=b;//a=Bananna
		b=temp;//b=Apple
		System.out.println("After swapping String");
		System.out.println("  temp values >>A :" +a+" B :"+b+" Temp"+temp);

		

	}

}
