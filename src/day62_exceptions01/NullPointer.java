package day62_exceptions01;

public class NullPointer {
	static String name; //null - no value, not pointing to anything in the Heap
	
	

	public static void main(String[] args) {
		try {
		System.out.println(name.toUpperCase());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException happened");
			System.out.println("Here is the Message: " + e.getMessage());
			System.out.println("Here is the stackTrace");
			e.printStackTrace();
		}
	}
}
