package com.StudentManagementSystem;

public class Sms {
	int id;
	String name;
	int marks;
	char grade;
	public void display(int id ,String name,int marks,char grade) {
		System.out.println(id+"\t"+name+"\t"+marks+"\t"+grade);
		
	}

	public static void main(String[] args) {
		Sms obj=new Sms();
		obj.display(1,"Naveen",35,'D');
		obj.display(2,"Mudhiraj",80,'B');
		obj.display(3,"Dasari",99,'A');
		obj.display(4,"Boltey",48,'C');
		
		
		
		

	}

}
