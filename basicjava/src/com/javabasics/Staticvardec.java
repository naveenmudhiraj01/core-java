package com.javabasics;

public class Staticvardec {
	//it is static variable
	static int a=m1();
	//static block i created here
	static {
		System.out.println(" 2nd is inside static block!");
	}
	//here i created a static methods
	static int m1() {
		System.out.println("1st is static block from method m1");
		return 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("here is a is:" + a);
System.out.println("here from main");
	}

}
