package com.exceptional.handling;

import java.io.IOException;

public class CheckedExcepPropagation {
	void m() throws IOException {
		throw new IOException("HERE IO OF M()");
		
	}
	void p() throws IOException {
		m();
	}
	void  n() throws IOException{
		try {
			p();
		}
		catch(Exception e) {
			System.out.println("HERE CATCH FOUND! "+e.getMessage());
		}

	}

	public static void main(String[] args) throws IOException {
		CheckedExcepPropagation obj = new CheckedExcepPropagation();
		obj.n();
		System.out.println("Normal Flow in catch");
		
		
	}

}
