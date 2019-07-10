package day61_polymorphism03;

import java.util.Scanner;

import day49_inheritance2.TV;
import day60_polymorphism02.*;

public class MethodsUsingPolymorphism {

	public static void purchase(AppleDevice ap) {
		System.out.println("Purchasing: " + ap.getClass().getSimpleName());
	}

	public static void givemeAnyObject(Object object) {
		System.out.println("You gave me: " + object.getClass().getSimpleName());
	}

	// method buildAppDevice, return type: AppleDevice
	public static AppleDevice buildAppleDevice() {
		AppleDevice ap = new AppleWatch();
		/*
		 * You need to know inheritance hierarchy AppleDevice > iPod > Mac > Apple Watch
		 * By looking at the hierarchy
		 */
		return new Mac();
	}

	public static AppleDevice buildDevice(String type) {
		if (type.equals("ipad")) {
			return new iPad();
		} else if (type.equals("mac")) {
			return new Mac();
		} else if (type.equals("applewatch")) {
			return new AppleWatch();
		} else {
			return null;
		}

	}

	public static void main(String[] args) {
		purchase(new Mac());

		AppleDevice dev = new AppleWatch();
		purchase(dev);

		givemeAnyObject(new String("hi"));
		givemeAnyObject(new Scanner(System.in));
		givemeAnyObject(new TV());
		givemeAnyObject(55);

		Object tv = new TV();
		Object str = new String("java");

	}
}
