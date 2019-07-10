package day62_exceptions01;

public class TryCatchFinally {
	public static void main(String[] args) {
		String str = "selenium";

		try {
			System.out.println(str.length());
			System.out.println(str.charAt(0));
		} catch (Exception e) {
			System.out.println("Enter correct index");
			return;//get out of main method
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("AFTER TRY CATCH FINALLY");
		
	}
}
