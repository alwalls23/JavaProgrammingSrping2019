package day04_primitives_operators;

public class CitiesTogether {
	public static void main(String[] args) {
		String city1;
		city1 = "Tashkent";
		String city2;
		city2 = "Kyiv";
		String city3;
		city3 = "Moscow";
		
		System.out.println("From " + city1 + " to" + " is" + " $500. \nFrom " + city2 + " to " + city1 + " is $550. "
				+ "\nI have been to " + city1 + ", " + city3 + ", " + city2 + ".");
		
		String app ="Slack";
		//We use <Slack> for messaging with Classmates
		System.out.println("We use " + app + " for messaging with Classmates");
		
		app = "Skype" + " and " + "Slack";
		System.out.println("We use " + app + " for messaging with Classmates");
		
		
	}

}
