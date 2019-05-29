package day49_inheritance2_2;

import day49_inheritance2.*;
//iPad IS-A Device. iPad is a subclass in a different package
public class IPad extends Device {
	public void readEBook(String title) {
		System.out.println("Reading a book " + title + " using " + brand + " iPad");
		System.out.println("Model - "+model);
//		System.out.println("Price: "+price); not inherited
//		System.out.println("made in "+country);not visible
	}
}
