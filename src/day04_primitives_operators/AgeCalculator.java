package day04_primitives_operators;

public class AgeCalculator 
{
	public static void main(String[] args) {
		//Declare variable year of Birth and assign some year
		//Declare variable current Year and assign 2019
		//Declare variable age and calculate the age and 
		//assign result to it
		//Print: if you are born in year
		//Then you are <> years old
		
		int yearofBirth = 1990;
		int currentYear = 2019;
		int age = currentYear - yearofBirth;
		
		System.out.println("If you are born in " + yearofBirth + ".");
		System.out.println("Then you are " + age + ".");
		
	}

}
