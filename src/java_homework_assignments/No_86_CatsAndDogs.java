package java_homework_assignments;

import java.util.*;

public class No_86_CatsAndDogs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String cats = "";
		String dogs = "";
		String word = scan.next();

		for (int i = 0; i <= word.length() - 3; i++) {
			cats = word.substring(i, i + 3);
			if (cats.equals("cat")) {
				countOfCats++;
			}
		}
		for (int n = 0; n <= word.length() - 3; n++) {
			dogs = word.substring(n, n + 3);
			if (dogs.equals("dog")) {
				countOfDogs++;
			}

		}
		if (countOfCats == countOfDogs) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
