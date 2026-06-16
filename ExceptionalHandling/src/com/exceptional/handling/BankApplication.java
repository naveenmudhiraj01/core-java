package com.exceptional.handling;

public class BankApplication {
	public static  void Amount(int amount) {
		if(amount>10000) {
			throw new ArithmeticException("Amount limit exceed ");
		}
	}

	public static void main(String[] args) {
		
		
		try {
			BankApplication.Amount(20000);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		

	}

}
