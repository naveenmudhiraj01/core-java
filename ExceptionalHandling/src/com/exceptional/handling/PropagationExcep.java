package com.exceptional.handling;

public class PropagationExcep {
	void m() {
		int a=10/0;
	}
	void p() {
		m();
	}
	void n() {
		try {
			p();
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+"Exception Handled here!");
		}
	}

	public static void main(String[] args) {
		PropagationExcep obj=new PropagationExcep();
		obj.n();
		System.out.println("Normal flow....");
		
	}

}
