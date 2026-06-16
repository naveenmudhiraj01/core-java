package employeeStremExamp2;

import java.util.List;

public class EmpClient {

	public static void main(String[] args) {
		List<EmpService> employee=List.of(
				new EmpService(1,"Naveen",20000),
				new EmpService(2,"Banu",30000),
				new EmpService(3,"Srinivas",10000),
				new EmpService(4,"Kavitha",23000)
				);
		System.out.println("Here is the Employee detatils on salary >10k: ");
		employee.stream()
		.filter(s->s.getEmpSalary()>10000)
		.map(EmpService::getEmpName)
		.forEach(System.out::println);
		
		

	}

}
