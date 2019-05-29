package day50_inheritance03;

public class App {
	/*
	 * encapsulated name one-arg constuctor
	 * 
	 * IPhoneApp:
	 * encapsulated developer
	 * 
	 * AndroidApp:
	 * encapsulated developer
	 */
	private String name;
	public static int count;
	//one arg constuctor
	public App(String name) {
		this.name = name;
	}
	
	public static void build(String languange) {
		System.out.println("App was built using "+ languange);		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
