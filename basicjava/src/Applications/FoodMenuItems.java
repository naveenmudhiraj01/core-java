package Applications;

import java.util.Scanner;

public class FoodMenuItems {

    // Method to calculate bill
    int calculateBill(int quantity, int price) {
        return quantity * price;
    }

    // Loading 
    void preparingOrder() throws InterruptedException {

        System.out.print("\n👨‍🍳 Preparing your order");

        for (int i = 0; i < 5; i++) {
            Thread.sleep(400);
            System.out.print(".");
        }

        System.out.println("\n");
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        FoodMenuItems obj = new FoodMenuItems();

        int quantity;
        int bill;

        System.out.println("====================================");
        System.out.println("     🍽️ WELCOME TO TIFFIN CENTER 🍽️");
        System.out.println("====================================");

        while (true) {

            System.out.println("\n📋 Today's Menu");
            System.out.println("------------------------------------");
            System.out.println("1️  Idly   - Rs.35");
            System.out.println("2️  Dosa   - Rs.45");
            System.out.println("3️  Poori  - Rs.50");
            System.out.println("4️  Exit");
            System.out.println("------------------------------------");

            // Input validation for menu choice
            System.out.print("👉 Please enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n❌ Invalid input! Please enter numbers only.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\n✅ You selected: Idly");

                    quantity = getValidQuantity(sc);

                    bill = obj.calculateBill(quantity, 35);

                    obj.preparingOrder();

                    System.out.println("🍛 Your Idly is ready!");
                    printBill("Idly", quantity, 35, bill);

                    break;

                case 2:

                    System.out.println("\n✅ You selected: Dosa");

                    quantity = getValidQuantity(sc);

                    bill = obj.calculateBill(quantity, 45);

                    obj.preparingOrder();

                    System.out.println("🥞 Your Dosa is ready!");
                    printBill("Dosa", quantity, 45, bill);

                    break;

                case 3:

                    System.out.println("\n✅ You selected: Poori");

                    quantity = getValidQuantity(sc);

                    bill = obj.calculateBill(quantity, 50);

                    obj.preparingOrder();

                    System.out.println("🍲 Your Poori is ready!");
                    printBill("Poori", quantity, 50, bill);

                    break;

                case 4:

                    System.out.println("\n🙏 Thank you for visiting our Tiffin Center!");
                    System.out.println("💖 Have a wonderful day!");
                    System.out.println("👋 Visit Again!");

                    sc.close();
                    return;

                default:

                    System.out.println("\n❌ Invalid choice!");
                    System.out.println("⚠️ Please select a valid option from the menu.");
            }
        }
    }

    // Method for valid quantity input
    static int getValidQuantity(Scanner sc) {

        int quantity;

        while (true) {

            System.out.print("🛒 Enter quantity: ");

            if (!sc.hasNextInt()) {
                System.out.println("❌ Quantity must be a number!");
                sc.next();
                continue;
            }

            quantity = sc.nextInt();

            if (quantity <= 0) {
                System.out.println("❌ Quantity must be greater than 0!");
            } else {
                return quantity;
            }
        }
    }

    // Method to print bill
    static void printBill(String item, int quantity, int price, int bill) {

        System.out.println("😊 Enjoy your meal!");

        System.out.println("------------------------------------");
        System.out.println("🧾 BILL SUMMARY");
        System.out.println("------------------------------------");
        System.out.println("Item       : " + item);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Price/item : Rs." + price);
        System.out.println("Total Bill : Rs." + bill);
        System.out.println("------------------------------------");
    }
}
