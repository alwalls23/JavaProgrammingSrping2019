package day31_methods03;

import java.util.Arrays;

public class MethodsWtihStrings {
	/*
	 * name: countWords
	 * return: Void
	 * params/args: String sentence
	 * countWords("Java is fun");
	 * "words in this sentence [Java, is fun]"
	 * Number of words: 3
	 *
	 */
	public static void main(String[] args) {
		countWords("Java is fun ");
		countWords("this is method with strings");
		googleSearchResults("About 807,000,000 results (0.79 seconds)");
		
		String str = "About 452,000,000 results (0.56 seconds)";
		googleSearchResults("About 452,000,000 results (0.56 seconds)");
		
	}
	public static void countWords(String sentence) {
		String [] words = sentence.split(" ");
		System.out.println("Words in this sentence"+ Arrays.toString(words));
		System.out.println("Number of words: "+words.length);
		
	}
//							0			1		2		3	   4
	//googleSearchResults("About 121,000,000 results (0.75 seconds)");
	public static void googleSearchResults(String result) {
		//split by space into array
		String [] words = result.split(" ");
		String count = words[1].replace(",", "");
		String seconds = words[3].replace("(", "");
		System.out.println("Results count: "+count);
		System.out.println("Time in seconds: "+seconds);
	}
}
