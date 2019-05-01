package day07_scanner_operators;

public class EnoughPizza {

	public static void main(String[] args) {
		//slices in pizza -> 8
		//slices per student -> 2
		
		int pizzaCount= 40;
		int studentsCount = 145;
		
		boolean isEnoughPizza = pizzaCount * 8 >= studentsCount * 2;
		//boolean isEnoughPizza = pizzaCount * 8 / studentsCount >= 2;
		
		System.out.println("Is there enough pizza? " + isEnoughPizza);
		
	}
}
