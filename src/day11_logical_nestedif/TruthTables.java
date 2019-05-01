package day11_logical_nestedif;

public class TruthTables {
	public static void main(String[] args) {
		System.out.println("#### TRUTH TABLE FOR && OPERATOR####");
		System.out.println("When true and true - result is " + (true && true));//true
		System.out.println("When true && false - result is " + (true && false));//false
		System.out.println("When false && true - reslut is " + (false && true));//false
		System.out.println("Wehn false && false - result is " + (false && false));//false
		System.out.println();
		
		System.out.println("#### TRUTH TABLE FOR || OPERATOR####");
		System.out.println("When true or true - result is " + (true || true));//true
		System.out.println("When true or false - result is " + (true || false));//true
		System.out.println("When false or true - result is " + (false || true));//true
		System.out.println("When false or false - result is " + (false || false));//false
		System.out.println();
		
		System.out.println("####TRUTH TABLE FOR ! (not) OPERATOR####");
		System.out.println("When !true - result is " + (!true));//false
		System.out.println("When !false - result is "+ (!false));//true
		
		
		
	}
}
 