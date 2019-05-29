package day50_inheritance03;

public class TestAnimals {
	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		an.move(10);
		cat.move(200);
		dog.move(30);
		duck.move(40);
		
	}
}
