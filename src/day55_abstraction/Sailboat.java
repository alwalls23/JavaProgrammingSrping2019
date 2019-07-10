package day55_abstraction;

public class Sailboat extends Vehicle{
	
	private int length;
	

	public Sailboat(double price, int length) {
		super(0, price, "Sailboat", "wind");
		this.length = length;
	}

	@Override
	public void move() {
		System.out.println("Sails...");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
		

}
