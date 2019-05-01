package day12_switch_ternary;
import java.util.*;
public class CalculatorV01 {
	public static void main(String[] args) {
		/*
		 * program flow:
			Enter first number
			5
			Enter second number
			6
			Select Operation: +,-,*,/,%
		 *	Result: 30.0
			double num1, num2, result
			String operator
			Scanner input
		 */
		//get numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 = input.nextDouble();
		
		System.out.println("Enter second number:");
		double num2 = input.nextDouble();
		//get operator
		System.out.println("Select Operator: +, -, *, /, %");
		String operator = input.next();
		
		double result = 0.00;//assigned 0.0 to prevent compile errors
		//perform calculation and display results
		if(operator.equals("+")) {
			result = num1 + num2;
			//System.out.println("Result: "+ result);
		}else if(operator.equals("-")) {
			result = num1 - num2;
		}else if(operator.equals("*")) {
			result = num1 * num2;
		}else if(operator.equals("/")) {
			result = num1 / num2;
		}else if (operator.equals("%")) {
			result = num1 % num2;
		}else {
			System.out.println("Invalid operator selected: "+ operator);
			return;//Do not execute the remaining code. STOP HERE
		}
		System.out.println("Result: "+ result);
		//System.out.println("Result: "+ Math.round(result)); if you want to round numbers
	}
}
