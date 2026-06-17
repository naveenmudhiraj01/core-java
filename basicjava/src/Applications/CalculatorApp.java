package Applications;

import java.util.Scanner;

public class CalculatorApp {
	int add(int fno,int sno) {
		return fno+sno;
	}
	int sub(int fno,int sno) {
		return fno-sno;
		
	}
	int mul(int fno,int sno) {
		return fno*sno;
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		CalculatorApp obj=new CalculatorApp();
		int fno=0;
		int sno=0;
		int result=0;
		while(true) {
			System.out.println(" ");
			System.out.println("1. Addition of two numbers: ");
			System.out.println("2. Subtraction of two numbers: ");
			System.out.println("3. Multiplication of two number: ");
			System.out.println("4. Exit bro...");
			System.out.println(" ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the First Number: ");
				fno=sc.nextInt();
			    System.out.println("Enter the Second Number: ");
			    sno=sc.nextInt();
			    result=obj.add(fno, sno);
			    System.out.println("Result of Addition: "+result);
			    break;
			case 2:
				System.out.println("Enter the first number: ");
				fno=sc.nextInt();
				System.out.println("Enter the Second number: ");
				sno=sc.nextInt();
				result=obj.sub(fno, sno);
				System.out.println("The Result of  Subtraction is: "+result);
				break;
				
			case 3:
				System.out.println("Enter the First number ");
				fno=sc.nextInt();
				System.out.println("Enter the second number ");
				sno=sc.nextInt();
				result=obj.mul(fno, sno);
				System.out.println("The result of Multiplication is "+result);
				break;
			case 4:
				System.out.println("Thanks for using this App");
				
				sc.close();
				return;
		    default :
		    	System.out.println(" Choose from Above 4 options: ");
		    	
			    
			}
			
		}
		

	}

}
