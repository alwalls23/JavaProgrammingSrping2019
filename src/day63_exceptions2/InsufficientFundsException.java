package day63_exceptions2;
//CUSTOM UNCHECKED EXCEPTION. EXTENDS RUNTIME EXCEPTION
public class InsufficientFundsException extends RuntimeException{
	public InsufficientFundsException() {
		
	}
	public InsufficientFundsException(String message) {
		super(message);
	}
}
