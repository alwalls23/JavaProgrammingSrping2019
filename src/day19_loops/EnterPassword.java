package day19_loops;
import java.util.*;	
public class EnterPassword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = "abc123";
		String input;
		
		do {
			System.out.println("Enter Password");
			input = scan.next();
		}while(!input.contentEquals(password));//if condition is true, it will keep running.
		//if input is not same as password, keeping asking to enter
		
	}
}
