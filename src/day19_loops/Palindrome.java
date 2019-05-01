package day19_loops;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		/*
		 * 1.reverse it and assign to different string
		 * 2. compare if it matches the word
		 * 
		 * 1. check first and last char
		 * 2. second car and second from end
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test:");
		String word = scan.next();
		String reversed = "";
		//loop through word in reverse order and
		//concetanate each character to reversed string
		int word2 = word.length()-1;
		while(word2 >= 0) {
			reversed = reversed + word.charAt(word2);
			word2--;
		}
//		System.out.println(reversed);
				
		//compare if word and reversed are equal
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("it is not palindrome");
			
		}
	}
}
