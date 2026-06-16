package com.exceptional.handling;

public class NullPoiExce {

	public static void main(String[] args) {
		
		String str=null;
		try {
			System.out.println("We are accesing the str with null so :" +str.length());
		}
		catch(NullPointerException  e){
		 
			System.out.println("Error! Null pointer Exception");
		}
		

	}

}

