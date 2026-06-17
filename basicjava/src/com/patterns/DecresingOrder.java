package com.patterns;

public class DecresingOrder {

	public static void main(String[] args) {
         for(int i=5;i>0;i--) {
        	 for(int j=0;j<i;j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}
//works like this step-by-step:
//
//Step	Value of i	Check i > 0	Execute Loop?
//Start	5	true	Yes
//After i++	6	true	Yes
//After i++	7	true	Yes
//After i++	8	true	Yes
//
//…and it keeps going forever.
