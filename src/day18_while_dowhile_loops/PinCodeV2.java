package day18_while_dowhile_loops;
import java.util.*;
public class PinCodeV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int secretPincode = 4321;
		
		//give only 3 attempts
		//if attempts reaches more than 3 print card blocked
		
		int pinCode = 0;
		int attempts = 0;
		
		while(pinCode != secretPincode && attempts <= 3) {
			System.out.println("enter pin code");
			pinCode = scan.nextInt();
			attempts++;
			if(attempts == 3 && pinCode != secretPincode) {
				System.out.println("Card is blocked");
				return;
			}
		}
		System.out.println("Access granted. Select operation.");
	}
}
