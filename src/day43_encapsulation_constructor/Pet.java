package day43_encapsulation_constructor;

public class Pet {
	private String type;
	private String name;
	
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public Pet() {
		System.out.println("No-args constructor");
		
	}
	
	public void speak() {
		switch(type.toLowerCase()) {
		case "cat":
			System.out.println("Myauu");
			break;
		case "dog":
			System.out.println("gav gav | woof woof | waw waw");
			break;
		case "bird":
			System.out.println("chik chirik");
			break;
		case "goat":
			System.out.println("mhaaaa mhaaaa");
			break;
		case "sheep":
			System.out.println("bhaaaa bhaaa");
			break;
		case "rooster":
			System.out.println("u uruuu uuuu");
			break;
			default:
				System.out.println(".....");
		}
	}

	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}
	
}
