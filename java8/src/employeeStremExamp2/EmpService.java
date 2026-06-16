package employeeStremExamp2;

public class EmpService {

	int empId;
	String empName;
    double  empSalary;
	public EmpService(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public String toString() {
		return empName;
		
	}
    
}
