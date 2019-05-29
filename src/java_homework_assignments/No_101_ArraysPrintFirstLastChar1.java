package java_homework_assignments;
import java.util.*;
public class No_101_ArraysPrintFirstLastChar1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	    for (String letter : words) {
			System.out.print(letter.charAt(0));
			System.out.println(letter.charAt(letter.length()-1));
		}
	}
}
