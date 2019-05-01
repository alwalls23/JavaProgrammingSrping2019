package day23_arrays_and_loops;

public class PrintNumbersWithLoops2 {
	public static void main(String[] args) {
		
		//outer loop
		for (int j = 1; j <= 10; j++) {
			//inner loop
			for (int i = 1; i <= j ; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("==============================================");
		
		for (int h = 10; h >= 1; h--) {
			for (int k = h; k >= 1; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
