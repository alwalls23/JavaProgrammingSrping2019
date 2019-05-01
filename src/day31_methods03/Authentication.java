package day31_methods03;
import java.util.*;
public class Authentication {
	/*
	 * Name: Login
	 * Return type: void
	 * String args/params: username, password
	 * Inside the method:
	 * validUsername = "mentoring@cybertekschool.com"
	 * validPassword = "mentor001"
	 * 
	 * if username and password match, print "Login Successful! Welcome to Okta"
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Username");
		String userName = scan.next();
		System.out.println("Enter Password");
		String password = scan.next();
		login(userName, password);
		
	}
	public static void login(String userName,String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		
		if(userName.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful! Welcome to Okta!");
		}else {
			System.out.println("Sign in failed!");
		}
		
	}
}
