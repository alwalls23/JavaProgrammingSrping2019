package day60_polymorphism02;

public class AppleWatch extends AppleDevice {
	
	public double weight = 50;
	
	@Override
	public void use() {
		System.out.println("AppleWatch | Sport | Check Time | Call | Text");
	}
	
	public void wear() {
		System.out.println("Wearing Hermes Apple Watch");
	}
}
