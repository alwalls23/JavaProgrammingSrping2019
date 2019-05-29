package office_hours_review_session;

import java.util.Formatter;
import java.text.DecimalFormat;

public class Converter {
	public static void main(String[] args) {
		System.out.println(milesToKms(10));
		System.out.println(milesToKms(70));
		double km = milesToKms(45);
		System.out.println(km);
		System.out.println(multiply(4, 8));
		System.out.println(milesToKms(10));
		double litersValue = gallonsToLiters(15);
		// format to 2 decimal points only
		DecimalFormat dm = new DecimalFormat("#.##");
		System.out.println(dm.format(litersValue));
		// get rid of decimal point value
		System.out.println(Math.floor(litersValue));

	}

	public static double milesToKms(double miles) {
		// double kmValue = miles * 1.609;
		double kmValue = multiply(miles, 1.609);
		return kmValue;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

// multiply the volume value by 3.785
	public static double gallonsToLiters(double gallons) {
		// local variable - variable declared in method
		double literValue = multiply(gallons, 3.785);
		return literValue;
	}
}
