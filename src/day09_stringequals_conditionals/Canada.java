package day09_stringequals_conditionals;
import java.util.*;														
public class Canada {
	public static void main(String[] args) {
		/*
		 * Create a class Canada
		 * Ask user "What is the capital of Canada?"
		 * using scanner assign the value to capital variable.
		 * Check if the answer is correct.
		 * 	=> Your answer is correct!
		 * false
		 * 	=> Your answer is incorrect! value is not capital of Canada
		 * Using .equalsIgnoreCase method to not worry about upper and lower case differences
		 */
		Scanner scan = new Scanner(System.in);
		String capital;
		
		System.out.println("What is the capital of Canada?");
		capital = scan.nextLine();
		
		if(capital.equalsIgnoreCase("Ottawa")) {
			System.out.println("Your answer is correct!");
			
		}else {
			System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada.");
			
		}
				
	}
}
