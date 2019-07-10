package day54_inheritance_review_session;

class Animals {

	public Animals() {
		System.out.println("Tiger");
	}

}

public class Constructor_Super1 {
	public Constructor_Super1() {
		super();
	}

	public Constructor_Super1(int a) {
		super();
	}

	public Constructor_Super1(double a) {
		super();
	}

	public static void main(String[] args) {
		new Constructor_Super1(10.5);
	}
}
