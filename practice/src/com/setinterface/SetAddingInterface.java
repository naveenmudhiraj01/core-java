package com.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SetAddingInterface {

	public static void main(String[] args) {
		Set<String> al = new HashSet<String>();
		al.add("naveen");
		al.add(null);
		al.add(null);
		al.add("rani");
		al.add("malesh");
		al.add(null);
		al.add(null);

		System.out.println(al);
		// output will:👉 Important: HashSet does NOT maintain order

		// It does NOT follow insertion order
//It does NOT sort values

//👉 It prints based on hashing (internal structure)
//		

	}

}
