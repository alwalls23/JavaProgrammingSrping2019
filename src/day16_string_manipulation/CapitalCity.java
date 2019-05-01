package day16_string_manipulation;

public class CapitalCity {
	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		// Baku, Azerbaijan

		str = str.replaceAll("Moscow", "Baku").replaceAll("Russia", "Azerbaijan");
		System.out.println(str);

		String email = "firstName_lastName@gmail.com";

		String company = "capitalone";

		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);

	}
}
