package java_homework_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class No_106_ArraysSplitSentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// type your code below
		String[] split = sentence.split(" ");
		for (String words : split) {
			System.out.println(words);
		}
		System.out.println(Arrays.toString(split));

	}
}
