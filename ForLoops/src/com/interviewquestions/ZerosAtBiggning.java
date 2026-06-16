package com.interviewquestions;
//Q) “Rearrange the array so that all zeros are at the beginning.”
public class ZerosAtBiggning {

	public static void main(String[] args) {
		int arr[]= {1,0,3,4,0,8,0};
		int i;
	    for(i=0;i<arr.length;i++) {
	    	if(arr[i]==0) {
	    		System.out.print(arr[i]+" ");
	    	}
	    }
	    for(i=0;i<arr.length;i++) {
	    	if(arr[i]!=0) {
	    	System.out.print(arr[i]+" ");
	    	}
	    }
          
	}

}
