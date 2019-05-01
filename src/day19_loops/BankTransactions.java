package day19_loops;
import java.util.*;
public class BankTransactions {
	public static void main(String[] args) {
		/*
		 * what is transaction amout?
		 * transaction
		 * we keep doing transactions until we run out of balance
		 * 100
		 * 30
		 * 40
		 * 40
		 * You have insufficient funds, your balance is -10.
		 * it needs to keep track of transactions count track count
		 * 2. if any transaction is about to make balance negative or 0, it needs to print a warning
		 * after every time , we make a trancation program shouw display remaining balance
		 * "successful transactions count:
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your current balance?");
			double balance = scan.nextDouble();
			int count = 0;
		while(balance >= 0) {
			count++;//increase transaction by 1
			System.out.println("What is transaction #"+count+" amount?");
			double transaction = scan.nextDouble();
//			balance = balance - transaction;
			balance -= transaction;
		if(transaction > balance) {
			System.out.println("Your balance is about to be negative due to this transaction");
			continue;//Go to top of loop right away
		}
		
			System.out.println("Current balance: "+ balance);
			
		}
		System.out.println("You have insuffient funds for any more transactions, your balance will be "+ balance);
		System.out.println("Your tanscation total count: "+count);
		
	}
}
