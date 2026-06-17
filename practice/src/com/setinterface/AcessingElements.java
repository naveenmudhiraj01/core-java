package com.setinterface;

import java.util.HashSet;
import java.util.Set;

public class AcessingElements {

	public static void main(String[] args) {
		Set<String> al=new HashSet<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		String s="E";
		System.out.println("in this D is:"+s+"Contains not"+al.contains(s));

	}

}
