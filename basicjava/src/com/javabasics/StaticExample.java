package com.javabasics;

public class StaticExample {
	static class Counter{
		//static variables among all instances
		static int count=0;
		Counter(){
		  count++;//increment the static variables
	  }
	  void displayCount() {
		  System.out.println("Disping the count "+count);
	  }
	}

	public static void main(String[] args) {
		Counter obj1=new Counter();
		Counter obj2=new Counter();
		Counter obj3=new Counter();
		 
		obj1.displayCount();
		obj2.displayCount();
		obj3.displayCount();
		//accessing all instances here
		System.out.println("Here is the count: "+Counter.count);
		
		

	}

}
