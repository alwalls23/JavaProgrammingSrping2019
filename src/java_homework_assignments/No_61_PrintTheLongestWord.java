package java_homework_assignments;
import java.util.*;
public class No_61_PrintTheLongestWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //WIRTE YOUR CODE HERE
	    if(word1.length() > word2.length()){
	      System.out.println(word1);
	    }else{
	      System.out.println(word2);
	    }
}
}