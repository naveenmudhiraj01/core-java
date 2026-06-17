package Applications;

import java.util.InputMismatchException;
import java.util.Scanner;

class BankingApplication {

    double depositAmount(double amount, double balance) {

        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount!");
        }

        return balance;
    }

    double withdrawAmount(double amount, double balance) {

        double minimumBalance = 5000;
        double deductAmount = 50;

        if (amount <= balance) {

            balance -= amount;

            if (balance < minimumBalance) {

                balance -= deductAmount;

                System.out.println(
                        "Low Balance, ₹50 charged. Current balance: " + balance);
            }

            else {
                System.out.println("Withdrawal Successful!");
            }
        }

        else {
            System.out.println("Insufficient Balance!");
        }

        return balance;
    }

    public static void main(String[] args) {

        BankingApplication obj = new BankingApplication();

        Scanner sc = new Scanner(System.in);

        double amount;
        double balance = 5000;

        while (true) {

            try {

                System.out.println("~~~~~~~~~~~~~~~~~=====WELCOME TO MIBANK===~~~~~~~~~~~~~~~~~~~");
                System.out.println("1. Deposit money");
                System.out.println("2. Withdraw money");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                int choice = sc.nextInt();

                switch (choice) {

                case 1:

                    System.out.println("Enter Deposit Amount: ");

                    amount = sc.nextDouble();

                    balance = obj.depositAmount(amount, balance);

                    break;

                case 2:

                    System.out.println("Enter Withdraw Amount: ");

                    amount = sc.nextDouble();

                    balance = obj.withdrawAmount(amount, balance);

                    break;

                case 3:

                    System.out.println("Current Balance: " + balance);

                    break;

                case 4:

                    System.out.println("Thank You from MIBANK 🦙 Visit Again 😊");

                    sc.close();

                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid Option! Choose 1 to 4");
                }

            }

            catch (InputMismatchException e) {

                System.out.println("Invalid Input! Numbers only.Error: "+e);

                sc.nextLine();
            }
        }
    }
}