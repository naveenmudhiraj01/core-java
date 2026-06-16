package com.exceptional.handling;

public class TryCatch {

	public static void main(String[] args) {
		int i=10;
		int n=0;
		try {
			int answer=i/n;
			System.out.println(answer);
				
			
		}
		
		catch(ArithmeticException e){
			System.out.println("Error invalid !");
			
		}

	}

}
