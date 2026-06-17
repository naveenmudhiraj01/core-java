package com.javabasics;

public class PmanagementSytem {
	String name;
	long price;
	int Quantity;
	double Tpercentage;
	public void ProductDetails(String name,long price,int Quantity,double TPercentage) {
		System.out.println(name+" name: " + " Price: "+price+" Quantity "+Quantity+" TPercentage"+TPercentage );
		}

	public static void main(String[] args) {
		
		PmanagementSytem obj=new PmanagementSytem();
		obj.ProductDetails("Naveen",1000,20,1020);
		obj.ProductDetails("Naveen",1000,20,1020);
		obj.ProductDetails("Naveen",1000,20,1020);
		
		

	}

}
