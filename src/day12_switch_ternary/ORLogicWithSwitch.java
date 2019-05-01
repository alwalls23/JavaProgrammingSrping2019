package day12_switch_ternary;

public class ORLogicWithSwitch {
	public static void main(String[] args) {
		char grade = 'A';
		//A or B or C = Pass   D or F = Fail
		switch(grade) {
			case 'A':
			case 'B':
			case 'C':
				System.out.println("Pass");
				break;
			case 'D':
			case 'F':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid Grade");
				
		}
	}
}
