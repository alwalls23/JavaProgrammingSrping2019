package day42_customclasses_encapsulation;
import java.util.*;
public class Starbucks {
	public static void main(String[] args) {
		//declare an array that can store 2 Coffee objects
		//int [] nums = new int[2];
		//String[] str = new String[3];
		//str[0] = "java";
		
		//declare coffeeArray that can store 2 coffee objects
		Coffee [] coffeeArray = new Coffee[2];
		coffeeArray [0] = new Coffee();
		coffeeArray[0].setCoffeeInfo("expresso", "tall", 2.55, 200);
		coffeeArray[0].getCoffeeInfo();
		//create a single object first
		Coffee latte = new Coffee();
		//assign data
		latte.setCoffeeInfo("cafe latte", "grande", 3.85, 190);
		//assign the latte object to index 1 of the array
		coffeeArray[1] = latte;
		
		
	}
}
