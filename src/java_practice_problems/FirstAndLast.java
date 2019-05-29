package java_practice_problems;

import java.util.*;

public class FirstAndLast {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.next();

		System.out.print(word.charAt(0));
		System.out.println(word.charAt(word.length() - 1));

		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i) + " ");
		}
	}
}
