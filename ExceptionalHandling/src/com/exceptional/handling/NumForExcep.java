package com.exceptional.handling;

public class NumForExcep {

	public static void main(String[] args) {
		String str="abc";
		try {
			int num=Integer.parseInt(str);
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("Error! String not into number NFE happend!");
			
		}

	}

}
