package java_homework_assignments;

import java.util.*;

public class No_94_ParseHTML {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();

		if (!html.contains("<html>")) {
			System.out.println("Invalid input!");
		} else {
			String attributeValue = html.substring(html.indexOf("id=\"") + 4,
					html.indexOf("\"", html.indexOf("id=") + 4));
			System.out.println(attributeValue);
		}

	}
}
