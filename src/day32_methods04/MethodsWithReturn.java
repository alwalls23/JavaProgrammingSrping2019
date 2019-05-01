package day32_methods04;

public class MethodsWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i : "+i);
		
		System.out.println(giveMeYourName());
		String myName = giveMeYourName();
		System.out.println("My name is "+myName);
	}
	/*
	 * This method, returns int value
	 */
	public static int giveMe10$() {
		System.out.println("Returning 10 from Method");
		return 10;
	}
	/*
	 * giveMeYourName()
	 * return type: String
	 * Declare name variable and assisgn your name
	 * then return it call in main method
	 */
	public static String giveMeYourName() {
		String name = "Alex";
		return name;//return "Alex"
	}
}
