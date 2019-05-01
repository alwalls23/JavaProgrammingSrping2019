package day18_while_dowhile_loops;

public class ZeroToOneHundred {
	public static void main(String[] args) {
		
		int counter = 0;
		
//		while(true) {
//			System.out.println(counter);      This create an infinite loop until it reaches byte memory limit.
//			counter++;
//		}
		
		while(counter <= 100) {
			System.out.println(counter);
			counter++; //counter = counter+1;
		}
		System.out.println("Counter:" +counter);
	}
}
