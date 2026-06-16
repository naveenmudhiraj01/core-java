package com.library_management_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaBooks {
	void showJavaBooks() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("1.Basic Java");
				System.out.println("2.Advance java");
				System.out.println("3.Spring Boot");
				System.out.println("4.Back to main Menu");
				int choice=sc.nextInt();
				switch(choice){
				case 1:
					
				}
				
			}
			catch(InputMismatchException e) {
				System.out.println(e);
			}
		}
	}

}
