package day23_arrays_and_loops;

public class CheckNumber {
	public static void main(String[] args) {
		//Break statement example
		for (int i = 1; i <= 100; i++) {
			if(i == 16) {
				break;//breaks from the loop
			}
			System.out.println("number "+i);
		}
		
		//======================================================================================
		System.out.println();
		
		System.out.println("===========================================================");
		//Continue statement
		for (int i = 1; i <= 10; i++) {
			if(i % 2 > 0 ) {
				continue;//continues through loop until all conditions are met
			}
			System.out.println("number "+i);
		}
		
		//========================================================================================
		System.out.println();
		System.out.println("=============================================================");
		//Skip numbers example
		for (int i = 1; i <= 20; i++) {
			if(i >= 5 && i <= 10) { //checks to see if condition is true
				continue; //continues the loop
			}
			System.out.println("numer "+i);
		}
		
		
		
		
		
		
		
	}
}
