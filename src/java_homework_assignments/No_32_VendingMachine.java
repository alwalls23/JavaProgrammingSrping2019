package java_homework_assignments;
import java.util.*;
public class No_32_VendingMachine {
	public static void main(String[] args) {
		int itemPrice, quarters, dimes, nickels, change;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter price in cents:");
		itemPrice = scan.nextInt();
		change = 100 - itemPrice;
		quarters = change / 25;
		dimes = (change % 25) / 10;
		nickels = (change % 25 %10) / 5;
		
		
		if(itemPrice < 25) {
			System.out.println("Invalid price!");
		}else if(itemPrice > 100) {
			System.out.println("Invalid price!");
		}else if(itemPrice % 5!=0) {
		}else {
			System.out.println("Invalid price!");
		}
			
		System.out.println("Your change is "+quarters+", quarters, "+dimes+" dimes, and "+nickels+" nickels.");
		
	}
}
