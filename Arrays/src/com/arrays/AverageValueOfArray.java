package com.arrays;

public class AverageValueOfArray {

	public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int avg=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>avg) {
        		avg=arr[i];
        	}
        	else {
        		System.out.println("nothing ");
        	}
        }
        System.out.println("average :"+avg);
	}

}
