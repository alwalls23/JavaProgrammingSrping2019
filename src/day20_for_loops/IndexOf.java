package day20_for_loops;

public class IndexOf {
	public static void main(String[] args) {
		String word = "Amazon";
		char letter = 'm';
		int index = -1;
		//using for loop and look for the letter
		//if it is a match accessing value to index
		//exit for loop
		//print value of index
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {
				index = i;
				break;//exit the loop
			}
		}
		System.out.println("Index: "+index);
	}
}
