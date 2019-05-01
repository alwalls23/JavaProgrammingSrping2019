package day21_loops_practice1;

public class StringMethodsReview {
	public static void main(String[] args) {
		String word = "javva";
		String unique = "";
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch)); // One way to turn a char into a String is to add "" next to it
		if(!unique.contains(""+ch)) {
			unique += ch;  //unique = unique +ch;
		}
		
		if(unique.indexOf(ch) == -1) {
			unique += ch;
		}
		System.out.println("Unique: "+ unique);
		
		//======================================================
		
		String word2 = "bananas";
		String unique2  = "";
		
		int i =0;
		char ch2 = word2.charAt(i);
		System.out.println("Ch2: "+ ch2);
		
		i = 1;
		ch2 = word2.charAt(i);
		System.out.println("Ch2: "+ ch2);
		
		i++;
		ch2 = word2.charAt(i);
		System.out.println("Ch2: "+ ch2);
		
		//check to see
		
	}
}
