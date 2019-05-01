package day23_arrays_and_loops;
import java.util.*;
public class SkipJava {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = "";
		String totalWords = "";
		for (int i = 0; i < 3 ; i++) {
			System.out.println("Enter word:");
			word = scan.next();
			if(word.equals("java")) {
				continue;
			}
			totalWords += word+ ", ";
		}
		System.out.println("All of the words: "+(totalWords.length() > 1 ? (totalWords.substring(0, totalWords.length()-2)) :" "));
	}
}
