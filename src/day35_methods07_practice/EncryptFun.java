package day35_methods07_practice;

public class EncryptFun {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word = "easter";
		
		//get a char from word
		//find indexOf the char in alphabet
		//read the char from encrypted at that index
		//add to some string
		
		char first = word.charAt(0);//e
		int position = alphabet.indexOf(first);
		System.out.println("Position: "+ position);
		char enChar = encrypted.charAt(position);
		System.out.println(first+" --> "+enChar);
		
		//with a loop
		String encryptedWord = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			//find in alphabet
			int index = alphabet.indexOf(ch);
			encryptedWord+= (encrypted.charAt(index));
		}
		System.out.println(word);
		System.out.println(encryptedWord);
	}
}
