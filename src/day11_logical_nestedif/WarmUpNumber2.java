package day11_logical_nestedif;
import java.util.*;
public class WarmUpNumber2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the time: \n(In 24 hour format)");
		byte hour = scan.nextByte();
		boolean isSleepy = scan.hasNext();
		
		if(hour >= 7 && hour < 12) {
			if(isSleepy) {
				System.out.println("Go back to sleep!");
			}
			System.out.println("Good Morning!!!");
		}else if(hour >= 12 && hour < 16) {
			System.out.println("Good afternoon!!!");
		}else if(hour > 16 && hour <= 24) {
			System.out.println("Good Evening!!!");
		}else if(hour < 7) {
			System.out.println("Go back to sleep!!");
		}else {
			System.out.println("Invalid Time!");
		}
	}
}
