package day51_inheritance04;

public class Exercise {
	/*
	 * Exercise:
	public int perform(int minutes)
		"Doing general exercise"
			4 calories per minute
	-> Running
		"Running"
		10 cal/minute
	-> Swimming
		11 cal/minute
	-> Yoga
		5 cal/minute
	-> JuiJitsu
		12 cal/minute

	perform(int minutes)
		4 calories per minute
		Multiple classes can be stored in same file, but only one of them
		needs to be public, and file name must match the public class
	 */
	
	public int perform(int minutes) {
		System.out.println("Doing general exercise");
		return minutes * 4;
	}
	
//	class Running extends Exercise{
//		
//	}
}
