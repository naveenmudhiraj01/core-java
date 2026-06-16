package assignments;

public class EmployeeInstance {
	
	int empId;
	String name;
	double salary;
	public  double displayDetails(int empId,String name,double salary) {
		System.out.println("here employee details are printing : "+empId+"\t"+name+"\t"+salary);
		return salary;
		
		
	}
	

	public static void main(String[] args) {
		EmployeeInstance obj  =new EmployeeInstance();
		double result =obj.displayDetails(1, "Naveen", 2000);
		System.out.println("here is the result: "+result);
		
		double obj2=obj.displayDetails(2, "Karan", 30000);
		System.out.println("here is the obj2: "+obj2);
		obj.displayDetails(3,"Mahesh",9000);
//		Full Execution flow:
//		main starts
//		print message
//		object created
//		method called
//		inside method:
//		x, y, sum created
//		sum calculated
//		value returned
//		result stored
//		final output printed
		
		

	}

}
