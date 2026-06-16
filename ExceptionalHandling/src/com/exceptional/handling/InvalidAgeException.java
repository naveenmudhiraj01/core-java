package com.exceptional.handling;

 class InvalidAgeExceptions extends Exception {
	 public InvalidAgeExceptions(String message) {
		 super(message);
	 }
 }
 class InvalidAgeException{
	      
	public static void main(String[] args) {
		int age=16;
		try {
			if(age<18) {
				throw new InvalidAgeExceptions("Age is must be 18+");
			}
			
		}
		catch(InvalidAgeExceptions e) {
			System.out.println("U are under 18+ not assible for this!");
		}

	

   }
}