package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
		String quality = "bad";
		int rating = (quality.equals("good")) ? 100 : 0;
		
		System.out.println("Rating "+rating);
		
		int PMHour = 6;
		//Rush hour during evening: 4-7
		boolean rushHour = (PMHour >= 4 && PMHour <= 7) ? true : false;
		
		System.out.println(PMHour +"pm is rush hour? " + rushHour);
		
		String result = rushHour ? "Yes" : "No";
		
		System.out.println(result);
		
		//6-9
		
		int AMHour = 8;
		
		String amRushHour = AMHour >= 6 && AMHour <= 9 ? "Yes" : "No";
		System.out.println(AMHour + "am is rush hour? - "+amRushHour);
	}
}
