package day63_exceptions2;

import java.io.IOException;

public class ThrowAndThrows {
	public static void main(String[] args) {
		System.out.println("hello world");
//	throw new RuntimeException("This is throw using throw keyword");
		String username = "";
		if (username.isEmpty()) {
			throw new RuntimeException("UserName cannot be empty");
		} else {
			System.out.println("Valid username");
		}
		// throwing checked exception
		// handle - declare
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
		sleep(2);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	// declare using throws keyword
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}

}
