package Applications;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ResturantClient {

	static int totalBill = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		boolean running=true;

		while (true) {

			try {


				

				System.out.println("\n╔══════════════════════════════════════════════════════╗");
				System.out.println("║              🍽 WELCOME TO FOOD COURT 🍽             ║");
				System.out.println("╠══════════════════════════════════════════════════════╣");
				System.out.println("║  1️⃣  Biryani Menu        🍛  Starting From ₹219      ║");
				System.out.println("║  2️⃣  Ice Cream Menu      🍨  Starting From ₹99       ║");
				System.out.println("║  3️⃣  Drinks Menu         🥤  Starting From ₹39       ║");
				System.out.println("║  4️⃣  View Total Bill     🧾                          ║");
				System.out.println("║  5️⃣  Exit                ❌                          ║");
				System.out.println("╚══════════════════════════════════════════════════════╝");

				System.out.print("\n👉 Please Enter Your Choice : ");

				int choice = sc.nextInt();

				switch (choice) {

				case 1:

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║        🍛 BIRYANI SPECIALS 🍛      ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ 🔥 Experience the Royal Taste!     ║");
					System.out.println("║ 🍽 Freshly Cooked Delicious Meals! ║");
					System.out.println("║ 💰 Starting Price : ₹219           ║");
					System.out.println("╚════════════════════════════════════╝");

					BiryaniDetails b = new BiryaniDetails();
					b.showBiryaniMenu();
					break;

				case 2:

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║        🍨 ICE CREAM WORLD 🍨       ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ ❄ Sweet, Creamy & Chilling Treats ║");
					System.out.println("║ 🍦 Happiness in Every Scoop!       ║");
					System.out.println("║ 💰 Starting Price : ₹99            ║");
					System.out.println("╚════════════════════════════════════╝");

					IceCreamDetails c = new IceCreamDetails();
					c.showIcecreamDetails();
					break;

				case 3:

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║          🥤 DRINKS CORNER 🥤       ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ 🍹 Cool & Refreshing Beverages     ║");
					System.out.println("║ ⚡ Recharge Yourself Instantly!    ║");
					System.out.println("║ 💰 Starting Price : ₹39            ║");
					System.out.println("╚════════════════════════════════════╝");

					DrinksDetails d = new DrinksDetails();
					d.showDrinksMenu();
					break;

				case 4:

					BillDetails bill=new BillDetails();
					bill.showBill();
					
					break;

				case 5:
				

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║      🙏 THANK YOU FOR VISITING!    ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ 🍽 Hope You Enjoyed Your Meal!     ║");
					System.out.println("║ 😊 Have a Wonderful Day Ahead!     ║");
					System.out.println("║ 💰 Final Bill Amount : ₹" + totalBill + "         ║");
					System.out.println("║ 👋 Visit Again Soon!               ║");
					System.out.println("╚════════════════════════════════════╝");

					System.exit(0);
//					running=false;
					break;

				default:

					System.out.println("\n╔════════════════════════════════════╗");
					System.out.println("║          ❌ INVALID CHOICE ❌       ║");
					System.out.println("╠════════════════════════════════════╣");
					System.out.println("║ ⚠ Please Select Between 1 and 5    ║");
					System.out.println("╚════════════════════════════════════╝");
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

			    sc.nextLine();
			}
		}
	}
}