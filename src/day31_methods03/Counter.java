package day31_methods03;
import java.util.*;
public class Counter {
	/*
	 * 1) name: countUp return type: void param: int it prints from 1 to the value
	 * of the param countUp(5); 1 2 3 4 5
	 * 
	 * param value less than 1 then print "invalid input"
	 * 
	 * 2) name countDown return type: void param: int it prints from param value
	 * till 1 countDown(5); 5 4 3 2 1
	 * 
	 * countDown(0); "Invalid input"
	 */

	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("Invalid Input");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void countDown(int num) {
		if (num <= 0) {
			System.out.println("Invalid Input");
		} else {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter number to count up");
	int inputNum = scan.nextInt();
		countUp(inputNum);
	System.out.println("Enter number to count down");
	int inputNum2 = scan.nextInt();
		countDown(inputNum2);
	}
}
