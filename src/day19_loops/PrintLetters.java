package day19_loops;

public class PrintLetters {
	public static void main(String[] args) {
		String word = "Amazon";
					 //012345 how char counts
				     //123456 how index counts
		// print each character one by one in separate lines
		int idx = 0;
		while(idx < word.length()) {
			System.out.println(word.charAt(idx));
			idx++;
		}
		
		System.out.println();
		// print each character in reverse
		int idx2 = word.length()-1;//5
		
		while(idx2 >= 0) {
			System.out.println(word.charAt(idx2));
			idx2--;
		}
		
		
//		System.out.println(word.charAt(idx));
//		idx++;
//		System.out.println(word.charAt(idx));
//		idx++;
//		System.out.println(word.charAt(idx));
//		idx++;
//		System.out.println(word.charAt(idx));
//		idx++;
//		System.out.println(word.charAt(idx));
//		idx++;
//		System.out.println(word.charAt(idx));
		
		
		
	}
}
