package day62_exceptions01;

public class ExceptionInCatch {
	public static void main(String[] args) {
		String str = "10j"; // A
		try {
			int n = Integer.parseInt(str); // B
			System.out.println(n); // D
		} catch (NumberFormatException e) {
			System.out.println(str.charAt(10)); // D
			System.out.println("Hello from the Catch block!"); // E
		} finally {
			System.out.println("Hello from Finally block!");
		}
		System.out.println("BYE BYE");//Z
	}
}
