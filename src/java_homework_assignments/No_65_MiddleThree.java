package java_homework_assignments;

import java.util.*;

public class No_65_MiddleThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() >= 5 && word.length() % 2 == 1) {
			int midThree = word.length() / 2;
			System.out.println(word.charAt(midThree - 1) + "" + word.charAt(midThree) + "" + word.charAt(midThree + 1));
		} else {
			System.out.println("invalid");
		}
	}
}
