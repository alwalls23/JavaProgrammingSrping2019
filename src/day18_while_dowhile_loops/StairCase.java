package day18_while_dowhile_loops;

public class StairCase {
	public static void main(String[] args) throws InterruptedException {
		String stairs = "*";
		System.out.println(stairs);
		
//		stairs= stairs +"*";
//		System.out.println(stairs);
//		
//		stairs += "*";
//		System.out.println(stairs);
		
		//1) with a counter
		int num = 1;
		while(num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
			Thread.sleep(1000);
		}
		//2) checking length()
		stairs = "*";
		while(stairs.length() <= 10) {
			System.out.println(stairs);
			stairs +="*";
			Thread.sleep(1000);
		}
		
		stairs = "**********";
		while(stairs.length() >= 1) {
			System.out.println(stairs);
			
			
		}
		
	}
}
