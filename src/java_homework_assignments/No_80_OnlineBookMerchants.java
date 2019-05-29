package java_homework_assignments;

import java.util.Scanner;

public class No_80_OnlineBookMerchants {
	public static void main(String[] args) {
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();

		if (nbooksPurchased >= 5 && nbooksPurchased < 8) {
			isPremiumCustomer = true;
			freeBooks += 1;
		} else if (nbooksPurchased >= 8) {
			isPremiumCustomer = true;
			freeBooks += 2;
		} else if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
			isPremiumCustomer = false;
			freeBooks += 1;
		} else if (nbooksPurchased >= 12) {
			isPremiumCustomer = false;
			freeBooks += 2;
		}
		System.out.println("Free Books " + freeBooks);
	}
}
