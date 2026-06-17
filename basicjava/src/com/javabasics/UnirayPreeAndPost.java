package com.javabasics;

public class UnirayPreeAndPost {
	public static void main(String[] args) {
		int x=10;
		int y=x++;
		System.out.println(x +"\t" + y);//11 10
		System.out.println(x++ + y++ + ++y + ++x);//11 10 12 13=46
		
	}

}
