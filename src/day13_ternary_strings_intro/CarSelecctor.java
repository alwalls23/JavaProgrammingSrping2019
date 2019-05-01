package day13_ternary_strings_intro;
import java.util.*;
public class CarSelecctor {
	public static void main(String[] args) {
		/*
		 * 1. American: Ford, Dodge, Tesla, Chevrolet, Lincoln
		 * 	Average Price: 33000
		 * 2. Japanese: Toyota, Mitsubisi, Honda, Subaru, Mazda
		 *  Average Price: 32000
		 * 3. German: BMW, VW, Audi, Mercedes, Porsche
		 *  Average Price: 55000
		 * 4. Italian: Alfa Romeo, Ferrari, Lamborghini, Fiat
		 *  Average Price: 85000
		 *  5. Korean: Kia, Hyundai, Daewoo
		 *   Average Price: 25000
		 *   
		 *   Scanner: 
		 *   Which type of type of car you are interested in?
		 *   
		 *   int carType => 1,2,3,4,5
		 *   double averagePrice
		 *   String carOptions
		 *   Do not print within cases, just a value assignment
		 *   
		 *   After switch statement print result:
		 *   You selected carType car and you options are carOptions
		 *   Average Price: averagePrice
		 *   
		 *   For Invalid selections:
		 *   "Car type not available"
		 */
		Scanner car = new Scanner(System.in);
		int carType;
		double averagePrice = 0.0;
		String carOptions = "";
		
		System.out.println("Which type of car are you interested in?");
		System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean");
		carType = car.nextInt();
		String carOrigin = "";
		
		switch(carType) {
		case 1:
			carOrigin = "American";
			carOptions = "Ford, Dodge, Tesla, Chevorlet, Lincoln";
			averagePrice = 33000.0;
			break;
		case 2: 
			carOrigin = "Japanese";
			carOptions = "Toyota, Mitsubisi, Honda, Subaru Mazda";
			averagePrice = 32000.0;
			break;
		case 3:
			carOrigin = "German";
			carOptions = "BMW, VW, Audi, Mercedes, Porsche";
			averagePrice = 55000.0;
			break;
		case 4:
			carOrigin = "Italian";
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			averagePrice = 85000.0;
			break;
		case 5:
			carOrigin = "Korean";
			carOptions = "Kia, Hyundai, Daewoo";
			averagePrice = 25000.0;
			break;
		default:
			System.out.println("Car type not available");
		return;//stop execution. Don't run rest of code
		}
		
		System.out.println("You selected "+carOrigin+" and your options are "+carOptions);
		System.out.println("Average Price: "+averagePrice);
			
	
	}
}
