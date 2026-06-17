package assignments;

public class Product {
	int id;
	String name;
	double price;
	public double calculateDiscount(double discountPercent) {
		double discountPrice=(price * discountPercent) / 100;
		double finalPrice=(price-discountPrice);
		return finalPrice;
		
		
		
	}

	public static void main(String[] args) {
	Product obj=new Product();
	obj.id=1;
	obj.name="DAll";
	obj.price=100;
System.out.println("Final Price is: "+obj.calculateDiscount(12));
	

	}

}
