package day55_abstraction;

public abstract class Mammal extends Animal{
	public Mammal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public abstract void produceMilk();
	
	public abstract void eat();
}
