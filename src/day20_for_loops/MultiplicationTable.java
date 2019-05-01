package day20_for_loops;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		//check if it is valid.
		//if it not valid return
		
		if(num < 1 || num > 10) {
			System.out.println("ERROR: Invalid input");
			return;//stop execution here
			//System.exit(0); stop execution
		}
		//for loop to print multiplication table table
		for(int i = 1; i <= 10; i++) {
			System.out.println(num+" x "+i+" = "+(num * i));
		}
		
	}
}
