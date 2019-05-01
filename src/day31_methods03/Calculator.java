package day31_methods03;

import java.util.Scanner;

public class Calculator {
	// add, subtract, multiply, divide, remainder
	public static void main(String[] args) {
		add(2.5, 5);
		subtract(2000,300);
		multiply(5,5);
		divide (105.4, 0);
		remainder(7,3);
	//using scanner pass 2 number and operator
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+', '-', '*', '/', '%'");
		String operator = scan.next();
		
		//using switch statement, call the matching method to perform calculation
		switch (operator) {
			case "+":
				add(n1, n2);
				break;
			case "-":
				subtract(n1, n2);
				break;
			case "*":
				multiply(n1, n2);
				break;
			case "/":
				divide(n1, n2);
				break;
			case "%":
				remainder(n1, n2);
				break;
			default:
				
		}
	}
	
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result: " + result);
		
	}
	public static void subtract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Result: "+ result);
	}
	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Result: "+ result);
	}
	public static void divide(double num1, double num2) {
		if(num2 == 0 ) {
			System.out.println("Cannot / by zero");
			return;
		}
		double result = num1 / num2;
		System.out.println("Result: "+ result);
	}
	public static void remainder(double num1, double num2) {
		double result = num1 %num2;
		System.out.println("Result: "+ result);
	}
}
