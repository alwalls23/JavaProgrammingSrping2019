package day08_casting_conditionals;

public class EplicitCasting {
	public static void main(String[] args) {
		
		System.out.println(10 / 2.0); //result is double
		System.out.println(10.0 / 2);
		
		int result = (int)(10 / 2.0);
					//10 / (int)2.0 will result in same outcome
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average = (rent1 + rent2 + rent3 + rent4) / 4.0;
		
		System.out.println("Average : " + average);
		
		double d = 40.2;
		int i = (byte)d;
		// in above statement both explicit and implicit casting happening 
		//explicit: double > byte,
		//implicit: byte > int
		
		
		
		
	}
}
