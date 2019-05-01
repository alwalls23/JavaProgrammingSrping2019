package day09_stringequals_conditionals;

public class IfElseNoBraces {
	public static void main(String[] args) {
		String day = "Tuesday";
		
		if(day.equals("Tuesday"))
			System.out.println("Today is Tuesday");
		else 
			System.out.println("Today is not Tuesday");
			System.out.println("Tuesday is not today");//this line is not part of Else block
		
	}
}
