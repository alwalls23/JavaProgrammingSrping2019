package java_homework_assignments;

import java.util.*;

public class No_87_HasAJava {
	public static void main(String[] args) {
		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() >= 2) {

			if (word.substring(0, 1).contains("j") || word.substring(1, 2).contains("j")) {
				System.out.println(true);
			} else {
				System.out.println(exists);

			}
		} else {
			System.out.println(false);
		}

	}
}
