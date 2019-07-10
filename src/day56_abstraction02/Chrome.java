package day56_abstraction02;

public class Chrome extends Browser {
	public Chrome(String name, int id) {
//		Super();
	}
	
	@Override
	public void navigate(String url) {
		System.out.println("Chrome - navigating to ");
	}

	public void displayWebpage() {
		System.out.println("Chrome - displaying webpage ");
	}

	public boolean launch() {
		System.out.println("Chrome is launching");
		System.out.println("1 2 3");
		return true;
	}

	public void close() {
		System.out.println("Exitting Netscape");
	}
}
