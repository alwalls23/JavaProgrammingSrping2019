package day08_casting_conditionals;

import java.util.Scanner;
public class VotingEligibility {
	public static void main(String[] args) {
		/*
		 Program to tell if you are eligible to vote.
		 votingAge =18
		 yourAge = take from scanner
		 if you are eligible to vote:
		 you are eligible to vote.
		 you have been eligible for 3 years
		 else
		 you are not eligible to vote
		 you still have 3 years to go
		 */
		int votingAge, yourAge;
		votingAge = 18;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How old are you?");
		yourAge = scan.nextInt();
		int years = yourAge - votingAge;
		if(yourAge >= votingAge) {
			System.out.println("You are eligible to vote!");
			System.out.println("You have been eligible for "+years+" years.");
			
		}else {
			int moreYears = votingAge - yourAge;
			System.out.println("You are not eligible to vote.");
			System.out.println("You still have "+(-years)+" years to go.");
			//System.out.println("You still have "+moreYears+" years to go.");
		}
		
		
		
	}
}
