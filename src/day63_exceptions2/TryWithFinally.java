package day63_exceptions2;

public class TryWithFinally {
	public static void main(String[] args) {
		//don't use it in real coding
		try {
			System.out.println("In Try block");
			System.out.println(10/0);
		}finally {
			System.out.println("In Finally");
		}
		System.out.println("After try finally");
	}
}
