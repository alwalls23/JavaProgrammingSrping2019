package day60_polymorphism02;

public class iPad extends AppleDevice{
	
	public double maxScreenSize = 15.3;
	
	@Override
	public void use() {
		System.out.println("iPad | Music | Read Book | Cartoon");
	}
	
	public void draw() {
		System.out.println("Drawing shapes with iPad!");
	}
}
