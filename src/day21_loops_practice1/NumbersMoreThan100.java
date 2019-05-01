package day21_loops_practice1;

import java.util.*;

public class NumbersMoreThan100 {
	public static void main(String[] args) {
		/*
		 * Ask user to enter 2 ints: if sum of those ints is not more than 100, then
		 * keep asking for 2 nums once sum of those 2 number is more than 100 then Print
		 * good numbers program ends
		 */

		Scanner scan = new Scanner(System.in);

		int sum = 0;

		while (sum <= 100) {
			System.out.println("Please enter 2 numbers:");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum = num1 + num2;
		}
			System.out.println("Good Numbers");

//		Scanner scan = new Scanner(System.in);
//		int sum = 0;
//		
//		do {
//			System.out.println("Enter 2 numbers");
//			int num1 = scan.nextInt();
//			int num2 = scan.nextInt();
//			sum = num1 + num2;
//		}while(sum <= 100);
//			System.out.println("Good Numbers");
	}
}
