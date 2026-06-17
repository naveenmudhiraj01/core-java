package Applications;

import java.util.InputMismatchException;
import java.util.Scanner;
//concrete method created below

public class IceCreamDetails {

    void showIcecreamDetails() {
    	Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                

                System.out.println("\n┌──────────────────────────────────────────────┐");
                System.out.println("│          🍨 ICE CREAM PARADISE 🍨            │");
                System.out.println("├──────────────────────────────────────────────┤");
                System.out.println("│ 1. Vanilla Ice Cream         💰 ₹99          │");
                System.out.println("│ 2. Chocolate Ice Cream       💰 ₹119         │");
                System.out.println("│ 3. Strawberry Ice Cream      💰 ₹109         │");
                System.out.println("│ 4. Butterscotch Ice Cream    💰 ₹129         │");
                System.out.println("│ 5. 🔙 Back To Main Menu                       │");
                System.out.println("└──────────────────────────────────────────────┘");

                System.out.print("\n👉 Please Enter Your Choice : ");

                int choice = sc.nextInt();

                switch (choice) {

                case 1:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│          🍦 VANILLA ICE CREAM 🍦             │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 💰 Price        : ₹99                        │");

                    ResturantClient.totalBill += 99;

                    System.out.println("│ 🧾 Price Added  : ₹99                        │");
                    System.out.println("│ 💵 Current Bill : ₹" + ResturantClient.totalBill + "                         │");
                    System.out.println("│ 🌍 Origin       : Italy                      │");
                    System.out.println("│ 😋 Flavor       : Sweet & Creamy             │");
                    System.out.println("│ 🥛 Ingredients  : Milk & Vanilla             │");
                    System.out.println("│ ✨ Taste         : Smooth & Rich              │");
                    System.out.println("└──────────────────────────────────────────────┘");

                    System.out.println("\n💬 Would You Like To Order Anything Else?");
                    break;

                case 2:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│         🍫 CHOCOLATE ICE CREAM 🍫            │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 💰 Price        : ₹119                       │");

                    ResturantClient.totalBill += 119;

                    System.out.println("│ 🧾 Price Added  : ₹119                       │");
                    System.out.println("│ 💵 Current Bill : ₹" + ResturantClient.totalBill + "                         │");
                    System.out.println("│ 🌍 Origin       : Switzerland                │");
                    System.out.println("│ 😋 Flavor       : Rich Chocolate             │");
                    System.out.println("│ 🥛 Ingredients  : Cocoa & Cream              │");
                    System.out.println("│ ✨ Taste         : Deep Chocolate Flavor      │");
                    System.out.println("└──────────────────────────────────────────────┘");

                    System.out.println("\n💬 Would You Like To Order Anything Else?");
                    break;

                case 3:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│        🍓 STRAWBERRY ICE CREAM 🍓            │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 💰 Price        : ₹109                       │");

                    ResturantClient.totalBill += 109;

                    System.out.println("│ 🧾 Price Added  : ₹109                       │");
                    System.out.println("│ 💵 Current Bill : ₹" + ResturantClient.totalBill + "                         │");
                    System.out.println("│ 🌍 Origin       : America                    │");
                    System.out.println("│ 😋 Flavor       : Sweet & Fruity             │");
                    System.out.println("│ 🥛 Ingredients  : Strawberry Pulp            │");
                    System.out.println("│ ✨ Taste         : Refreshing & Tangy         │");
                    System.out.println("└──────────────────────────────────────────────┘");

                    System.out.println("\n💬 Would You Like To Order Anything Else?");
                    break;

                case 4:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│       🍯 BUTTERSCOTCH ICE CREAM 🍯           │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 💰 Price        : ₹129                       │");

                    ResturantClient.totalBill += 129;

                    System.out.println("│ 🧾 Price Added  : ₹129                       │");
                    System.out.println("│ 💵 Current Bill : ₹" + ResturantClient.totalBill + "                         │");
                    System.out.println("│ 🌍 Origin       : England                    │");
                    System.out.println("│ 😋 Flavor       : Caramel & Butter           │");
                    System.out.println("│ 🥛 Ingredients  : Butter & Cream             │");
                    System.out.println("│ ✨ Taste         : Crunchy & Sweet            │");
                    System.out.println("└──────────────────────────────────────────────┘");

                    System.out.println("\n💬 Would You Like To Order Anything Else?");
                    break;

                case 5:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│         🔙 RETURNING TO MAIN MENU            │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 🍨 Thank You For Visiting!                   │");
                    System.out.println("│ 💵 Current Total Bill : ₹" + ResturantClient.totalBill + "                  │");
                    System.out.println("└──────────────────────────────────────────────┘");

                    ResturantClient.main(null);
                    break;

                default:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│              ❌ INVALID CHOICE ❌             │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ ⚠ Please Select Between 1 and 5              │");
                    System.out.println("└──────────────────────────────────────────────┘");
                }

            }

            catch (InputMismatchException e) {

                System.out.println("\n┌──────────────────────────────────────────────┐");
                System.out.println("│               ❌ INVALID INPUT ❌             │");
                System.out.println("├──────────────────────────────────────────────┤");
                System.out.println("│ 🔢 Please Enter Numbers Only                 │");
                System.out.println("│ 👉 Valid Options : 1 - 5                     │");
                System.out.println("│ ⚠ Error : " + e + "                          │");
                System.out.println("└──────────────────────────────────────────────┘");

                sc.nextLine();// is used here to clear the invalid input from the Scanner buffer after an exception occurs.
            }
        }
    }
}