package java_homework_assignments;
import java.util.*;
public class FindAUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String fullName = "";
		
		System.out.println( "Enter full name:");
		fullName = scan.nextLine();
		
		if(fullName.equalsIgnoreCase("Max Payne")) {
			System.out.println("User found!");
		}else if(fullName.equalsIgnoreCase("Alan Wake")){
			System.out.println("User found!");
		}else {
			System.out.println("User not found!");
		}

	}
}
