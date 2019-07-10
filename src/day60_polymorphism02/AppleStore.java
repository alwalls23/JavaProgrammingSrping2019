package day60_polymorphism02;

public class AppleStore {
	public static void main(String[] args) {
		AppleDevice mac = new Mac();
		mac.use();
		// mac.code(); code is not visible.
		// AppleDevice method only can be called

		Mac myMac = new Mac();
		myMac.use();
		myMac.code();

		AppleDevice watch = new AppleWatch();
		watch.use();
		
		AppleDevice dev1 = new Mac();
		System.out.println(dev1.startingPrice);
		
		AppleDevice dev2 = new iPad();
		System.out.println(dev2.startingPrice);
		
		iPad ipad = new iPad();
		System.out.println(ipad.startingPrice);
		System.out.println(ipad.maxScreenSize);

	}
}
