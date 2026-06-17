package Applications;

import java.util.InputMismatchException;
import java.util.Scanner;
//concrete method created below

public class DrinksDetails {

    void showDrinksMenu() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("\n┌──────────────────────────────────────────────┐");
                System.out.println("│         🥤 WELCOME TO JUICE POINT 🥤         │");
                System.out.println("├──────────────────────────────────────────────┤");
                System.out.println("│ 1. 🥭 Mango Juice            💰 ₹89          │");
                System.out.println("│ 2. 🍋 Lemon Soda             💰 ₹59          │");
                System.out.println("│ 3. ☕ Cold Coffee            💰 ₹129         │");
                System.out.println("│ 4. 🍵 Masala Chai            💰 ₹39          │");
                System.out.println("│ 5. 🔙 Return Back To Main Menu               │");
                System.out.println("└──────────────────────────────────────────────┘");

                System.out.print("\n👉 Please Enter Your Choice : ");

                int choice = sc.nextInt();

                switch (choice) {

                case 1:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│              🥭 MANGO JUICE 🥭               │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 💰 Price        : ₹89                        │");

                    ResturantClient.totalBill += 89;

                    System.out.println("│ 🧾 Price Added  : ₹89                        │");
                    System.out.println("│ 💵 Current Bill : ₹" + ResturantClient.totalBill + "                         │");
                    System.out.println("│ 🌍 Origin       : India                      │");
                    System.out.println("│ 😋 Flavor       : Sweet & Fruity             │");
                    System.out.println("│ 🥤 Ingredients  : Mango, Sugar & Ice         │");
                    System.out.println("│ ✨ Taste         : Refreshing & Sweet         │");
                    System.out.println("└──────────────────────────────────────────────┘");

                    System.out.println("\n💬 Would You Like Anything Else?");
                    break;

                case 2:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│               🍋 LEMON SODA 🍋               │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 💰 Price        : ₹59                        │");

                    ResturantClient.totalBill += 59;

                    System.out.println("│ 🧾 Price Added  : ₹59                        │");
                    System.out.println("│ 💵 Current Bill : ₹" + ResturantClient.totalBill + "                         │");
                    System.out.println("│ 🌍 Origin       : India                      │");
                    System.out.println("│ 😋 Flavor       : Tangy & Fizzy              │");
                    System.out.println("│ 🥤 Ingredients  : Lemon Juice & Soda         │");
                    System.out.println("│ ✨ Taste         : Cool & Refreshing          │");
                    System.out.println("└──────────────────────────────────────────────┘");

                    System.out.println("\n💬 Would You Like Anything Else?");
                    break;

                case 3:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│               ☕ COLD COFFEE ☕               │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 💰 Price        : ₹129                       │");

                    ResturantClient.totalBill += 129;

                    System.out.println("│ 🧾 Price Added  : ₹129                       │");
                    System.out.println("│ 💵 Current Bill : ₹" + ResturantClient.totalBill + "                         │");
                    System.out.println("│ 🌍 Origin       : Café Style Beverage        │");
                    System.out.println("│ 😋 Flavor       : Coffee & Creamy            │");
                    System.out.println("│ 🥤 Ingredients  : Milk, Coffee & Ice Cream   │");
                    System.out.println("│ ✨ Taste         : Smooth & Energetic         │");
                    System.out.println("└──────────────────────────────────────────────┘");

                    System.out.println("\n💬 Would You Like Anything Else?");
                    break;

                case 4:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│               🍵 MASALA CHAI 🍵              │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 💰 Price        : ₹39                        │");

                    ResturantClient.totalBill += 39;

                    System.out.println("│ 🧾 Price Added  : ₹39                        │");
                    System.out.println("│ 💵 Current Bill : ₹" + ResturantClient.totalBill + "                         │");
                    System.out.println("│ 🌍 Origin       : India                      │");
                    System.out.println("│ 😋 Flavor       : Spicy & Sweet              │");
                    System.out.println("│ 🥤 Ingredients  : Tea, Milk & Ginger         │");
                    System.out.println("│ ✨ Taste         : Hot & Aromatic             │");
                    System.out.println("└──────────────────────────────────────────────┘");

                    System.out.println("\n💬 Would You Like Anything Else?");
                    break;

                case 5:

                    System.out.println("\n┌──────────────────────────────────────────────┐");
                    System.out.println("│          🔙 RETURNING TO MAIN MENU           │");
                    System.out.println("├──────────────────────────────────────────────┤");
                    System.out.println("│ 🥤 Thank You For Visiting Juice Point!       │");
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