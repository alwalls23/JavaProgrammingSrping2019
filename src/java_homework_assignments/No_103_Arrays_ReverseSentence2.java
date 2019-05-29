package java_homework_assignments;

import java.util.*;

public class No_103_Arrays_ReverseSentence2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		// TODO: start your code here
		String [] sentenceArray = sentence.split(" ");
		for (int i = sentenceArray.length-1; i >= 0; i--) {
			reversed+= sentenceArray[i]+" ";
		}
		reversed = reversed.trim();
		// End your code here. do not modify below statement
		System.out.println(reversed);
	}
}
