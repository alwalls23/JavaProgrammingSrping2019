package java_homework_assignments;

import java.util.*;

public class PrintLetters {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);
		
		for (char letter = start; letter <= end; letter++) {
			System.out.print(letter);
			
		}

	}
}
