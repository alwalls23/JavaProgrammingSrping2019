package day04_primitives_operators;

public class StringsConcat {
	public static void main(String[] args) {
		//string variable called firstName and assign your firstname
		
		String firstName;
		firstName = "Alex";
		
		System.out.println(firstName);
		System.out.println("My first name is " + firstName);
		
		//city variable and assign city where you are from
		//Print: I was born in ...
		
		String city;
		city = "Chicago";
		
		System.out.println("I was born in "+ city);
		
		//Create a var: job and assign SDET to it
		//Create a var: company and assign any company
		//Print: I work as SDET in company
		
		String job;
		job = "SDET";
		String company;
		company = "Google";
		System.out.println("I work as " + job + " in " + company +".");
		
		//create int variable zipcode and assign zipcode of your home
		//Print: I live in (zipcode)
		
		String zipcode;
		zipcode = "22554";
		System.out.println("I live in " + zipcode + " zipcode.");
		
		
	}

}
