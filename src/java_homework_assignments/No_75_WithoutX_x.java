package java_homework_assignments;

import java.util.*;

public class No_75_WithoutX_x {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String firstLetter = word.substring(0, 1);
		String lastLetter = word.substring(word.length() - 1);
		String result = "";
		if (firstLetter.equalsIgnoreCase("x") && lastLetter.equalsIgnoreCase("x")) {
			result += word.substring(1, word.length() - 1);
			System.out.println(result);
		} else if (firstLetter.equalsIgnoreCase("x")) {
			result += word.substring(1, word.length());
			System.out.println(result);
		} else if (lastLetter.equalsIgnoreCase("x")) {
			result += word.substring(0, word.length() - 1);
			System.out.println(result);
		} else {
			System.out.println(word);
		}

	}
}
