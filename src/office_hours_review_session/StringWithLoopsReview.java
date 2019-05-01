package office_hours_review_session;

public class StringWithLoopsReview {
	public static void main(String[] args) {
		String day = "Monday";
		
		System.out.println(day.length());
		if(day.length() >= 6) {
			System.out.println("Possibly a valid day");
		}else {
			System.out.println("Days are normally 6 chars or longer!");
		}
		//compare strings
		String today = "Monday";
		
		if(day.equals(today)) {
			System.out.println("Monday is today");
		}else {
			System.out.println("Wrong day");
		}
		//variable day ==> "Monday, "Friday", "Sunday"
		
		if(day.equals("Monday") || day.equals("Friday") || day.equals("Sunday")) {
			System.out.println("Definitely a valid day");
		}else {
			System.out.println("Invalid day!");
		}
		//first check if it is 6 
		//nested if statement
		if(day.length() >= 6) {
			if(day.equals("Monday") || 
			   day.equals("Friday") || 
			   day.equals("Sunday")) {
				System.out.println("Definitely a valid day");
			}else {
				System.out.println("Invalid day!");
			}
		}
		
		//Monday ==> check if last 3 chars are "day"
		//endsWith method
		if(day.endsWith("day")) {
			System.out.println("It ends with 'day'");
		}else {
			System.out.println("Does not end with 'day'");
		}
		//substring ==> creates a partial string
		System.out.println(day.substring(3));
		if(day.substring(3).equals("day")) {
			System.out.println("last 3 are day");
		}else {
			System.out.println("last 3 are not day");
		}
		
		//substring with length together and make it
		//more capable
		String myDay = "Saturday";
		System.out.println(myDay.substring(3));
		System.out.println(myDay.substring(1, 5));
		System.out.println(myDay.length());
		System.out.println(myDay.substring(5));
		System.out.println(myDay.substring(myDay.length()-3));
		
		String last3 = myDay.substring(myDay.length()-3);
		boolean check = last3.equals("day");
		System.out.println(check);
		
		//print each char in new line
		//charAt ==> reads a single character at an index
		
		System.out.println(myDay.charAt(0));//print first character
		System.out.println(myDay.charAt(myDay.length()-1));//print last character
		//Saturday
		for (int i = 0; i < myDay.length(); i++) {
			System.out.println(myDay.charAt(i));
			
			
			
		}
	}
}
