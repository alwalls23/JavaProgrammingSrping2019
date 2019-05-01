package java_homework_assignments;

import java.util.*;

public class MergeThem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();

		if (word1.length() == word2.length()) {
			int letter1 = word1.length() / 2;
			int letter2 = word2.length() / 2;
			System.out.println(word1.charAt(letter1 - 1) + "" + word2.charAt(letter2 - 1) + "" + word1.charAt(letter1)
					+ "" + word2.charAt(letter2) + "" + word1.charAt(letter1 + 1) + "" + word2.charAt(letter2 + 1));
		} else {
			System.out.println("cannot merge");
		}

	}
}
