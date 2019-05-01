package day06_operators;

public class MinutesToHours 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minutes = 125;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		System.out.println(hours);
		System.out.println(remainingMinutes);
		 //"5 Hours and 10 minutes"
		System.out.println();
		System.out.print(minutes + " minutes is ");
		System.out.println(hours + " hours and " + remainingMinutes + " minutes");
		
	}

}
