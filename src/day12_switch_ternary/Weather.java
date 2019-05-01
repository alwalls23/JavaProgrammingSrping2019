package day12_switch_ternary;
import java.util.*;
public class Weather {
	public static void main(String[] args) {
		/*
		 * Class Weather
		 * String weather
		 * sunny - "Go to the park"
		 * 			"Code Java"
		 * hot - "Go swimming"
		 * 			"Code Java"
		 * windy - "Fly a kite"
		 * 			"code java"
		 * rainy - "go shopping"
		 * 			"code java"
		 * snow - "Chain your tires"
		 * 			"code java"
		 * default - "Code java in any other weather"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather today?");
		String weather = scan.next().toLowerCase();//.toLowerCase() to convert to lower case
		switch(weather) {
		case "sunny":
			System.out.println("Go to the park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "rainy":
			System.out.println("Go Shopping");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Chain your tires");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any other weather");
			
	}
		System.out.println("### END OF PROGRAM ###");
	}
}
