package com.library_management_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookClient {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
        	try {
        		System.out.println("1.Java Books here");
        		System.out.println("2.Story Books here");
        		System.out.println("3.Technology Books here");
        		System.out.println("4.View Issued Books here");
        		System.out.println("5.Exit");
        		System.out.println("Choose the option from above 5 options");
        		int choice=sc.nextInt();
        		switch(choice) {
        		case 1:
        			System.out.println("Choose the  level U want to read");
        			JavaBooks j=new JavaBooks();
        			j.showJavaBooks();
        			break;
        		case 2:
        			System.out.println("choose the type of story u want");
        			StoryBooks s=new StoryBooks();
        			s.ShowStoryBooks();
        		}
        		
        	}
        	catch(InputMismatchException e) {
        		System.out.println(e);
        		sc.nextLine();
        	}
        }
	}

}
