package day63_exceptions2;

public class NeedSomeCoffeeException extends Throwable {
	public NeedSomeCoffeeException() {
		
	}
	
	public NeedSomeCoffeeException(String message) {
		super(message);
	}

}
