package day34_methods06;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		printWords("red", "blue", "yellow");// 3 values
		printWords("grey"); // 1 value
		printWords();// empty. so array will be empty value
		String[] myPets = {"cat", "horse", "dog", "sheep", "goat"};
		printWords(Arrays.toString(myPets));//prints in array format
		printWords(myPets);

		System.out.println(sumint(3, 5, 10));

		int budget = 200;
		if (sumint(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
		} else {
			System.out.println("Broke");
		}

		int total = sumint(234, 43, 567, 12, 34, 15);
		System.out.println("total: " + total);
		
		Cook("Burrito Bowl", "Rice", "Beans", "Meat", "Sour Cream", "Cheese", "Salsa", "Hot Sauce");
		Cook("Avocado Toast", "Avocado", "Sunny Side eggs", "White Bread");
		shoppingList(1000, "Avocado Toast", "Swatch Watch watch Watch", "Shoes", "Jacket");
		
		

	}

	// handle it like an Array
	public static void printWords(String... words) {
		for (String w : words) {
			System.out.println(w);
		}
	}

	public static int sumint(int... nums) {
		int sum = 0;
		for (int n : nums) {
			sum += n;// sum = sum + n

		}
		return sum;
	}
	
	public static void Cook(String name, String...ings) {
		System.out.println("Food: "+name);
		System.out.println(Arrays.toString(ings));
	}
	
	public static void shoppingList(int totalPrice, String...items) {
		System.out.print("Total Cost: "+totalPrice+" ");
		System.out.println(Arrays.toString(items));
	}
}
