package assignments;

public class LocalVariables {
	
	
	public  int student(int a,int b) {
		int a1=a;
		int b1=b;
		int sum=a1+b1;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalVariables obj=new LocalVariables();
		int result=obj.student(10,20);
		System.out.println("the sum is: "+result);
	}

}
