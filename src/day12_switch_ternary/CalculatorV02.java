package day12_switch_ternary;
import java.util.*;
public class CalculatorV02 {
	public static void main(String[] args) {
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
		switch(operator) {
		case "+":
			result = num1 + num2;
		case "-":
			result = num1 - num2;
		case "*":
			result = num1 * num2;
		case "/":
				result = num1 / num2;
		case "%":
			result = num1 % num2;
		default:
			System.out.println("Invalid operator selected: "+ operator);
			return;
			
		}
		}
		
	}

