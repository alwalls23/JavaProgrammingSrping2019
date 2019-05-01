package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		//print all characters one by one
		System.out.println(word.length());
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
		
		//String word2 and check if first character is 'J'
		System.out.println();
		String word2 = "Gava";
		
		if(word2.charAt(0) == ('J')) {
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
		//System.out.println(word2.length());
		//System.out.println(word2.charAt(0));
		
		//String word3 that consists of 5 characters
		//Check if first and last characters are same,
		//true => "First and last match"
		//false => "Fist and last are different"
		System.out.println();
		
		String word3 = "civic";
		char first = word3.charAt(0);
		char last = word.charAt(4);
		
		if(first == last) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last are different");
		}
		
		//String word4 => always print the last character no matter the length
		
		String word4 = "abcddfieodinoa$";
		
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("last value of "+word4+" is "+ lastChar);
		
	}
}
