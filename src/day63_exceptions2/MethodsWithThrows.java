package day63_exceptions2;

public class MethodsWithThrows { // DECLARE
	public static void main(String[] args) throws Exception {
		/*
		 * We are calling a method that throws a CHECKED exception We must either HANDLE
		 * or DECLARE for it to compile
		 */
		// HANDLE
		try {
			playWithMatches();
		} catch (Exception e) {
			System.out.println("STOPPED the fire with Extinguisher");
		}

		playWithMatches();
		
		playSoccer();
		
		
	}

//THROWS CHECKED EXCEPTION
	public static void playWithMatches() throws Exception {
		System.out.println("Playing with matches can cause fire");
	}

//THROWS UNCHECKED EXCEPTION									
	public static void playSoccer() throws RuntimeException {
		System.out.println("Playing soccer with friends");
	}
}
