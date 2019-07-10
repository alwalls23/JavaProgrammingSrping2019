package day56_abstraction02;

public class Netscape extends Browser {
//	public abstract void navigate(String url);
	@Override
	public void navigate(String url) {
		System.out.println("Netscape - navigating to ");
	}

//	public abstract void displayWebpage();
	public void displayWebpage() {
		System.out.println("Netscape - displaying webpage ");
	}

//	public abstract boolean launch();
	public boolean launch() {
		System.out.println("Netscape is launching");
		System.out.println("1 2 3");
		return true;
	}

	public void close() {
		System.out.println("Exitting Netscape");
	}

}
