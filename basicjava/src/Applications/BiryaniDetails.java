package Applications;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BiryaniDetails {
//concrete method created below
	void showBiryaniMenu() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {

				System.out.println("\n╔══════════════════════════════════════════════╗");
				System.out.println("║         🍛 SOUTH INDIAN BIRYANI MENU 🍛      ║");
				System.out.println("╠══════════════════════════════════════════════╣");
				System.out.println("║  1️⃣  Hyderabadi Biryani      💰 ₹299         ║");
				System.out.println("║  2️⃣  Kunda Biryani           💰 ₹249         ║");
				System.out.println("║  3️⃣  Bongulo Biryani         💰 ₹219         ║");
				System.out.println("║  4️⃣  🔙 Back To Main Menu                    ║");
				System.out.println("╚══════════════════════════════════════════════╝");

				

				System.out.print("\n👉 Please Enter Your Choice : ");

				int choice = sc.nextInt();

				switch (choice) {

				case 1:

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║      🍛 HYDERABADI BIRYANI 🍛      ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ 💰 Price        : ₹299             ║");

					ResturantClient.totalBill += 299;//which is for storing the bill

					System.out.println("║ 🧾 Price Added  : ₹299             ║");
					System.out.println("║ 💵 Current Bill : ₹" + ResturantClient.totalBill + "              ║");//which is for displaying the current  bill.

					System.out.println("║ 🌍 Origin       : Hyderabad        ║");
					System.out.println("║ 😋 Flavor       : Spicy & Aromatic ║");
					System.out.println("║ 🍚 Ingredients  : Basmati Rice     ║");
					System.out.println("║ 🍗 Includes     : Chicken & Spices ║");
					System.out.println("║ ✨ Taste         : Rich & Flavorful ║");
					System.out.println("╚════════════════════════════════════╝");

					System.out.println("\n💬 Would You Like To Order Anything Else?");
					break;

				case 2:

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║          🍲 KUNDA BIRYANI 🍲       ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ 💰 Price        : ₹249             ║");

					ResturantClient.totalBill += 249;

					System.out.println("║ 🧾 Price Added  : ₹249             ║");
					System.out.println("║ 💵 Current Bill : ₹" + ResturantClient.totalBill + "              ║");

					System.out.println("║ 🌍 Origin       : Tamil Nadu       ║");
					System.out.println("║ 😋 Flavor       : Tangy & Spicy    ║");
					System.out.println("║ 🍚 Ingredients  : Seeraga Samba    ║");
					System.out.println("║ 🍖 Includes     : Mutton           ║");
					System.out.println("║ ✨ Taste         : Unique Aroma     ║");
					System.out.println("╚════════════════════════════════════╝");

					System.out.println("\n💬 Would You Like To Order Anything Else?");
					break;

				case 3:

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║         🍗 BONGULO BIRYANI 🍗      ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ 💰 Price        : ₹219             ║");

					ResturantClient.totalBill += 219;

					System.out.println("║ 🧾 Price Added  : ₹219             ║");
					System.out.println("║ 💵 Current Bill : ₹" + ResturantClient.totalBill + "              ║");

					System.out.println("║ 🌍 Origin       : Tamil Nadu       ║");
					System.out.println("║ 😋 Flavor       : Light & Peppery  ║");
					System.out.println("║ 🍚 Ingredients  : Jeera Rice       ║");
					System.out.println("║ 🍗 Includes     : Chicken & Pepper ║");
					System.out.println("║ ✨ Taste         : Soft & Mild      ║");
					System.out.println("╚════════════════════════════════════╝");

					System.out.println("\n💬 Would You Like To Order Anything Else?");
					break;

				case 4:

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║      🔙 RETURNING TO MAIN MENU     ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ 💵 Current Total Bill : ₹" + ResturantClient.totalBill + "        ║");
					System.out.println("║ 🍽 Thank You For Visiting!         ║");
					System.out.println("╚════════════════════════════════════╝");

					ResturantClient.main(null);
					
					break;

				default:

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║         ❌ INVALID CHOICE ❌        ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ ⚠ Please Select Between 1 and 4    ║");
					System.out.println("╚════════════════════════════════════╝");
				}

			}

			catch (InputMismatchException e) {

				System.out.println("\n╔════════════════════════════════════╗");
				System.out.println("║         ⚠ INVALID INPUT ⚠         ║");
				System.out.println("╠════════════════════════════════════╣");
				System.out.println("║ 🔢 Please Enter Numbers Only       ║");
				System.out.println("║ 👉 Valid Options : 1 - 4           ║");
				System.out.println("║ ❌ Error : " + e + "               ║");
				System.out.println("╚════════════════════════════════════╝");
				sc.nextLine();//sc.nextLine(); is used here to clear the invalid input from the Scanner buffer after an exception occurs.
			}
		}
	}
}