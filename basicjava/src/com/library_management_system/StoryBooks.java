package com.library_management_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StoryBooks {
   void  ShowStoryBooks() {
	   Scanner sc=new Scanner(System.in);
	   while(true) {
		   try {
			   System.out.println("1. 🧙 Harry Potter  ");
			   System.out.println("2. The Alchemist ");
			   System.out.println("3. Treasure Island  ");
			   System.out.println("4. Back to main menu!");
			   int choice=sc.nextInt();
			   switch(choice) {
			   case 1:
				   System.out.println("Herry Potter Book is here");
				   
				   System.out.println("If U want Anything Else to read ");
				   break;
			   case 2:
				   System.out.println("THe Alchemist Book is here");
				   
				   System.out.println("If U want Anything else to read ");
			       break;
			   case 4:
				   System.out.println("Threasure Island is here ");
				   
				   System.out.println("If U want Anything Else to read ");
			   case 5:
				   System.out.println("Going Back to main menu");
				  break;
			   default :
				   System.out.println("Choose the OPtions from 1-5 only ");
				   
			   }
		   }
		   catch(InputMismatchException e) {
			   System.out.println(e);
			   sc.nextLine();
		   }
	   }
   }
}
