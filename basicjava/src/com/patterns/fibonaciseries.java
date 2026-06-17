package com.patterns;

import java.util.Scanner;

public class fibonaciseries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		int recent=0;
		int next=1;
		int result=0;
		
			
		
		for(int i=0;i<input;i++) {
			result=recent+next;//result:0+1=1,then 1+1=2,then 2+2=4,4+2=6
			if(result>input) {
				break;
			}
			System.out.print(result+" ");
			recent=next;//recent=1,then 2,then 2
			
			next=result;//next=1;then 2 ,then 4
		}
		

	}

}
