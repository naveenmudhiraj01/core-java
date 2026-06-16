package streamsInjava;

import java.util.List;

public class ClientStudent {
	public static void main(String[] args) {
		//List.of() is used to quickly create a list with fixed elements.
		List<StreamsStudents> students=List.of(
				new StreamsStudents(1, "ram", 85),
                new StreamsStudents(2, "john", 45),
                new StreamsStudents(3, "raju", 90),
                new StreamsStudents(4, "amit", 30),
                new StreamsStudents(5, "ramesh", 60)
				);
		students.stream()
        .filter(s -> s.getMarks() > 50)   // filter condition
        .map(StreamsStudents::getSname)   // extract names
        .forEach(System.out::println);    // print
	}

}
