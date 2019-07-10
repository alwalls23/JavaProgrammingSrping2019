package day55_abstraction;

public class Zoo {
	public static void main(String[] args) {
//		Animal animal = new Animal(); Cannot instantiate Animal class because it is abstract
		Cat Fluffy = new Cat("Fluffy");
		Fluffy.speak();
		Dog Poochi = new Dog("Rex");
		Poochi.speak();
	}
}