package day11_logical_nestedif;
import java.util.*;
public class LogInTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName, password;
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		/*
		 * Conditions:
		 * username = validusername
		 * password = password
		 * print "Login Successful, Welcome!"
		 * 
		 * username != validUsername
		 * password != password
		 * print "Invalid Username and Invalid Password"
		 * 
		 * username == validUsername
		 * password !=password
		 * print "Invalid Password"
		 * 
		 * username !=validUsername
		 * password == password
		 * print "Invalid Username"
		 * 
		 */
				
		System.out.println("Welcome, please log in!");
		System.out.println("Enter User Name:");
		userName = scan.next();
		System.out.println("Enter Password:");
		password = scan.next();
		
		if(userName.equalsIgnoreCase(validUsername) && password.contentEquals(validPassword)) {
			System.out.println("Login Successful, Welcome!");
		}else if(!userName.equalsIgnoreCase(validUsername) && !password.equalsIgnoreCase(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
		}else if(userName.equalsIgnoreCase(validUsername) && !password.equalsIgnoreCase(validPassword)) {
			System.out.println("Invalid Password");
		}else if(!userName.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		}
	}
}
