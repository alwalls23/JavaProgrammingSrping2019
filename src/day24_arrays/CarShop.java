package day24_arrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
		//BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		//Step 1 create an array of strings, on store these cars inside that array
		
		String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
//		String[] cars2 = new String[8];
		//Step 2: Print car names that stars with M
		for (String c: cars) {
			if(!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}
		//Step 3: Print all cars that have letter "r" somewhere in the name
		//Please make your search case insensitive
		for (String c2 : cars) {
			if(c2.toLowerCase().contains("r")) {
				System.out.println(c2);
			}
		}
		//Step 4
		for (String c3 : cars) {
			if(!c3.endsWith("a")) {
				continue;
			}
			System.out.println(c3);
		}
		System.out.println("**************************************");
		for (String b : cars) {
			if(b.endsWith("a")) {
				System.out.println(b);
			}
		}
		System.out.println("****************************************");
		//Step 5 Print all cars that have at least 6 letters in the name
		for (String car : cars) {
			if(car.length()> 5) {
				System.out.println(car);
			}
		}
		System.out.println("*****************************************");
		for (int i = 0; i < cars.length; i++) {
			String car = cars[i];
			if(car.length() >6) {
				System.out.println(car);
			}
		}
		//Step 6: Swap first and last value value in the array
		//first value: cars[i]  last value: cars[cars.length-1]
		System.out.println("*******************************************");
		//create a temp variable, that will b=get a value of first element
		String temp = cars[0];
		cars[0] = cars[cars.length-1];
		cars[cars.length-1] = temp;
		System.out.println(Arrays.toString(cars));
		
		System.out.println("*************************************************");
		cars[cars.length-1] = temp;
		System.out.println("Before soting");
		System.out.println(Arrays.toString(cars));
		System.out.println("Position: "+Arrays.binarySearch(cars,  "Ford"));				
	}
}
