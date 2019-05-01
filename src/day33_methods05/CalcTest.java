package day33_methods05;

public class CalcTest {
	public static void main(String[] args) {
		
		System.out.println(Calculator.add(3, 1));
		System.out.println(Calculator.multiply(5, 6));
		System.out.println(Calculator.minus(40, 12));
		System.out.println(Calculator.divide(100, 2));
		
		int addResult = Calculator.add(21, 41);
		double mResult = Calculator.multiply(50, 40);
		double miResult = Calculator.minus(3000, 200);
		double dResult = Calculator.divide(455, 5);
		
		System.out.println("Add result: "+addResult);
		System.out.println("Multiply result: "+mResult);
		System.out.println("Minus result: "+miResult);
		System.out.println("Divide reslut: "+dResult);
		
		double a = 10.0, b = 5.0;
		double myResult = Calculator.minus(a, b);
		System.out.println("My result: "+myResult);
		
		double [] dNums = {2.0, 4.0};
		double result2 = Calculator.multiply(dNums[0], dNums[1]);
		System.out.println("Reuslt2: "+ result2);
		
		if(Calculator.add(10, 16) == 26) {
			System.out.println("Add Unit Test Passed");
		}else {
			System.out.println("Add Unit Test Failed");
		}
		
		String str = "java";
				if(str.length() == 4) {
					System.out.println("It is 4 characters");
				}else {
					System.out.println("It is not 4 characters");
				}
		
	}
}
