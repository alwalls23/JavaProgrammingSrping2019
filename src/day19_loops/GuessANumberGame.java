package day19_loops;
import java.util.*;
public class GuessANumberGame {
	public static void main(String[] args) {
		/*
		 * Guess A number a game.
		 * secretNumber = 10;
		 * guessNumber = 5;
		 * "Your number is too small"
		 * guessNumber = 50
		 * "Your number is too large"
		 * guessNumber = 10;
		 * "Bingo! Congratulations, you won!"
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();//is used to generate random numbers
		
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
		int secretNumber = random.nextInt(101);//this will give us a number between 0 - 100
		int guessNumber;
		int attempts = 0;
		
		do {
			System.out.println("Guess a number between 0 - 100:");
			guessNumber = scan.nextInt();
			attempts++;
			if(guessNumber < secretNumber && attempts < 5) {
				System.out.println("Your number is too small");
			}else if(guessNumber > secretNumber && attempts < 5) {
				System.out.println("Your number is too large");
			}else if(attempts > 5) {
				System.out.println("Gameover: Too many attempts");
				return;
			}
				
		}while(guessNumber != secretNumber);
		
		System.out.println("Bingo. Congratulations, you've won!");
	}
}
