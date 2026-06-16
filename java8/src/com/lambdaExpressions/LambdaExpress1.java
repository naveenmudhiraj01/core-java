package com.lambdaExpressions;

import java.util.function.Predicate;

public class LambdaExpress1 {


	public static void main(String[] args) {
		Predicate<Integer> p=i->i>10;
		System.out.println(p.test(100));
		System.out.println(p.test(10));
		Predicate<Integer> p1=j->j%2==0;
		System.out.println(p1.test(10));
		String[] s= {"Rani" ,"rani","ram","Karan"};
		Predicate<String> s1=t->t.charAt(0)=='r';
		System.out.println("Here the String Startes bro...");
		for(String s2:s) {
			if(s1.test(s2)){
				System.out.println(s2);
			}
		}
		
		

	}

}
