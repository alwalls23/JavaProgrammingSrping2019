package java_homework_assignments;

import java.util.*;

public class ReverseIt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() == 5) {
			System.out.println(word.charAt(4) + "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + ""
					+ word.charAt(0));
		} else if (word.length() > 5) {
			System.out.println("Too long!");
		} else {
			System.out.println("Too short!");
		}

	}
}
