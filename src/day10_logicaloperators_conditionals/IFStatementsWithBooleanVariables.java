package day10_logicaloperators_conditionals;

public class IFStatementsWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = false;
		
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break Time yet");
		}
		//second version
		if(isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {		
			System.out.println("Not Break Time yet");
		}
		
		boolean classTime = false;
		
		if(classTime == false) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun!");
		}else {
			System.out.println("Take a walk and have some water");
		}
		
		boolean qualified = false;
		//send a notification message if not qualified
		//we need to check if qualified variable contains False
		if(qualified == false) {
			System.out.println("Congrats you qualified!");
		}else {
			System.out.println("Unfortunately you're not qualified");
		}
	}
}
