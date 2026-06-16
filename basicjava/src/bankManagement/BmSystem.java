package bankManagement;

public class BmSystem {
	String name;
	double balance;
    double deposit;
    double withdraw;
    public void display(String name,double balance,double deposit,double withdraw) {
    	
    	System.out.println(name+" name: " + " balance: "+balance+" deposit "+deposit+" Witdraw"+withdraw );
    }

	public static void main(String[] args) {
		
		BmSystem obj = new BmSystem();
		obj.display("Naveen",1000,200,500);
		obj.display("Banuji",2000,300,100);
		obj.display("kanama",3000,400,100);
		

	}

}
