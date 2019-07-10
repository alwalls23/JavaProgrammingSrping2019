package day63_exceptions2;

public class CustomExceptionsTest {
public static void main(String[] args) throws NeedSomeCoffeeException {
	double balance = 2000;
	double transaction = 210;
	
	if(transaction > balance) {
		throw new InsufficientFundsException("Balance is too low.");
	}else {
		System.out.println("Purchase successfull");
		balance-=transaction;
		System.out.println("Current balance: $"+balance);
	}
	throw new NeedSomeCoffeeException("getting sleepy...");
}
}
