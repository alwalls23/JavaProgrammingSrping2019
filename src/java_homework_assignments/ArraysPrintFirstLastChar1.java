package java_homework_assignments;
import java.util.*;
public class ArraysPrintFirstLastChar1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	    for (String letter : words) {
			System.out.println(letter.substring(letter.charAt(0), letter.length()-1));
		}
	}
}
