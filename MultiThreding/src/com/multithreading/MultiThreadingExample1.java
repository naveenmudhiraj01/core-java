package com.multithreading;
class  MyThread extends Thread{
	String name;
   MyThread(String name){
	   this.name=name;
   }
   public void run() {
	   for(int i=0;i<5;i++) {
		   System.out.println(name+" "+i);
	   }
   }

}

public class MultiThreadingExample1 {

	public static void main(String[] args) {
		MyThread t1=new MyThread("Naveen");
		MyThread t2=new MyThread("Karan");
		t1.start();
        t2.start();		

	}

}
