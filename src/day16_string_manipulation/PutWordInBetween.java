package day16_string_manipulation;

public class PutWordInBetween {
	public static void main(String[] args) {
		String chars = "<<>>";
		String word = "Java";
		String result;

		result = chars.substring(0, 2) + word + chars.substring(2);
		System.out.println(result);

	}
}
