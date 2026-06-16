package streamsInjava;

import java.util.List;

public class EmployeeClient {

	public static void main(String[] args) {
		List<EmployeeStreams> employee=List.of(
				//List.of() is used to quickly create a list with fixed elements.
//				new EmployeeStreams(1,"Naveen",9110563667l,233300),
//				new (EmployeeStreams(2,"Mahesh",899678838l,230008),
//				new (EmployeeStreams(3,"Karan",45367759938l,40008)
				new EmployeeStreams(1, "Naveen", 9110563667L, 233300),
                new EmployeeStreams(2, "Mahesh", 899678838L, 230008),
                new EmployeeStreams(3, "Karan", 45367759938L, 40008)
				);
		employee.stream()
.filter(s->s.getSalary()<200000000)
.forEach(e->System.out.println(e.getEmpName()+" "+ e.getEmpPhone()));
	}

}
