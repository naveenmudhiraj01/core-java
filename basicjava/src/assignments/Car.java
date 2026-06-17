package assignments;

public class Car {
	String model;
	long price;
	static int carCount=0;
	public  Car(String model,long price) {
		this.model=model;
		this.price=price;
		carCount++;
	}
	

	public static void main(String[] args) {
		Car obj = new Car("creta", 1);
		Car obj1=new Car("kia", 1);
		
		System.out.println("here is the count :"+Car.carCount);
		
		
		
		

	}

}