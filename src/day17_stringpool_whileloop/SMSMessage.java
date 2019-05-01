package day17_stringpool_whileloop;

import java.util.*;

public class SMSMessage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}

		String message = scan.nextLine();
		String sender;
		String phoneNumber;
		String messageBody;

		sender = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
		System.out.println("Sender: " + sender);
		phoneNumber = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
		System.out.println("Phone Number: " + phoneNumber);
		messageBody = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
		System.out.println("Message body: " + messageBody);

	}
}
