package streamsInjava;

public class EmployeeStreams {
	int empId;
	String empName;
	long empPhone;
	long salary;
	public EmployeeStreams(int empId, String empName, long empPhone,long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.salary=salary;
	}
	public String getEmpName() {
		return empName;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public  long getSalary() {
		return salary;
	}
	public String toString() {
		return empName+" "+empPhone+" "+salary;
	}


}
