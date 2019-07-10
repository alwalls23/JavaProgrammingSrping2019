package day55_abstraction;

public abstract class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void speak(); // so we cannot have abstract methods in regular classes

	public abstract void eat();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
