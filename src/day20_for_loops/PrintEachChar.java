package day20_for_loops;

public class PrintEachChar {
	public static void main(String[] args) {
		String word = "Wooden Spoon";
		//using for loop, print each char one by one
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		System.out.println();
		//using for loop, print only vowels 
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter =='o' || letter == 'u') {
				System.out.println(letter +", ");
			}
			System.out.println();
		//using for loop, print only consonants
		for( i = 0; i < word.length(); i++) {
			 letter = word.toLowerCase().charAt(i);
			if(!(letter == 'a' || letter == 'e' || letter == 'i' || letter =='o' || letter == 'u')) {
				System.out.println(letter +", ");
		}
			
		}
	}
}
}