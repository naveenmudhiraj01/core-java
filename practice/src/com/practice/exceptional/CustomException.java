package com.practice.exceptional;

public class CustomException {
	void m() throws Exception{
		int i=10/0;
		
	}
	void n()throws Exception {
		m();
	}
	void p() throws Exception{
		 try {
			 n();
		 }
		 catch(Exception e) {
			 System.out.println("Exception Occur in u r code!"+e.getMessage());
		 }
	}

	public static void main(String[] args) throws Exception {
		CustomException obj= new CustomException();
		obj.p();
		System.out.println("Ended here in main ");
		
		
			}

}
