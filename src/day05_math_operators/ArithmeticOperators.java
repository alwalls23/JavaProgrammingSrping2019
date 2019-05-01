package day05_math_operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// + - addition operator
		System.out.println(55 + 5);
		
		int chairs = 140;
		System.out.println(chairs + 2);
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		// - Subtraction/minus
		System.out.println(500 - 123);
		int result = 44 - 23;
		System.out.println(result);
		
		double balance = 1568.50;
		double transaction = 206.44;
		
		//System.out.println(balance - transaction);
		balance = balance - transaction;
		System.out.println(balance);
		
		//create a variable linesOffCode and assign 50 and print "Lines of code 50"
		//you deleted 2 lines
		//decrease the value of linesOffCode by 2 and print "Lines of code 48"
		
		int linesOfCode = 50;
		System.out.println("Lines of code " + linesOfCode);
		linesOfCode = linesOfCode -2;
		System.out.println("Lines of code " + linesOfCode);
		
		//Multiplication *
		System.out.println(22 * 2);
		
		//declare variables classes and assign 5
		int classes = 5;
		System.out.println(linesOfCode * classes);
		
		int totalLinesOfCode = linesOfCode * classes;
		//totalLinesOfCode = 240
		
		System.out.println("totalLinesOfCode=" + totalLinesOfCode);
		
		// Division operator /
		System.out.println(10/3);
		System.out.println(55/5);
		System.out.println(10.0/3);
		System.out.println(15.0/7);
		System.out.println(5.0/2);
		System.out.println(5/2.0);

		//System.out.println(11/0);//In Java if you divide by 0, code will compile.
		//But when code is running, Java will throw/show error	
		

	}

}
