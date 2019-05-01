package day20_for_loops;

public class ForLoops {
	public static void main(String[] args) throws InterruptedException {
		//Using for loop print "love Java!" 10 times
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Love Java!");
		}
		//Print number from 5 to 15 using a for loop
		System.out.println();
		for(int i = 5; i <= 15; i++) {
			System.out.println(i);
		}
		// For loop - print 20 - 10
		System.out.println();
		for(int num = 20; num >= 10; num--) {
			System.out.print(num+" ");
			Thread.sleep(500);
		}
		
		}
		
}
