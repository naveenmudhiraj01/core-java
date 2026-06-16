package com.exceptional.handling;

public class IlligalArguExcep {
	public void Validation(int a) {
		if(a<18) {
			throw new IllegalArgumentException("In valid argument exception!");
		}
	}

	public static void main(String[] args) {
		

	}

}
