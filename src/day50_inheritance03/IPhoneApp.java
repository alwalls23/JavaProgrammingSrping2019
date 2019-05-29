package day50_inheritance03;

public class IPhoneApp extends App{
	public IPhoneApp() {//empty constructor
		super("iPhone App - unknown");// super() keyword is used to called parent class App
	}
	
	public IPhoneApp(String name) {//one arg-constructor
		super(name);
	}
	
}
