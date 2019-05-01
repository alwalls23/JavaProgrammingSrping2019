package day33_methods05;

public class Calculator {
	public static void main(String[] args) {
		
		addVoid(2,5);
//		System.out.println(addVoid(4,6)); will not print because addVoid does not return a value, it just perform an action
		int result = add(4,8);
		System.out.println("Result "+result);
		result = add(10,30);
		System.out.println("Result "+result);
	}
	
	/*
	 * 1) method addVoid
	 * return type: void
	 * params: int num1, int num2
	 * add them and print sum
	 */
	
	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: "+sum);
	}
	/*
	 * 2) method name: add
	 * return type: int
	 * params: int num1, int num2
	 * add them and return the sum
	 */
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	/*
	 * method multiply with return value
	 * method minus with return value
	 * method divide with return value
	 */
	
	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	public static double minus(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	public static double divide(double num1, double num2) {
		if(num2 == 0 ) {
			System.out.println("ERROR: Cannot divide by 0");
			return 0;
//			System.exit(0);// stop the whole code
		}else {
		double result = num1 / num2;
		return result;
		}
	}
}
