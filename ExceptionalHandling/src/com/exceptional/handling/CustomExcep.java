package com.exceptional.handling;

public class CustomExcep {
	//custom exception example this 

	  public static void main(String[] args) {
	        try{
	            validateAge(17);
	        }
	        catch(IllegalArgumentException e){
	            System.out.println("caugth error:"+e.getMessage());
	        }
	    }
	    public static void validateAge(int age){
	        if(age<18){
	            throw new IllegalArgumentException("the error comes from here becz of age is less");
	        }
	        System.out.println("The age is valid");
	        
	    }

}
