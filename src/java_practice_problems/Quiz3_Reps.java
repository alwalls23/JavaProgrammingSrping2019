package java_practice_problems;

import java.util.*;

public class Quiz3_Reps {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String model = scan.next();
		int year = scan.nextInt();
		boolean recalled = false;

		if (model.equals("Extravagant") && year == 2010) {
			System.out.println(!recalled);
		} else if (model.equals("Extravagant") && year == 2011) {
			System.out.println(!recalled);
		} else if (model.equals("Extravagant") && year == 2012) {
			System.out.println(!recalled);
		} else if (model.equals("Guzzler") && year == 2015) {
			System.out.println(!recalled);
		} else if (model.equals("Guzzler") && year == 2016) {
			System.out.println(!recalled);
		} else if (model.equals("Guzzler") && year == 2017) {
			System.out.println(!recalled);
		} else if (model.equals("Guzzler") && year == 2018) {
			System.out.println(!recalled);
		} else {
			System.out.println(recalled);
		}

		int statusCode = scan.nextInt();
		switch (statusCode) {
		case 200:
			System.out.println("OK (fulfilled)");
		case 401:
			System.out.println("unauthorized");
		case 403:
			System.out.println("forbidden");
		case 404:
			System.out.println("not found");
		case 500:
			System.out.println("server error");
		default:
			System.out.println("not supported status code");
		}
	}
}
