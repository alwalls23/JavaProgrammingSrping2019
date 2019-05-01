package day30_methods02;

import java.util.*;

public class RangePrint {
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if (num1 > num2) {
			for (int i = num1; i >= num2; i--) {
				System.out.print(i + " ");
			}
		} else if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println(num1);
		}
	}

	public static void main(String[] args) {
		rangePrint();
	}
}
