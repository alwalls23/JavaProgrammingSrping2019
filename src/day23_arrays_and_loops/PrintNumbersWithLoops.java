package day23_arrays_and_loops;

public class PrintNumbersWithLoops {
	public static void main(String[] args) {
		//this is just to print number from 1 to 10
//		for (int i = 0; i <= 10; i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		for (int i = 0; i < 10; i++) {
//			System.out.println();
//		}
		//outer loop
		for (int k = 0; k <= 3; k++) {
			
			for (int j = 1; j <= 2 ; j++) {
				//inner loop
				for (int i = 1; i <= 10; i++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			System.out.println("########################");
		}
		
		
	}
}
