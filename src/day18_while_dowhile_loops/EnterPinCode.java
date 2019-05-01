package day18_while_dowhile_loops;

import java.util.*;

public class EnterPinCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretPincode = 1234;

		int pincode = 0;

		// keep asking for a pincode until correct one entered

		System.out.println("Please enter pin code.");
		pincode = scan.nextInt();

		while (pincode != secretPincode) {
			System.out.println("Please re-enter pin code.");
			pincode = scan.nextInt();
		}
		System.out.println("Access granted, select operation");
	}
}
