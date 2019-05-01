package day23_arrays_and_loops;

public class PrintWord {
	public static void main(String[] args) {
		String word = "java";
//		for (int i = 0; i <= word.length()-1; i++) { // if you use <= then you have to state a specific length ()-1...
//			System.out.print(word.substring(i, i+1));
//		}
			//======================================================================
			System.out.println();
			//update statement
			for (int i = 0; i <= word.length()-1; i++) { // if you use <= then you have to state a specific length ()-1...
				System.out.print(word.substring(i, i+1).contentEquals("a"));
				//if condition is true, go back to 
				//update statement
				continue;
				
//				System.out.println(word.substring(i, i+1));
			}
	}
}
