package day08_casting_conditionals;

import java.util.Scanner;

public class PhoneNum {
	public static void main(String[] args) {
		int areaCode, localNumber;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your area code:");
		areaCode = scan.nextInt();
		System.out.println("Enter your local number:");
		localNumber = scan.nextInt();
		
		String phoneNumber = "("+areaCode+")-"+localNumber;
		
		System.out.println("Calling number " + phoneNumber);
		
				
	}

}
