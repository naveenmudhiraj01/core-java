package com.arrays;

import java.util.Scanner;

public class ArrayStr {

	public static void main(String[] args) {
		String str[]=new String[3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first name: ");
		String s1=sc.next();
		str[0]=s1;
		System.out.println("Enter the second name: ");
		String s2=sc.next();
		str[1]=s2;
		System.out.println("Enter the third name: ");
		String s3=sc.next();
		str[2]=s3;
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
		
//         String str[]=new String[3];
//         str[0]="Naveen";
//         str[1]="Madhu";
//         str[2]="Karan";
//         for(int i=0;i<str.length;++i) {
//        	 System.out.println(i);
//         }
//         
  