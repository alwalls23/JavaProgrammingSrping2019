package day49_inheritance2;

public class Leopard extends Animal{
	public Leopard() {
		super();//
		System.out.println("Leopard constructor");
		setType("Leopard");
	}
	
	public Leopard(String type) {
		super(type);// call Animal(String type) constructor
		System.out.println("Leopard one-arg constructor");
	}
}
