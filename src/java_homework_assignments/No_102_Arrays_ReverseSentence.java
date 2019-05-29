package java_homework_assignments;

import java.util.*;

public class No_102_Arrays_ReverseSentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// TODO: Type your code below
//		String word = "";
		String[] sentenceArray = sentence.split(" ");
		for (int i = sentenceArray.length - 1; i >= 0; i--) {
			System.out.println(sentenceArray[i]);
		}

	}
}
