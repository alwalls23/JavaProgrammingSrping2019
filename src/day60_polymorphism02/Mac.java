package day60_polymorphism02;

public class Mac extends AppleDevice {
	
	public String model = "Mac is a computer";
	
	@Override
	public void use() {
		System.out.println("Mac | Computer | Code | Read book | Email");
	}
	
	public void code() {
		System.out.println("Coding Java with Mac");
	}
}
