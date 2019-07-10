package day62_exceptions01;

public class TryCatch2 {
	public static void main(String[] args) {
		int [] nums = {34,6,34,12};
		//Handle if any issures with below line.
		//if any exception happens, print "Wrong Index"
		
		try {
		System.out.println(nums[6]);
		}catch (Exception e) {
			System.out.println("Wrong Index");
		}
		
		System.out.println("Some code after array");
		try {
		int j = 100;
			int n = j / 0; // cannot divide by Zero, Arithmetic exception
		System.out.println(n);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
			e.printStackTrace();
		}
	}
}
