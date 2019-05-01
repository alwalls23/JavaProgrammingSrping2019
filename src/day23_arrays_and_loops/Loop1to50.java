package day23_arrays_and_loops;

public class Loop1to50 {
	public static void main(String[] args) {
		/*
		 * loop through the numbers from 1 till 50
			print each number in the same line
			if number is divisible by 5 (n%5==0), skip it
			if number is divisible by 20, then exit the loop
		 */
		
		for (int i = 1; i <= 50; i++) {
			
			if(i % 40 == 0) {
				break;
			
			}
			if(i % 5 ==0) {
				continue;
						
			}
			System.out.print(i+" ");
		}
		
	}
}
