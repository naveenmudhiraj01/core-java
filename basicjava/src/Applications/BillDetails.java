package Applications;

public class BillDetails {
	//concrete method created below

    void showBill() {

        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║             🧾 TOTAL BILL          ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 💵 Amount Payable : ₹" 
                            + ResturantClient.totalBill + "         ║");
        System.out.println("╚════════════════════════════════════╝");
    }
}