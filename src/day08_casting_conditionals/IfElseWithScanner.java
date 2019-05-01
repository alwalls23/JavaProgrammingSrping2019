package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {
	public static void main(String[] args) {
		//passingPercentage = 65;
		//yourScorePercentage = take from scanner
		//check if you passed or failed
		int passingPercentage, yourScorePercentage;
		
		passingPercentage = 65;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your score: ");
		yourScorePercentage = scan.nextInt();
		
		if(yourScorePercentage >= passingPercentage) {
			System.out.println("YOU PASSED! CONGRATULATIONS!");
		}else {
			System.out.println("YOU FAILED! STUDY MORE!");		
			
		}
		
		
		
		
		
		
	
		
	}
}
