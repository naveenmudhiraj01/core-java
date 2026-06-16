package streamsInjava;

public class StreamsStudents {
	int sno;
	String Sname;
	int marks;
	

	public StreamsStudents(int sno, String sname, int marks) {
		super();
		this.sno = sno;
		this.Sname = sname;
		this.marks = marks;
	}
public String getSname() {
		return Sname;
	}
	public int getMarks() {
		return marks;
	}
	
	
@Override
//java automatically converts int → String when you use + with a String:

public String toString() {
	return sno+" "+Sname+" "+marks;
	
}
	

}
