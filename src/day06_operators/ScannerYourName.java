package day06_operators;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi, What is you name?");
		
		String name = scan.nextLine();//accept String input  
		System.out.println("Nice to meet you, " + name);
		
		
		
	}
}
