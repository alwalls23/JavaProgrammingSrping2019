package day54_inheritance_review_session;

public class Blocks_Practices {
	static String names;

	static {
		names = "John";
	}

	{
		names = "Aaron";
	}

	public Blocks_Practices() {
		names = "Muradil";
	}

	int num1 = 10;
	static int num2 = 10;

	public static void main(String[] args) {

		Blocks_Practices obj = new Blocks_Practices();
		obj.num1 = 20;
		obj.num2 = 20;

		Blocks_Practices obj2 = new Blocks_Practices();
		System.out.println(obj2.num1); // 10
		System.out.println(obj2.num2); // 20
		System.out.println(names);
	}
}
