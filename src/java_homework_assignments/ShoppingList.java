package java_homework_assignments;
import java.util.*;
public class ShoppingList {
	public static void main(String[] args) {
		String item1, item2, item3, report;
		double price1, price2, price3, totalPrice;
		int count1, count2, count3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Item1, count and its price:");
		item1 = scan.next();
		count1 = scan.nextInt();
		price1 = scan.nextDouble();
		
		System.out.println("Enter Item2, count and its price:");
		item2 = scan.next();
		count2 = scan.nextInt();
		price2 = scan.nextDouble();
		
		System.out.println("Enter Item3, count and its price:");
		item3 = scan.next();
		count3 = scan.nextInt();
		price3 = scan.nextDouble();
		
		totalPrice = 0;
		
		if(count1 > 0) 
			totalPrice += (count1 * price1);
		if(count2 > 0) 
			totalPrice += (count2 * price2);
		if(count3 > 0) 
			totalPrice += (count3 * price3);
		
		
		report = "";
		
		if(count1 > 0)
			report += "Item1:"+item1+" Price: "+(count1 * price1);
		if(count2 > 0)
			report += ", Item2:"+item2+" Price: "+(count2 * price2);
		if(count3 > 0)
			report += ", Item3:"+item3+" Price: "+(count3 * price3);
		
		System.out.println(report);
		System.out.println("Total price: "+totalPrice);
		
		
	}
}
