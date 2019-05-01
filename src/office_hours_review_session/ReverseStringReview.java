package office_hours_review_session;

public class ReverseStringReview {
	public static void main(String[] args) {
		String today = "tuesday";
		// print tues
		// print day
		String t = today.substring(0, 4);
		String d = today.substring(4);
		System.out.println(t + "\n" + d);

		System.out.println(today.substring(2, 3));
		System.out.println(today.substring(4, 5));// d
		System.out.println(today.charAt(4));// d
		int i = 4;
		System.out.println(today.charAt(i));

		for (int j = 0; j < today.length(); j++) {
			System.out.println(today.charAt(j));
		}

		// 0123456
		// "tuesday"; print in reverse order
		for (int j = today.length() - 1; j >= 0; j--) {
			System.out.print(today.charAt(j) + " ");
		}
		System.out.println();
		for (int m = today.length() - 1; m >= 0; m--) {
			System.out.print(today.substring(m, m + 1) + " ");
		}
		System.out.println();
		// assign to variable
		String word = "eclipse";
		String reversed = "";
		// 876543210
		for (int r = word.length() - 1; r >= 0; r--) {
			// System.out.print(word.charAt(r));
			// read character and add to reversed
			reversed += word.charAt(r);
		}
		System.out.println(reversed);

		// check if it palindorome
		// civic
		// mom
		// dad
		// madam --> racecar -->

		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
