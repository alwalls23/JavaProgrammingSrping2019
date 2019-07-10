package day61_polymorphism03;

import day60_polymorphism02.*;

public class DownCasting {
	public static void Main(String[] args) {
		AppleDevice appDev = new iPad();
		// appDev can access use method, startingPrice variable
		appDev.use();
		// appDev.draw(); not accessible
		// hot call draw method from iPad

		iPad ipad = (iPad) appDev;
		ipad.use();
		ipad.draw();

	}
}
