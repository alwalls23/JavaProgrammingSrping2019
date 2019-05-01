package day14_string_methods;
import java.util.*;
public class WordLength {
	public static void main(String[] args) {
		
	
	/*
	 * 	• Words
		○ Using scanner accept word1 and word2
		○ and compare their lengths
		○ word1 is longer ==> "word1Value is longer"
		○ word2 is longer ==> "word2Value is longer"
		○ same length ==> "word1Value and word2Value are same length

	 */
	
	
	Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 words: ");
		String word1 = scan.next();
		String word2 = scan.next();
		
		if(word1.length() > word2.length()) {
			System.out.println(word1 +" is longer");
		}else if(word1.length() < word2.length()) {
			System.out.println(word2 +" is longer");
		}else {
			System.out.println(word1+" and "+ word2+ " are same length");
	}
		
	
	
	
	}
	
}
