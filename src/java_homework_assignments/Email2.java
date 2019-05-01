package java_homework_assignments;
import java.util.*;
public class Email2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String email = scan.next();
		
		String firstName = email.substring(email.indexOf(0)+1, email.indexOf('_'));
		String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
		String domain1 = email.substring(email.indexOf('@')+1, email.indexOf('.'));
		String domain2 = email.substring(email.indexOf('.')+1, email.length());
		
		System.out.println("First name: "+ firstName.substring(0, 1).toUpperCase()+firstName.substring(1));
		System.out.println("Last name: "+ lastName.substring(0,1).toUpperCase()+lastName.substring(1));
		System.out.println("Domain: "+ domain1);
		System.out.println("Top-Level Domain: "+ domain2);
		
		
	}
}

