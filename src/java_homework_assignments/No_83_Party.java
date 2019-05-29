package java_homework_assignments;

import java.util.*;

public class No_83_Party {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";
		System.out.println("Please enter guest name:");
		String guestList = input.next();
		System.out.println("Do you want to enter new guest name:");
		answer = input.next();
		while (answer.equalsIgnoreCase("yes")) {
			System.out.println("Please enter guest name:");
			guestList += ", " + input.next();
			System.out.println("Do you want to enter new guest name:");
			answer = input.next();
			if (answer.equalsIgnoreCase("no"))
				System.out.println("Guest's list: " + guestList);
		}
	}
}