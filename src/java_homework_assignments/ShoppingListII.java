package java_homework_assignments;

import java.util.*;

public class ShoppingListII {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		String answer = "";

		System.out.println("Enter Item1 and its price:");
		item = scan.next();
		price = scan.nextDouble();
		totalPrice = price;
		System.out.println("Add one more item?");
		answer = scan.next();
		String report = "Item1: " + item + " Price: " + price;
		if (answer.equals("yes")) {
			do {
				count++;
				System.out.println("Enter Item" + count + " and its price:");
				item = scan.next();
				price = scan.nextDouble();
				report += ", Item" + count + ": " + item + " Price: " + price;
				totalPrice += price;
				System.out.println("Add one more item?");
				answer = scan.next();
			} while (answer.equals("yes"));
		} else {
		}
		System.out.println(report);
		System.out.println("Total price: " + totalPrice);

	}
}
