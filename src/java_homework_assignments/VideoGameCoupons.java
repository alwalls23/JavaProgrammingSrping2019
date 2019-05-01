package java_homework_assignments;
import java.util.*;
public class VideoGameCoupons {
	public static void main(String[] args) {
		int coupons, gumballs, candies;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of coupons:");
		coupons = scan.nextInt();
		
		if(coupons < 3) {
		System.out.println("Not enough coupons");
		}else {
		candies = coupons / 10;
		gumballs = (coupons % 10) / 3;
		
		System.out.println("Number of Candies: "+candies);
		System.out.println("Number of Gumballs: "+gumballs);
		
		}
	}
}
