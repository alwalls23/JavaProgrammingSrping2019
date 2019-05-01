package day21_loops_practice1;
import java.util.*;
public class Register {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome, how many items are you purchasing?");
		int itemCount = scan.nextInt();
		String items = "";
		double totalPrice = 0;
		
		for (int count = 1; count <= itemCount ; count++) {
			System.out.println("What is item "+ count+"?");
			String itemName = scan.next();
			System.out.println("How much is "+itemName+"?");
			double itemPrice = scan.nextDouble();
			// add itemName to items and total and itemPrice to 
			items += itemName + ", ";
			totalPrice += itemPrice;
		}
		if(items.endsWith(", ")) {
			//get rid of that ", "
			
		}
		System.out.println("Your items: "+items);
		System.out.println("Your total Price: $"+totalPrice);
		
	}
}
