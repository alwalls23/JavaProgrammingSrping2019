package java_homework_assignments;
import java.util.*;
public class No_31_CaffineOverDose {
	public static void main(String[] args) {
		double ounce, milligrams, grams, drinks;
		milligrams = 1000;
		grams = 1 / milligrams;
		ounce = 40 * grams;
		drinks = 500 * ounce;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of milligrams in drink:");
		milligrams = scan.nextDouble();
		
		System.out.println("It would take about "+drinks+" drinks for a lethal overdose.");
		
	}
}
