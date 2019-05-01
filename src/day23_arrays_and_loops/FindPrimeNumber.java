package day23_arrays_and_loops;

import java.util.*;

public class FindPrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Find out if a number is Prime or not.");
		System.out.println("Enter number:");
		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a prime number");
				return;
			}
		}
		System.out.println(num + " is a prime number");

	}
}
