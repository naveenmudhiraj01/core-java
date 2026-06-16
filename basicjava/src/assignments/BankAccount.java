package assignments;

public class BankAccount {
	
	long accountNumber;
	String accountHolderName;
	double balance;
	public void deposit(double amount) {
		double newBalance=balance+amount;
		balance=newBalance;
		System.out.println("Here Amount is "+amount);
		System.out.println("Here Balance is "+balance);
	}
	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.accountNumber=123456789;
		obj.accountHolderName="Naveen";
		obj.balance=1000;
		obj.deposit(200);
		
		
		
		

	}

}
