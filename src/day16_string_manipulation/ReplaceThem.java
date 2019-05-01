package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);

		// replace , with !!!

		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);

		// String mixed = "@#$|%^j-a|va*-&^%$#";
		String mixed = "&^@#j$a-v|a@#$";

		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);

//		mixed = mixed.replace("$", "");
//		mixed = mixed.replace("=", "");
//		mixed = mixed.replace("|", "");

		mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);

		mixed = mixed.replace("a", "");
		System.out.println(mixed);

		String result = "About 115,000,000 results (0.59 seconds)";
		// using replace, get number of results
		// 115,000,000

		result = result.replace("About ", "");// 115,000,000 results (0.59 seconds)
//		result = result.replace("About ", "").replace(" results (0.59 seconds)", ""); might break when number changes
		result = result.substring(0, result.indexOf(" "));
		System.out.println(result);

		result = result.replace(",", "");
		System.out.println(result);

	}
}
