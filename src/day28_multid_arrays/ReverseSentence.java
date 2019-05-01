package day28_multid_arrays;
import java.util.*;
public class ReverseSentence {
	public static void main(String[] args) {
						//  0   1   2       3          4   
		String sentence = "You are very interesting person";
		
//		String sentence = "you love java";
		
		String [] arrSentence = sentence.split(" ");
		
		System.out.println("Number of words: "+arrSentence.length);
		
		System.out.println(Arrays.toString(arrSentence));
		
		String reversed = "";
		
		for (int i = arrSentence.length-1; i >=0 ; i--) {
//			System.out.println(arrSentence[i]);
			reversed += arrSentence[i]+" ";
			
		}
		reversed = reversed.trim();
		System.out.println(reversed);
	}
}
