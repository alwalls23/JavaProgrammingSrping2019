package day23_arrays_and_loops;

public class PrintLettersWithLoops {
	public static void main(String[] args) {
		// Print 5 rows of letter from 'a' to 'z', in between line print stars

		// Outer loop will repeat printing of letters as many times as we want
		for (int i = 0; i < 4; i++) {
			// write a loop that will print letter from a to z
			if (i % 2 == 0) {
				// if index is even (it means 2,4,6.....) print from 'a' till 'z'
				for (char letter = 'a'; letter <= 'z'; letter++) {
					System.out.print(letter + " ");
				}
			} else {
				// if index is odd ( it means 1,3,5.....) print from 'z' till 'a'
				for (char letter = 'z'; letter >= 'a'; letter--) {
					System.out.print(letter + " ");
				}
			}
			System.out.println();
			System.out.println("***************************************************");

		}

	}
}
