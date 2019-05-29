package java_homework_assignments;

import java.util.*;

public class No_64_MiddleOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// YOUR CODE HERE

		if (word.length() >= 3 && (word.length() % 2 == 1)) {
			char middleWord = word.charAt((word.length() / 2));
			System.out.println(middleWord);
		} else if (word.length() == 1) {
			System.out.println(word + "" + word + "" + word);
		}
		if (word.length() >= 4 && (word.length() % 2 == 0)) {
			int middleWord = word.length() / 2;
			System.out.println(word.charAt(middleWord - 1) + "" + word.charAt(middleWord));
		} else if (word.length() == 2) {
			System.out.println(word + "" + word);
		}

	}
}
//system.out.println(word.charAt(middle -1) +""+ word.charAt(middle));
