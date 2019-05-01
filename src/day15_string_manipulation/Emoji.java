package day15_string_manipulation;

public class Emoji {
	public static void main(String[] args) {
		/*
		 * 		○ check first char:
		○ :
			§ check second character:
			§ ) ==> smile
			§ ( ==> sad
			§ / ==> upset
			§ p ==> playful
			 Negative:
		    if not 2 characterss:
			§ "invalid emoji"
			§ stop the code ==> return

		 */
		
		String emoji = ":";
		// ==, != Check if it is not equal to 2 characters
		
		if(emoji.length() !=2) {
			System.out.println("Invalid emoji");
			return;//stop execution
		}
		//if code reaches this point, then emoji is 2 chars
		//get first and second chars and assign to variables
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first == ':') {
			if(second == ')') {
				System.out.println("smile");
			}else if(second == '(');
				System.out.println("sad");
			}else if(second == '/') {
				System.out.println("upset");
			}else if(second == 'P') {
				System.out.println("playful");
			}else {
				System.out.println("unknown emoji");
			}
		 if(first == ';') {
			if(second ==')') {
				System.out.println("wink");
			}else if(second == '0') {
				System.out.println("surprised");
			}else if(first == '(') {
			if(second == ':') {
				System.out.println("sad");
			}else if(first == ')') {
			if(second == ':') {
				System.out.println("smile");
			}
			}else {
			System.out.println("Invalid emoji");
			}
		
			}
		 }
	}
}

